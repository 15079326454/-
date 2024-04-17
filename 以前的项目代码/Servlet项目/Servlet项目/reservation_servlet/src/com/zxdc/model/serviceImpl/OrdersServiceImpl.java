package com.zxdc.model.serviceImpl;

import com.zxdc.model.daoImpl.OrdersDaoImpl;
import com.zxdc.model.daoInf.OrdersDaoInf;
import com.zxdc.model.entity.Order;
import com.zxdc.model.serviceInf.OrdersServiceInf;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
public class OrdersServiceImpl implements OrdersServiceInf {
    private OrdersDaoInf dao = new OrdersDaoImpl();

    @Override
    public boolean addListOrdersService(List<Order> list) {
        return dao.addListOrdersService(list);
    }

    @Override
    public List<Order> getAllOrders() {
        return dao.getAllOrdersDao();
    }
}
