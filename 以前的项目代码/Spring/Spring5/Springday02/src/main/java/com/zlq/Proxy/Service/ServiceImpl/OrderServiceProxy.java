package com.zlq.Proxy.Service.ServiceImpl;

import com.zlq.Proxy.Service.OrderService;

public class OrderServiceProxy implements OrderService {
    OrderServiceImpl orderService = new OrderServiceImpl();
    @Override
    public void showOrder() {
        System.out.println("---------log---------");
        orderService.showOrder();
    }
}
