package com.example.di;

public class DatabaseOperation {

    private String url;
    private String userName;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void insert(String name) {
        System.out.printf("At %s %s insert new %s \n", url, password, name);
    }

}
