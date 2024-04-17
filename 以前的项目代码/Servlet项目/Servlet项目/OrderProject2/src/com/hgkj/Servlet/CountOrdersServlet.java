package com.hgkj.Servlet;

import com.hgkj.modal.entity.Orders;
import com.hgkj.modal.entity.Users;
import com.hgkj.modal.service.Impl.OrdersServiceImpl;
import com.hgkj.modal.service.OrdersService;

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

@WebServlet(name = "CountOrdersServlet",value = "/CountOrdersServlet")
public class CountOrdersServlet extends HttpServlet {
    OrdersService ordersService=new OrdersServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Users users= (Users) request.getSession().getAttribute("users");
        if (request.getSession().getAttribute("users")==null){
            request.getSession().setAttribute("msg","请您登陆后方可购买商品");
            response.sendRedirect("login.jsp");
            return;
        }
        //商品数量
        String goodNumber=request.getParameter("goodNumber");
        //总金额
        String countPrice=request.getParameter("countPrice");
        //所有的地址
        String adressArray=request.getParameter("adressArray");
        //地址数组
        String[] addressList=adressArray.split(",");
        //日期
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date=new Date();


        String formatDate=simpleDateFormat.format(date);
        List<Orders> ordersList=new ArrayList <>();
        for (String ret_Introduce : addressList){
            Orders orders=new Orders(Integer.parseInt(goodNumber),Double.parseDouble(countPrice),formatDate,ret_Introduce,users.getUserID());
            ordersList.add(orders);
        }
      boolean b=ordersService.addListOrdersService(ordersList);
        if (!b){
            response.sendRedirect("success.jsp");

        }else {
            request.setAttribute("msga","购买失败");
            request.getRequestDispatcher("checkout.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
