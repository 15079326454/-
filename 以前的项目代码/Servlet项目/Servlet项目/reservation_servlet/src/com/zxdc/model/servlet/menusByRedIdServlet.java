package com.zxdc.model.servlet;

import com.zxdc.model.entity.Menus;
import com.zxdc.model.serviceImpl.MenusServiceImpl;
import com.zxdc.model.serviceInf.MenusServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
@WebServlet(name = "menusByRedIdServlet",value = "/menusByRedIdServlet")
public class menusByRedIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String retId = request.getParameter("retId");
        MenusServiceInf serviceInf = new MenusServiceImpl();
        List<Menus> list = serviceInf.queryMenusAllByRetId(Integer.parseInt(retId));
        request.getSession().setAttribute("menusList",list);

        response.sendRedirect("orders.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
