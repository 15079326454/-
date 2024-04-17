package com.zlq.model.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImple userService =new UserServiceImple();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.update();
    }

}
