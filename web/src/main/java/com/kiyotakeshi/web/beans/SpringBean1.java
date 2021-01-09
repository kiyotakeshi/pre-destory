package com.kiyotakeshi.web.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean1 {

    public String getHello(){
        return "hello";
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("@PreDestroy " + getClass().getSimpleName());
    }
}
