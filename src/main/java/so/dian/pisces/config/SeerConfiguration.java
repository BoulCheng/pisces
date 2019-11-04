package so.dian.pisces.config;

import org.jpmml.evaluator.Evaluator;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.common.util.FileUtil;
import so.dian.pisces.manager.ForecastPastManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

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
            return Seer.loadPmml(FileUtil.getFileInputStream());
        } else {
            return evaluator;
        }
    }

    public Evaluator peekEvaluator() {
        Evaluator evaluator = arrayBlockingQueue.peek();
        if (evaluator == null) {
            // warn log
            return Seer.loadPmml(FileUtil.getFileInputStream());
        } else {
            return evaluator;
        }
    }

    public ForecastPastManager getForecastPastManager() {
        return this.forecastPastManager;
    }

    public boolean refresh() {
        this.arrayBlockingQueue = new ArrayBlockingQueue<>(this.evaluatorCount, false, this.evaluatorList);
        return true;
    }

    public static SeerConfiguration.Builder newBuilder(ForecastPastManager forecastPastManager) {
        return newBuilder(DEFAULT_EVALUATOR_COUNT, forecastPastManager);
    }

    public static SeerConfiguration.Builder newBuilder(Integer evaluatorCount, ForecastPastManager forecastPastManager) {
        if (Objects.isNull(evaluatorCount)) {
            throw new IllegalArgumentException("evaluatorCount can not be empty.");
        }

        if (Objects.isNull(forecastPastManager)) {
            throw new IllegalArgumentException("forecastPastManager can not be empty.");
        }

        return new SeerConfiguration.Builder(evaluatorCount, forecastPastManager);
    }

    private SeerConfiguration(Integer evaluatorCount, Integer recursiveDepth, List<Evaluator> evaluatorList, ArrayBlockingQueue<Evaluator> arrayBlockingQueue, ForecastPastManager forecastPastManager) {
        this.evaluatorCount = evaluatorCount;
        this.recursiveDepth = recursiveDepth;
        this.evaluatorList = evaluatorList;
        this.arrayBlockingQueue = arrayBlockingQueue;
        this.forecastPastManager = forecastPastManager;
    }

    public static class Builder {

        private Integer evaluatorCount;
        private Integer recursiveDepth;
        private List<Evaluator> evaluatorList;
        private ArrayBlockingQueue<Evaluator> arrayBlockingQueue;
        private ForecastPastManager forecastPastManager;

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
                this.evaluatorList.add(Seer.loadPmml(FileUtil.getFileInputStream()));
            }

            for (Evaluator evaluator : this.evaluatorList) {
                this.arrayBlockingQueue.offer(evaluator);
            }

            return new SeerConfiguration(this.evaluatorCount, this.recursiveDepth, this.evaluatorList, this.arrayBlockingQueue, this.forecastPastManager);
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

        private Builder(Integer evaluatorCount, ForecastPastManager forecastPastManager) {
            this.evaluatorCount = evaluatorCount;
            this.recursiveDepth = null;
            this.evaluatorList = null;
            this.arrayBlockingQueue = null;
            this.forecastPastManager = forecastPastManager;
        }
    }
}
