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

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "addMenusByRetIdServlet",value = "/addMenusByRetIdServlet")
public class addMenusByRetIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String retId = request.getParameter("retId");
        String menusname = request.getParameter("menusname");
        String menusprice = request.getParameter("menusprice");
        Menus menus = new Menus();
        menus.setRetId(Integer.parseInt(retId));
        menus.setMenusname(menusname);
        menus.setMenusprice(Double.parseDouble(menusprice));
        //添加菜品
        MenusServiceInf serviceInf = new MenusServiceImpl();
        boolean b = serviceInf.addMenusService(menus);
         if(b){
            response.sendRedirect("ResturantsByRetIdServlet?retId="+retId);
        }else {
            request.setAttribute("msgs","添加失败");
            request.getRequestDispatcher("ResturantsByIdCom.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
