package com.imooc.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/4.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class Girl {
    private String cupSize;

    private Integer age;

    @Override
    public String toString() {
        return "Girl{" +
                "cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {

        return cupSize;
    }

    public Integer getAge() {
        return age;
    }
}
