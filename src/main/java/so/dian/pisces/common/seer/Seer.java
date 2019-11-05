package so.dian.pisces.common.seer;

import org.dmg.pmml.Value;
import org.dmg.pmml.*;
import org.jpmml.evaluator.*;
import org.xml.sax.SAXException;
import so.dian.pisces.config.SeerConfiguration;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Seer {

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
            e1.printStackTrace();
        } catch (JAXBException e1) {
            e1.printStackTrace();
        }finally {
            //关闭输入流
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ModelEvaluatorFactory modelEvaluatorFactory = ModelEvaluatorFactory.newInstance();
        Evaluator evaluator = modelEvaluatorFactory.newModelEvaluator(pmml);
        pmml = null;
        return evaluator;
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
                    // error log
                }
            } else {
                // warn log
            }

            FieldValue inputFieldValue = inputField.prepare(rawValue);
            arguments.put(inputFieldName, inputFieldValue);
        }
        Map<FieldName, ?> results = evaluator.evaluate(arguments);
        List<TargetField> targetFields = evaluator.getTargetFields();

        TargetField targetField = targetFields.get(0);
        FieldName targetFieldName = targetField.getName();

        Object targetFieldValue = results.get(targetFieldName);
//        System.out.println("target: " + targetFieldName.getValue() + " value: " + targetFieldValue);
        EnumMap<SeerReturnEnum, Object> ret = new EnumMap<>(SeerReturnEnum.class);
        ret.put(SeerReturnEnum.RESULT, targetFieldValue);
        ret.put(SeerReturnEnum.CATEGORICAL_INPUT_ISNULL_STAT, categoricalInputIsNullStat);
        return ret;
    }

    private static Map<String, Object> getValueMap(Field field) {
        Map<String, Object> map = new HashMap<>();
        Object object = new Object();
        List<Value> valueList = ((DataField) field).getValues();
        if (Objects.nonNull(valueList)) {
            String valueS;
            for (Value value : valueList) {
                valueS = value.getValue();
                if (Objects.nonNull(valueS)) {
                    map.put(valueS, object);
                } else {
                    // log
                }
            }
        }
        return map;
    }
    private static Object filter(Object rawValue) {
        if (rawValue == null) {
            // log
            return null;
        }

        if (rawValue instanceof Long) {
            return Double.parseDouble(rawValue.toString());
        } else if (rawValue instanceof Integer) {
            return Double.parseDouble(rawValue.toString());
        }
        return rawValue;
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

    public static Evaluator getEvaluator(){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("/Users/apple/Documents/xd/lightgbm_1017_Double_test.pmml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loadPmml(inputStream);
    }
}