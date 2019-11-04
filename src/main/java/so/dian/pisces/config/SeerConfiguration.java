package so.dian.pisces.config;

import org.jpmml.evaluator.Evaluator;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.common.util.FileUtil;
import so.dian.pisces.domain.ForecastShopDayDO;
import so.dian.pisces.manager.ForecastPastManager;
import so.dian.pisces.manager.task.ForecastFutureAmountRecursiveTask;
import so.dian.pisces.manager.task.SeerAmountRecursiveTask;
import so.dian.pisces.manager.task.SeerRecursiveTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description
 */
public final class SeerConfiguration {
    private static final Integer DEFAULT_EVALUATOR_COUNT = 1 << 2;
    private static final Integer MAXIMUM_EVALUATOR_COUNT = 1 << 5;
    public static final Integer RECURSIVE_DEPTH_ZERO = 0;


    private Integer evaluatorCount;
    private Integer recursiveDepth;
    private List<Evaluator> evaluatorList;
    private ArrayBlockingQueue<Evaluator> arrayBlockingQueue;
    private ForecastPastManager forecastPastManager;
    private RecursiveTaskEnum recursiveTaskEnum;
    private Map<String, Map<String, Object>> pmmlCategoricalValuesMap;

    public void setPmmlCategoricalValuesMap(Map<String, Map<String, Object>> pmmlCategoricalValuesMap) {
        this.pmmlCategoricalValuesMap = pmmlCategoricalValuesMap;
    }

    public boolean check(String inputFieldName, String rawValue) {
        Map map = pmmlCategoricalValuesMap.get(inputFieldName);
        if (Objects.nonNull(map) && Objects.nonNull(map.get(rawValue))) {
            return true;
        }
        return false;
    }

    public Integer getRecursiveDepth() {
        return recursiveDepth;
    }

    public Evaluator getNextEvaluator() {
        Evaluator evaluator = arrayBlockingQueue.poll();
        if (evaluator == null) {
            // warn log
            return Seer.loadPmml(FileUtil.getFileInputStream(this.recursiveTaskEnum));
        } else {
            return evaluator;
        }
    }

    public Evaluator peekEvaluator() {
        Evaluator evaluator = arrayBlockingQueue.peek();
        if (evaluator == null) {
            // warn log
            return Seer.loadPmml(FileUtil.getFileInputStream(this.recursiveTaskEnum));
        } else {
            return evaluator;
        }
    }

    public ForecastPastManager getForecastPastManager() {
        return this.forecastPastManager;
    }

    public RecursiveTaskEnum getRecursiveTaskEnum() {
        return this.recursiveTaskEnum;
    }

    public boolean refresh() {
        this.arrayBlockingQueue = new ArrayBlockingQueue<>(this.evaluatorCount, false, this.evaluatorList);
        return true;
    }

    public static SeerConfiguration.Builder newBuilder(ForecastPastManager forecastPastManager, RecursiveTaskEnum recursiveTaskEnum) {
        return newBuilder(DEFAULT_EVALUATOR_COUNT, forecastPastManager, recursiveTaskEnum);
    }

    public static SeerConfiguration.Builder newBuilder(Integer evaluatorCount, ForecastPastManager forecastPastManager, RecursiveTaskEnum recursiveTaskEnum) {
        if (Objects.isNull(evaluatorCount)) {
            throw new IllegalArgumentException("evaluatorCount can not be empty.");
        }

        if (Objects.isNull(forecastPastManager)) {
            throw new IllegalArgumentException("forecastPastManager can not be empty.");
        }

        if (Objects.isNull(recursiveTaskEnum)) {
            throw new IllegalArgumentException("recursiveTaskEnum can not be empty.");
        }

        return new SeerConfiguration.Builder(evaluatorCount, forecastPastManager, recursiveTaskEnum);
    }

    private SeerConfiguration(Integer evaluatorCount, Integer recursiveDepth, List<Evaluator> evaluatorList, ArrayBlockingQueue<Evaluator> arrayBlockingQueue, ForecastPastManager forecastPastManager, RecursiveTaskEnum recursiveTaskEnum) {
        this.evaluatorCount = evaluatorCount;
        this.recursiveDepth = recursiveDepth;
        this.evaluatorList = evaluatorList;
        this.arrayBlockingQueue = arrayBlockingQueue;
        this.forecastPastManager = forecastPastManager;
        this.recursiveTaskEnum = recursiveTaskEnum;
    }

    public static class Builder {

        private Integer evaluatorCount;
        private Integer recursiveDepth;
        private List<Evaluator> evaluatorList;
        private ArrayBlockingQueue<Evaluator> arrayBlockingQueue;
        private ForecastPastManager forecastPastManager;
        private RecursiveTaskEnum recursiveTaskEnum;

        public SeerConfiguration.Builder evaluatorCount(Integer evaluatorCount) {
            this.evaluatorCount = evaluatorCount;
            return this;
        }

        public final SeerConfiguration build() {
            this.evaluatorCount = powerOfTwoWithGreaterThan1(this.evaluatorCount);
            this.recursiveDepth = log2(this.evaluatorCount);
            this.evaluatorList = new ArrayList<>();
            this.arrayBlockingQueue = new ArrayBlockingQueue<>(this.evaluatorCount);

            for (int i = 0; i < this.evaluatorCount; i++) {
                this.evaluatorList.add(Seer.loadPmml(FileUtil.getFileInputStream(this.recursiveTaskEnum)));
            }

            for (Evaluator evaluator : this.evaluatorList) {
                this.arrayBlockingQueue.offer(evaluator);
            }

            return new SeerConfiguration(this.evaluatorCount, this.recursiveDepth, this.evaluatorList, this.arrayBlockingQueue, this.forecastPastManager, this.recursiveTaskEnum);
        }

        /**
         * @return log2(n)
         */
        private int log2(int n) {
            int r = 0;
            do {
                n = n >> 1;
                r++;
            } while (n > 1);

            return r;
        }

        private int powerOfTwoWithGreaterThan1(int count) {
            int i = powerOfTwo(count);
            return i <= 1 ? 2 : i;
        }

        /**
         * Returns a power of two size for the given target count.
         */
        private int powerOfTwo(int count) {
            int n = count - 1;
            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
            return (n < 0) ? 1 : (n >= MAXIMUM_EVALUATOR_COUNT) ? MAXIMUM_EVALUATOR_COUNT : n + 1;
        }

        private Builder(Integer evaluatorCount, ForecastPastManager forecastPastManager, RecursiveTaskEnum recursiveTaskEnum) {
            this.evaluatorCount = evaluatorCount;
            this.recursiveDepth = null;
            this.evaluatorList = null;
            this.arrayBlockingQueue = null;
            this.forecastPastManager = forecastPastManager;
            this.recursiveTaskEnum = recursiveTaskEnum;
        }
    }

    public enum RecursiveTaskEnum {
        /**
         * 订单任务
         */
        ORDER,
        /**
         * 支付金额任务
         */
        AMOUNT,

        /**
         * 预测未来订单任务
         */
        FUTURE_ORDER,

        /**
         * 预测未来支付金额任务
         */
        FUTURE_AMOUNT;

        public boolean isPast() {
            if (ORDER.equals(this) || AMOUNT.equals(this)) {
                return true;
            }
            return false;
        }

        public boolean isFuture() {
            if (FUTURE_ORDER.equals(this) || FUTURE_AMOUNT.equals(this)) {
                return true;
            }
            return false;
        }

        public boolean isOrder() {
            if (ORDER.equals(this) || FUTURE_ORDER.equals(this)) {
                return true;
            }
            return false;
        }

        public boolean isAmount() {
            if (AMOUNT.equals(this) || FUTURE_AMOUNT.equals(this)) {
                return true;
            }
            return false;
        }
    }

    public RecursiveTask<Long> initRecursiveTask(RecursiveTaskEnum recursiveTaskEnum, List<ForecastShopDayDO> forecastDOList) {
        if (RecursiveTaskEnum.ORDER.equals(recursiveTaskEnum)) {
            return new SeerRecursiveTask(SeerConfiguration.RECURSIVE_DEPTH_ZERO, 0, forecastDOList.size(), this, forecastDOList);
        } else if (RecursiveTaskEnum.AMOUNT.equals(recursiveTaskEnum)) {
            return new SeerAmountRecursiveTask(SeerConfiguration.RECURSIVE_DEPTH_ZERO, 0, forecastDOList.size(), this, forecastDOList);
        } else if (RecursiveTaskEnum.FUTURE_ORDER.equals(recursiveTaskEnum)) {

        } else if (RecursiveTaskEnum.FUTURE_AMOUNT.equals(recursiveTaskEnum)) {
            return new ForecastFutureAmountRecursiveTask(SeerConfiguration.RECURSIVE_DEPTH_ZERO, 0, forecastDOList.size(), this, forecastDOList);
        }
        return null;
    }
}
