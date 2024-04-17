package com.zlq.model.demo01;
//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.err.println("房东要出租房子");
    }
}
