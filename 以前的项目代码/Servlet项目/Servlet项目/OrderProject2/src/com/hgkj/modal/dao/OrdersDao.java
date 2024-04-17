package com.hgkj.modal.dao;

import com.hgkj.modal.entity.Orders;

import java.util.List;

public interface OrdersDao {
boolean addListOrdersDao(List <Orders> list);
List<Orders> getAllOrdersDao();
}
