package com.zlq.Proxy.Service.ServiceImpl;

import com.zlq.Proxy.Service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void showOrder() {
        System.err.println("OrderServiceImpl调用了showOrder方法");
    }
}
