package com.zxdc.model.serviceInf;

import com.zxdc.model.entity.Order;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
public interface OrdersServiceInf {
    boolean addListOrdersService(List<Order> list);
    List<Order> getAllOrders();
}
