package com.zhihao.miao.constant;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "quartz")
public class QuartzConstant {

    private Integer enableFirstTask;
    private String firstCron;

    private Integer enableSecondTask;
    private String secondCron;

    public Integer getEnableFirstTask() {
        return enableFirstTask;
    }

    public void setEnableFirstTask(Integer enableFirstTask) {
        this.enableFirstTask = enableFirstTask;
    }

    public String getFirstCron() {
        return firstCron;
    }

    public void setFirstCron(String firstCron) {
        this.firstCron = firstCron;
    }

    public Integer getEnableSecondTask() {
        return enableSecondTask;
    }

    public void setEnableSecondTask(Integer enableSecondTask) {
        this.enableSecondTask = enableSecondTask;
    }

    public String getSecondCron() {
        return secondCron;
    }

    public void setSecondCron(String secondCron) {
        this.secondCron = secondCron;
    }

}
