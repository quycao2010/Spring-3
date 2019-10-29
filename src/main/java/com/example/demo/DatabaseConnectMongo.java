package com.example.demo;

public class DatabaseConnectMongo extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Database connect with Mongo " + getUrl());
    }
}
