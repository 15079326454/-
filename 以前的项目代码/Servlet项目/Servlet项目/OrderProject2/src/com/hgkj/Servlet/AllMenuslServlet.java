package com.hgkj.Servlet;

import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.service.Impl.MenusSeriviceImpl;
import com.hgkj.modal.service.MenusService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AllMenuslServlet",value = "/AllMenuslServlet")
public class AllMenuslServlet extends HttpServlet {
    private MenusService menusService=new MenusSeriviceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Menus> menusList=menusService.getMenusAllService();
        request.getSession().setAttribute("menusList",menusList);
        request.getSession().setAttribute("menusList",menusList);
        response.sendRedirect("MenusControlter.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}
