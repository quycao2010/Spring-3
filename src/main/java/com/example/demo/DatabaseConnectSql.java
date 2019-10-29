package com.example.demo;

public class DatabaseConnectSql extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Connect Data with SQL " + getUrl());
    }
}
