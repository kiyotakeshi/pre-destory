package com.kiyotakeshi.non.web.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Bean1 {

    public void sayHello(){
        System.out.println("Hello");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("@PreDestory " + this.getClass().getSimpleName());
    }
}
