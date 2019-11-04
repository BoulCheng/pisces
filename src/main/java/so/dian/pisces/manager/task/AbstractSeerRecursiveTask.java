package so.dian.pisces.manager.task;


import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.*;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/11/4
 * Description
 */
public abstract class AbstractSeerRecursiveTask extends RecursiveTask<Long> {

    protected int currDepth;
    protected int begin;
    protected int end;
    protected SeerConfiguration seerConfiguration;
    protected List<ForecastShopDayDO> forecastDOList;

    public AbstractSeerRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        this.currDepth = currDepth;
        this.begin = begin;
        this.end = end;
        this.seerConfiguration = seerConfiguration;
        this.forecastDOList = forecastDOList;
    }

    @Override
    protected Long compute() {
        if (this.currDepth == seerConfiguration.getRecursiveDepth()) {
            execute();
        } else {
            int middle = (begin + end) / 2;
            currDepth++;
            RecursiveTask seerRecursiveTask = newRecursiveTask(currDepth, begin, middle, seerConfiguration, forecastDOList);
            RecursiveTask seerRecursiveTask2 = newRecursiveTask(currDepth, middle, end, seerConfiguration, forecastDOList);

            seerRecursiveTask.fork();
            seerRecursiveTask.join();

            seerRecursiveTask2.fork();
            seerRecursiveTask2.join();
        }
        return null;
    }

    protected abstract void execute();

    protected abstract RecursiveTask newRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList);
}
