package com.zlq.basic.Constructor;

import java.io.Serializable;

public class Customer implements Serializable {
    private  String  name;
    private int age;
//构造方法的重载，参数个数不同
    public Customer(String name) {
        this.name = name;
    }

    public Customer(int age) {
        this.age = age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
