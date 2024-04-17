package com.zxdc.model.servlet;

import com.zxdc.model.entity.Menus;
import com.zxdc.model.entity.Resturants;
import com.zxdc.model.serviceImpl.MenusServiceImpl;
import com.zxdc.model.serviceImpl.ResturantsServiceImpl;
import com.zxdc.model.serviceInf.MenusServiceInf;
import com.zxdc.model.serviceInf.ResturantsServiceInf;

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
@WebServlet(name = "ResturantsByRetIdServlet",value = "/ResturantsByRetIdServlet")
public class ResturantsByRetIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String retId = request.getParameter("retId");
        ResturantsServiceInf serviceInf = new ResturantsServiceImpl();
        //根据id获取餐馆
        Resturants resturants = serviceInf.getResturantsByIdService(Integer.parseInt(retId));
        MenusServiceInf menusServiceInf = new MenusServiceImpl();
        //根据餐馆id获取旗下的素有菜品
        List<Menus> menusList = menusServiceInf.queryMenusAllByRetId(Integer.parseInt(retId));
        request.getSession().setAttribute("menusList",menusList);
        request.getSession().setAttribute("resturants",resturants);
        response.sendRedirect("ResturantsByIdCom.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
