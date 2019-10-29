package com.example.demo;

public abstract class DatabaseConnector {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public abstract void connect();

}
