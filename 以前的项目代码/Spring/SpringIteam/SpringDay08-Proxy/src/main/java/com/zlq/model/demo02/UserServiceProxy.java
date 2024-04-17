package com.zlq.model.demo02;

public class UserServiceProxy implements UserService {


    public void setUserService(UserServiceImple userService) {
        this.userService = userService;
    }

    private UserServiceImple userService;


    @Override
    public void add() {
        log("add");
        userService.add();

    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");

        userService.update();
    }

    @Override
    public void query() {
        log("query");

        userService.query();
    }

    //    日志
    public void log(String msg) {
        System.out.println("[代理给的提示】：使用了" + msg + "方法");
    }
}
