package com.hgkj.Servlet;

import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.service.Impl.MenusSeriviceImpl;
import com.hgkj.modal.service.MenusService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MenusByNameServlet",value = "/MenusByNameServlet")
public class MenusByNameServlet extends HttpServlet {
    private MenusService menusService=new MenusSeriviceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String menusName =request.getParameter("menusName");
        System.out.println(menusName);
        Menus restult=menusService.getByNameService(menusName);
        System.out.println(restult);
        if (restult.getMenusName()!=null){
            request.getSession().setAttribute("restult",restult);

        }else {
            request.getSession().setAttribute("restult",null);

        }
        response.sendRedirect("menusByName.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
