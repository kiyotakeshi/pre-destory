package com.kiyotakeshi.boot.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Bean1 {

    public void sayHello(){
        System.out.println("Hello");
    }

    // Spring Boot automatically registered the shutdown hook
    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy " + getClass().getSimpleName());
    }
}
