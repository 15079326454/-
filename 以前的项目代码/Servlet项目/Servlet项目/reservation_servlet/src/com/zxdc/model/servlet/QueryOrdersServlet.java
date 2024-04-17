package com.zxdc.model.servlet;

import com.zxdc.model.entity.Order;
import com.zxdc.model.serviceImpl.OrdersServiceImpl;
import com.zxdc.model.serviceInf.OrdersServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 管理员查询所有订单
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "QueryOrdersServlet",value = "/QueryOrdersServlet")
public class QueryOrdersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrdersServiceInf serviceInf = new OrdersServiceImpl();
        List<Order> listOrders = serviceInf.getAllOrders();
        request.getSession().setAttribute("listOrders",listOrders);
        response.sendRedirect("ordersAll.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
