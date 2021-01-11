package com.kiyotakeshi.non.web;

import com.kiyotakeshi.non.web.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner1 {
    public static void main(String[] args) {
        System.out.println(Runner1.class.getSimpleName());

        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();

        var bean1 = context.getBean(Bean1.class);
        bean1.sayHello();
    }
}
