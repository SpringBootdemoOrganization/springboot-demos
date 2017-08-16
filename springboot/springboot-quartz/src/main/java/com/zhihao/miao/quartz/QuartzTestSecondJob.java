package com.zhihao.miao.quartz;

import com.zhihao.miao.biz.QuartzTestService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;


@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class QuartzTestSecondJob extends QuartzJobBean {

    private final static Logger logger = LoggerFactory.getLogger(QuartzTestSecondJob.class);

    private QuartzTestService quartzTestService = null;

    /**
     *
     * @param context
     */
    protected void init(JobExecutionContext context) {
        final JobDataMap jobDataMap = context.getMergedJobDataMap();
        quartzTestService = (QuartzTestService) jobDataMap.get("quartzTestService");
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        init(context);
        quartzTestService.run("second");
    }

}
