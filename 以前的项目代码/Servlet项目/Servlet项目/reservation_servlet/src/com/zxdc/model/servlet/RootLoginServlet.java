package com.zxdc.model.servlet;

import com.zxdc.model.entity.Admin;
import com.zxdc.model.serviceImpl.RootServiceImpl;
import com.zxdc.model.serviceInf.RootServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
@WebServlet(name = "RootLoginServlet",value ="/RootLoginServlet" )
public class RootLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");
        Admin admin = new Admin();
        admin.setAdminname(adminName);
        admin.setAdminpwd(adminPwd);
        RootServiceInf serviceInf = new RootServiceImpl();
        Admin admi = serviceInf.RootLoginService(admin);
        if(admi==null){
            request.getRequestDispatcher("admin.jsp").forward(request,response);

        }
        request.getSession().setAttribute("admin",admi);
        response.sendRedirect("adminMain.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
