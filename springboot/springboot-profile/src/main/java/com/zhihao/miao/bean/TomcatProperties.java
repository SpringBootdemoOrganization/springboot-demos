package com.zhihao.miao.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("ds")
public class TomcatProperties {

    private List<String> hosts = new ArrayList<>();

    private String[] ports;

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public String[] getPorts() {
        return ports;
    }

    public void setPorts(String[] ports) {
        this.ports = ports;
    }

    public void show(){
        System.out.println("host====="+this.hosts);
        System.out.println("ports======"+this.ports[0]+","+this.ports[1]+","+this.ports[2]);
    }
}
