package com.hgkj.Servlet;

import com.hgkj.modal.entity.Users;
import com.hgkj.modal.service.Impl.UsersServiceImpl;
import com.hgkj.modal.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "insertServlet",value = "/insertServlet")
public class insertServlet extends HttpServlet {
    private UsersService usersService=new UsersServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

           String  userFirstName=request.getParameter("userFirstName");
           String  userLastName=request.getParameter("userLastName");
        String userEmail=request.getParameter("userEmail");
           String userPwd=request.getParameter("userPwd");
           String userPwdText=request.getParameter("userPwdText");
           Users users=new Users(userFirstName,userLastName,userEmail,userPwd);
           if (userPwd.equals(userPwdText)){
           boolean result=usersService.insertUsersService(users);
           if (result){
               request.getSession().setAttribute("users",users);
               response.sendRedirect("login.jsp");
           }
           else {
               request.getRequestDispatcher("register.jsp").forward(request,response);

           }
           }
           else {
               request.getRequestDispatcher("register.jsp").forward(request,response);
           }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doPost(request,response);
    }
}
