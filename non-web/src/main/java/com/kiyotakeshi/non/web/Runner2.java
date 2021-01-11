package com.kiyotakeshi.non.web;

import com.kiyotakeshi.non.web.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner2 {
    public static void main(String[] args) {

        System.out.println(Runner2.class.getSimpleName());
        // try-with-resources
        // AnnotationConfigApplicationContext -> GenericApplicationContext -> ConfigurableApplicationContext
        // ConfigurableApplicationContext extends Closeable(AutoCloseable), so we can use try-with-resources to
        // public interface ConfigurableApplicationContext extends ApplicationContext, Lifecycle, Closeable {
        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){
            var bean1 = context.getBean(Bean1.class);
            bean1.sayHello();
        }
    }
}
