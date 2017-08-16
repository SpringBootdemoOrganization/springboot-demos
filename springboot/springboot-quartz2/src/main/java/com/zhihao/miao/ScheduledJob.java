package com.zhihao.miao;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/16
 * @since 1.0
 */
@Component
public class ScheduledJob extends QuartzJobBean {

    private JobCornBean jobCornBean;


    @Override
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {
           jobCornBean.printAnotherMessage();
    }

    public void setJobCornBean(JobCornBean jobCornBean) {
        this.jobCornBean = jobCornBean;
    }
}
