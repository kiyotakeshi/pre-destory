package com.kiyotakeshi.non.web;

import com.kiyotakeshi.non.web.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Runner3 {
    public static void main(String[] args) throws IOException {
        System.out.println(Runner3.class.getSimpleName());

        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        var bean1 = context.getBean(Bean1.class);
        bean1.sayHello();

        // if any exception occurs, application context is not closed
        // throw new IOException("error");
        context.close();
    }
}
