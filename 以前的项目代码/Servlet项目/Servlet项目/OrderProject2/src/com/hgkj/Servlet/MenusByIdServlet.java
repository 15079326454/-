package com.hgkj.Servlet;

import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.entity.Users;
import com.hgkj.modal.service.Impl.MenusSeriviceImpl;
import com.hgkj.modal.service.MenusService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MenusByIdServlet",value = "/MenusByIdServlet")
public class MenusByIdServlet extends HttpServlet {
    MenusService service=new MenusSeriviceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Users users= (Users) request.getSession().getAttribute("users");



        //根据餐厅的id找对应的所有有菜品
        int ret_Id= Integer.parseInt(request.getParameter("ret_Id"));
        List<Menus> menusList=service.MenusByIdService(ret_Id);
        request.getSession().setAttribute("menusList",menusList);
        response.sendRedirect("orders.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
