package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    SimpleBean simpleBeanConfig(){
        return new SimpleBean("QuyNguyen");
    }

    @Bean("mySQL")
    DatabaseConnector connectSql() {
        DatabaseConnector connectSql = new DatabaseConnectSql();
        connectSql.setUrl("jdbc:mysql://host1:33060/home");
        return connectSql;
}

    @Bean("mongoDB")
    DatabaseConnector connectMongo(){
        DatabaseConnector connectMongo = new DatabaseConnectMongo();
        connectMongo.setUrl("jdbc:mongo://host2:3306/home");
        return connectMongo;
    }
}
