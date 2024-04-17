package com.zlq.model.demo02;

public class UserServiceImple implements UserService {
    @Override
    public void add() {
        System.err.println("添加了一个用户");
    }

    @Override
    public void delete() {
        System.err.println("删除了一个用户");

    }

    @Override
    public void update() {
        System.err.println("修改了一个用户");

    }

    @Override
    public void query() {
        System.err.println("查询了一个用户");

    }
}
