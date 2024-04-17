package com.hgkj.Servlet;

import com.hgkj.model.entity.Users;
import com.hgkj.model.service.Impl.UsersServiceImpl;
import com.hgkj.model.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet",value = "/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String userName=request.getParameter("userName");
        String userPwd=request.getParameter("userPwd");
        Users users=new Users(userName,userPwd);
        UsersService us=new UsersServiceImpl();
        boolean result=us.userLoginService(users);
        if (result){
            request.getSession().setAttribute("users",users);
            response.sendRedirect("show.jsp");
        }else {
            response.sendRedirect("NewUsersControler.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
