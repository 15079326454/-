package com.hgkj.modal.service.Impl;

import com.hgkj.modal.dao.Impl.OrdersDaoImpl;
import com.hgkj.modal.dao.OrdersDao;
import com.hgkj.modal.entity.Orders;
import com.hgkj.modal.service.OrdersService;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {
    private OrdersDao dao=new OrdersDaoImpl();
    @Override
    public boolean addListOrdersService(List<Orders> list) {
        return dao.addListOrdersDao(list);
    }

    @Override
    public List <Orders> getAllOrdersService() {
        return dao.getAllOrdersDao();
    }
}
