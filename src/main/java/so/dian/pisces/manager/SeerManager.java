package so.dian.pisces.manager;

import org.dmg.pmml.*;
import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.InputField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import so.dian.pisces.common.util.LocalDateUtils;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.BasicDataDTO;
import so.dian.pisces.domain.ForecastShopDayDO;
import so.dian.pisces.manager.task.SeerRecursiveTask;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @author yuanming
 * Created on 2019/10/17
 * Description
 */
@Service
public class SeerManager {
    private static final Object object = new Object();
    private static final ForkJoinPool forkJoinPool = new ForkJoinPool(6);

    @Autowired
    private BasicDataManager basicDataManager;

    @Autowired
    private ForecastPastManager forecastPastManager;

    public void predict() {
        LocalDate localDate = LocalDate.now();
        String date = LocalDateUtils.minusDays(localDate, 1);
        predict(date, SeerConfiguration.RecursiveTaskEnum.AMOUNT);
        date = LocalDateUtils.plusDays(localDate, 7);
        predict(date, SeerConfiguration.RecursiveTaskEnum.AMOUNT);
    }

    public void predict(String orderDate, SeerConfiguration.RecursiveTaskEnum recursiveTaskEnum) {
        SeerConfiguration seerConfiguration = SeerConfiguration.newBuilder(8, forecastPastManager, recursiveTaskEnum).build();
        Map<String, Map<String, Object>> pmmlCategoricalValuesMap = getCategoricalValues(seerConfiguration.peekEvaluator());
        seerConfiguration.setPmmlCategoricalValuesMap(pmmlCategoricalValuesMap);

        List<ForecastShopDayDO> forecastDOList;
        BasicDataDTO basicDataDTO = new BasicDataDTO(orderDate, 40000);
        Long total = basicDataManager.count(basicDataDTO);
        if (Objects.isNull(total) || total == 0) {
            // warn log
            return;
        }
        basicDataDTO.setPageCount(total);

        do {
            forecastDOList = basicDataManager.page(basicDataDTO);
//            SeerRecursiveTask seerRecursiveTask = new SeerRecursiveTask(SeerConfiguration.RECURSIVE_DEPTH_ZERO, 0, forecastDOList.size(), seerConfiguration, forecastDOList);
            ForkJoinTask<Long> forkJoinTask = forkJoinPool.submit(seerConfiguration.initRecursiveTask(recursiveTaskEnum, forecastDOList));

            if (forkJoinTask.isCompletedAbnormally()) {
                System.out.println(forkJoinTask.getException());
            }

            try {
                forkJoinTask.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } while (basicDataDTO.nextPage() <= basicDataDTO.getPageCount() && seerConfiguration.refresh());
    }


    private Map<String, Map<String, Object>> getCategoricalValues(Evaluator evaluator) {
        Map<String, Map<String, Object>> mapMap = new HashMap<>();
        List<InputField> inputFields = evaluator.getInputFields();
        FieldName inputFieldName;
        Field field;
        for (InputField inputField : inputFields) {
            inputFieldName = inputField.getName();
            field = inputField.getField();
            if (field instanceof DataField && OpType.CATEGORICAL.equals(field.getOpType())) {
                mapMap.put(inputFieldName.getValue(), getValueMap(field));
            }
        }
        return mapMap;
    }

    private static Map<String, Object> getValueMap(Field field) {
        Map<String, Object> map = new HashMap<>();
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

}
