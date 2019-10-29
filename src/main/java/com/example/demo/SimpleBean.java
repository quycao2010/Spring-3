package com.example.demo;

public class SimpleBean {
    private String username;

    public SimpleBean(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "This is SimpleBean, name: " + this.username;
    }
}
