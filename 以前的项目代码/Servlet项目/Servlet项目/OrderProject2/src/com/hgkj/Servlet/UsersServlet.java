package com.hgkj.Servlet;

import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.entity.Users;
import com.hgkj.modal.service.AdminsService;
import com.hgkj.modal.service.Impl.AdminsServiceImpl;
import com.hgkj.modal.service.Impl.UsersServiceImpl;
import com.hgkj.modal.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UsersServlet",value = "/UsersServlet")
public class UsersServlet extends HttpServlet {
    private UsersService usersService=new UsersServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
//        String action=request.getParameter("action");
        String userEmail = request.getParameter("userEmail");
        String userPwd = request.getParameter("userPwd");
        Users users = new Users(userEmail, userPwd);
        boolean result = usersService.usersLoginService(users);
        System.out.println(users.toString());
        System.out.println(result);
        if (result) {
            request.getSession().setAttribute("users", users);
            response.sendRedirect("index.jsp");
        } else {

            response.sendRedirect("login.jsp");
        }

    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }}