package com.hgkj.model.dao;

import com.hgkj.model.entity.Orders;

public interface OrdersMapper {

Orders selectOrderById(Integer id);
    int insertOrders(Orders orders);

}