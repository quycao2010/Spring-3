package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring4ConfigAndBeanApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(Spring4ConfigAndBeanApplication.class, args);

       SimpleBean simpleBean = context.getBean(SimpleBean.class);
        System.out.println(simpleBean.toString());

        DatabaseConnector connectSql = (DatabaseConnector) context.getBean("mySQL");
        connectSql.connect();
    }

}
