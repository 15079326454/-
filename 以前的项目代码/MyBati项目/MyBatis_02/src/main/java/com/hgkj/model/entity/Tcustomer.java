package com.hgkj.model.entity;

import java.util.Date;
import java.util.List;

public class Tcustomer {
    private Integer id;

    private String name;

    private String age;

    private String tel;
 private List<Orders> orders;

    public List <Orders> getOrders() {
        return orders;
    }

    public void setOrders(List <Orders> orders) {
        this.orders = orders;
    }

    public Tcustomer() {
    }

    public Tcustomer(String name, String age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}