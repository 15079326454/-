package com.hgkj.modal.service;

import com.hgkj.modal.entity.Orders;

import java.util.List;

public interface OrdersService {
    boolean addListOrdersService(List <Orders> list);
    List<Orders> getAllOrdersService();

}
