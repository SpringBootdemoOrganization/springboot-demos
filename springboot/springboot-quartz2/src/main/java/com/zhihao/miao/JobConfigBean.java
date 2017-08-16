package com.zhihao.miao;

import org.quartz.JobDetail;
import org.quartz.Trigger;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/16
 * @since 1.0
 */
public class JobConfigBean {

    private JobDetail[] jobDetails;

    private Trigger[] triggers;

    public JobDetail[] getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(JobDetail[] jobDetails) {
        this.jobDetails = jobDetails;
    }

    public Trigger[] getTriggers() {
        return triggers;
    }

    public void setTriggers(Trigger[] triggers) {
        this.triggers = triggers;
    }
}
