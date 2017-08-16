package com.zhihao.miao;

import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/15
 * @since 1.0
 */

@Configuration
public class JobConfig {

    @Autowired
    private JobBean jobBean;

    @Autowired
    private ScheduledJob scheduledJob;


    @Autowired
    private JobCornBean jobCornBean;

    @Bean("methodInvokingJobDetailFactoryBean")
    public MethodInvokingJobDetailFactoryBean methodInvokingJobDetailFactoryBean(){
        MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
        bean.setTargetObject(jobBean);
        bean.setTargetMethod("printMessage");
        bean.setConcurrent(false);
        return bean;
    }




    @Bean("simpleTriggerFactoryBean")
    public SimpleTriggerFactoryBean simpleTriggerFactoryBean(MethodInvokingJobDetailFactoryBean methodInvokingJobDetailFactoryBean){
        SimpleTriggerFactoryBean simpleTriggerFactoryBean = new SimpleTriggerFactoryBean();
        simpleTriggerFactoryBean.setJobDetail(methodInvokingJobDetailFactoryBean.getObject());
        simpleTriggerFactoryBean.setStartDelay(1000);
        simpleTriggerFactoryBean.setRepeatInterval(2000);

        return simpleTriggerFactoryBean;
    }



    @Bean("jobDetailFactoryBean")
    public JobDetailFactoryBean jobDetailFactoryBean(){
        JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();
        jobDetailFactoryBean.setJobClass(scheduledJob.getClass());
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("jobCornBean",jobCornBean);
        jobDetailFactoryBean.setJobDataMap(jobDataMap);
        jobDetailFactoryBean.setDurability(true);
        return jobDetailFactoryBean;
    }

    @Bean("cronTriggerFactoryBean")
    public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setJobDetail(jobDetailFactoryBean.getObject());
        cronTriggerFactoryBean.setCronExpression("0/1 * * ? * *");
        return cronTriggerFactoryBean;
    }

    @Bean("jobConfigBean")
    public JobConfigBean jobConfigBean(){
        JobConfigBean jobConfigBean = new JobConfigBean();
        List<JobDetail> jobDetails = new ArrayList<>();
        jobDetails.add(methodInvokingJobDetailFactoryBean().getObject());
        jobDetails.add(jobDetailFactoryBean().getObject());

        JobDetail[] jobDetailarr = createJobDetail(jobDetails);

        List<Trigger> triggers = new ArrayList<>();
        triggers.add(simpleTriggerFactoryBean(methodInvokingJobDetailFactoryBean()).getObject());
        triggers.add(cronTriggerFactoryBean(jobDetailFactoryBean()).getObject());


        Trigger[] triggerarr = createTriggers(triggers);

        jobConfigBean.setJobDetails(jobDetailarr);
        jobConfigBean.setTriggers(triggerarr);

        return jobConfigBean;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(JobConfigBean jobConfigBean){

        //一个定时任务
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setJobDetails(jobConfigBean.getJobDetails());
        schedulerFactoryBean.setTriggers(jobConfigBean.getTriggers());

        return schedulerFactoryBean;
    }

    public static JobDetail[] createJobDetail(List<JobDetail> jobDetails){
        JobDetail[] jobDetailArr = new JobDetail[jobDetails.size()];
        for (int i = 0; i < jobDetails.size(); i++) {
            jobDetailArr[i] = jobDetails.get(i);
        }

        return jobDetailArr;

    }


    public static Trigger[] createTriggers(List<Trigger> triggers){
        Trigger[] triggerarr = new Trigger[triggers.size()];

        for (int i = 0; i <triggers.size() ; i++) {
            triggerarr[i] = triggers.get(i);
        }

        return triggerarr;
    }



//    @Bean("schedulerFactoryBean")
//    public SchedulerFactoryBean schedulerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean,CronTriggerFactoryBean cronTriggerFactoryBean){
//
//        //一个定时任务
//        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
//        schedulerFactoryBean.setJobDetails(jobDetailFactoryBean.getObject());
//        schedulerFactoryBean.setTriggers(cronTriggerFactoryBean.getObject());
//
//        return schedulerFactoryBean;
//    }










}
