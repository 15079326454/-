package com.zxdc.model.servlet;

import com.zxdc.model.entity.User;
import com.zxdc.model.serviceImpl.UserServiceImpl;
import com.zxdc.model.serviceInf.UserServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
@WebServlet(name = "UserLoginServlet",value = "/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userFirstName = request.getParameter("userFirstName");
        String pwd = request.getParameter("pwd");
        UserServiceInf serviceInf = new UserServiceImpl();
        User user = new User();
        user.setUserfristname(userFirstName);
        user.setUserpwd(pwd);
        User us = serviceInf.userLoginService(user);
        System.out.println(us);
        if(us==null){
            request.setAttribute("msg","登陆失败");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("user",us);
            response.sendRedirect("index.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
