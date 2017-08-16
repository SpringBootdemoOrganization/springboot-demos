package com.zhihao.miao;

import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.metrics.jmx.JmxMetricWriter;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
@Configuration
public class ExportConfiguration {

    @Bean
    @ExportMetricWriter
    public MetricWriter metricWriter(MBeanExporter exporter){
        return new JmxMetricWriter(exporter);
    }
}
