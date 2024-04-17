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
 * 2019/5/9.
 */
@WebServlet(name = "queryMenusAllServlet",value = "/queryMenusAllServlet")
public class queryMenusAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MenusServiceInf serviceInf = new MenusServiceImpl();
        List<Menus> menusList = serviceInf.queryMenusAll();
        request.getSession().setAttribute("menusList",menusList);
        response.sendRedirect("menusAll.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
