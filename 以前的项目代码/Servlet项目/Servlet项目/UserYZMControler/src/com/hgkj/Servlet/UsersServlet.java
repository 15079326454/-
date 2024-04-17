package com.hgkj.Servlet;

import com.hgkj.model.entity.Users;
import com.hgkj.model.service.Impl.UsersServiceImpl;
import com.hgkj.model.service.UsersService;
import com.jspsmart.upload.*;

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
        String action = request.getParameter("action");
        if ("all".equals(action)) {
            List <Users> usersList = usersService.allUsersService();
            request.getSession().setAttribute("usersList", usersList);
            response.sendRedirect("index.jsp");
        } else if ("insert".equals(action)) {
            String userName = request.getParameter("userName");
            String userPwd = request.getParameter("userPwd");
            Users users = new Users(userName, userPwd);
            boolean result = usersService.insertUsersService(users);  PrintWriter out =response.getWriter();
            if (result) {
                response.sendRedirect("UsersServlet?action=all");
             } else {
                request.setAttribute("emsg", "注册失败");
                request.getRequestDispatcher("newUsers.jsp").forward(request, response);
            }
        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request,response);
    }
}
