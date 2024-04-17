package com.zlq.model.entity;

public class UserT {
    private String name;

    public void show() {
        System.err.println("name=" + name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
