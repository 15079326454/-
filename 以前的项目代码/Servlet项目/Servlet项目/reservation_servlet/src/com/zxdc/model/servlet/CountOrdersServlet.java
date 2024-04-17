package com.zxdc.model.servlet;

import com.zxdc.model.entity.Order;
import com.zxdc.model.entity.User;
import com.zxdc.model.serviceImpl.OrdersServiceImpl;
import com.zxdc.model.serviceInf.OrdersServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "CountOrdersServlet",value = "/CountOrdersServlet")
public class CountOrdersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //用户
        User user = (User)request.getSession().getAttribute("user");
        if(request.getSession().getAttribute("user")==null){
            request.getSession().setAttribute("msg","请登录后购买商品");
            response.sendRedirect("login.jsp");
            return;
        }

        //商品数量
        String goodNumber = request.getParameter("goodNumber");
        //总金额
        String countPrice = request.getParameter("countPrice");
        //所有的地址
        String adressArray = request.getParameter("adressArray");
        //地址数组
        String[] addressList = adressArray.split(",");

        //日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date=new Date();



        String formatDate = sdf.format(date);
        List<Order> orderList = new ArrayList<>();
        for (String address : addressList) {
            Order order = new Order(Integer.parseInt(goodNumber),Double.parseDouble(countPrice),formatDate,address,user.getUserid());
           orderList.add(order);
        }
        OrdersServiceInf serviceInf = new OrdersServiceImpl();
        boolean b = serviceInf.addListOrdersService(orderList);
        if(!b){
            response.sendRedirect("success.jsp");
        }else {
            request.setAttribute("msga","购买失败");
            request.getRequestDispatcher("checkout.jsp").forward(request,response);
        }
        //插入订单
        //System.out.println(adressArray);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
