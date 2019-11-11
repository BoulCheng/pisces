package so.dian.pisces.common.seer;

import org.dmg.pmml.*;
import org.jpmml.evaluator.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import so.dian.pisces.config.SeerConfiguration;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Seer {
    private static Logger log = LoggerFactory.getLogger(Seer.class);

    public enum SeerReturnEnum {
        RESULT,
        CATEGORICAL_INPUT_ISNULL_STAT,
        EXCEPTION,
    }

    public static Evaluator loadPmml(InputStream is){
        PMML pmml = new PMML();
        if(is == null){
            return null;
        }
        try {
            pmml = org.jpmml.model.PMMLUtil.unmarshal(is);
        } catch (SAXException e1) {
            log.error("loadPmml error", e1);
        } catch (JAXBException e2) {
            log.error("loadPmml error", e2);
        } finally {
            //关闭输入流
            try {
                is.close();
            } catch (IOException e) {
                log.error("loadPmml error", e);
            }
        }
        ModelEvaluatorFactory modelEvaluatorFactory = ModelEvaluatorFactory.newInstance();
        return modelEvaluatorFactory.newModelEvaluator(pmml);
    }

    public static EnumMap<SeerReturnEnum, Object> predict(Evaluator evaluator, Map<String, Object> data, SeerConfiguration seerConfiguration) {
        List<InputField> inputFields = evaluator.getInputFields();
        Map<FieldName, FieldValue> arguments = new LinkedHashMap<>();
        int categoricalInputIsNullStat = 0;
        FieldName inputFieldName;
        Object rawValue;
        for (InputField inputField : inputFields) {
            inputFieldName = inputField.getName();
            rawValue = data.get(inputFieldName.getValue());
            Field field = inputField.getField();
            if (field instanceof DataField) {
                if (OpType.CONTINUOUS.equals(field.getOpType()) || OpType.ORDINAL.equals(field.getOpType())) {
                    if (Objects.nonNull(rawValue) && !(rawValue instanceof Double)) {
                        rawValue = Double.parseDouble(rawValue.toString());
                    }
                } else if (OpType.CATEGORICAL.equals(field.getOpType())) {
                    if (DataType.DOUBLE.equals(field.getDataType()) && Objects.nonNull(rawValue)) {
                        rawValue = Double.parseDouble(rawValue.toString());
                    }
                    if (Objects.isNull(rawValue)) {
                        categoricalInputIsNullStat++;
                    } else if (!seerConfiguration.check(inputFieldName.getValue(), rawValue.toString())) {
                        rawValue = null;
                        categoricalInputIsNullStat++;
                    }
                } else {
                    log.error("not found OpType:{}", field.getOpType());
                }
            } else {
                log.error("field is not DataField, field:{}", field);
            }

            FieldValue inputFieldValue = inputField.prepare(rawValue);
            arguments.put(inputFieldName, inputFieldValue);
        }
        Map<FieldName, ?> results = evaluator.evaluate(arguments);
        List<TargetField> targetFields = evaluator.getTargetFields();

        TargetField targetField = targetFields.get(0);
        FieldName targetFieldName = targetField.getName();

        Object targetFieldValue = results.get(targetFieldName);
        EnumMap<SeerReturnEnum, Object> ret = new EnumMap<>(SeerReturnEnum.class);
        ret.put(SeerReturnEnum.RESULT, targetFieldValue);
        ret.put(SeerReturnEnum.CATEGORICAL_INPUT_ISNULL_STAT, categoricalInputIsNullStat);
        return ret;
    }

    private static Object filter(InputField inputField, Object rawValue) {
        if (rawValue == null) {
            // log
            return null;
        }

        Field field = inputField.getField();
        if (field instanceof DataField) {
            if (OpType.CONTINUOUS.equals(field.getOpType())) {
                List<Interval> intervalList = ((DataField) field).getIntervals();
                if (intervalList != null && intervalList.size() > 0) {
                    Interval interval = intervalList.get(0);
                    Double input;
                    if (rawValue instanceof Double) {
                        input = (Double) rawValue;
                    } else {
                        // log
                        input = Double.parseDouble(rawValue.toString());
                    }

                    if ((interval.getLeftMargin() != null && interval.getLeftMargin().compareTo(input) > 0) ||
                            (interval.getRightMargin() != null && interval.getRightMargin().compareTo(input) < 0)) {
                        // log
                        return null;
                    }
                }
            }
        }
        return rawValue;
    }
}