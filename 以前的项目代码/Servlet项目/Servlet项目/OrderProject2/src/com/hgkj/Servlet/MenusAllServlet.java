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

@WebServlet(name = "MenusAllServlet",value = "/MenusAllServlet")
public class MenusAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        MenusService service=new MenusSeriviceImpl();
        List<Menus> menusList=service.getMenusAllService();
        request.getSession().setAttribute("menusList",menusList);
        response.sendRedirect("menusAll.jsp");
        System.out.println(toString());


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doPost(request,response);
    }
}
