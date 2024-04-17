package com.zxdc.model.daoInf;

import com.zxdc.model.entity.Order;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
public interface OrdersDaoInf {
    boolean addListOrdersService(List<Order> list);
    List<Order> getAllOrdersDao();
}
