package com.hgkj.Servlet;

import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.entity.Users;
import com.hgkj.modal.service.AdminsService;
import com.hgkj.modal.service.Impl.AdminsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdminServlet",value = "/AdminServlet")
public class AdminServlet extends HttpServlet {
    private  AdminsService service=new AdminsServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
//        String action=request.getParameter("action");
        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");
        Admins admins = new Admins(adminName, adminPwd);
        boolean result = service.AdminLogin(admins);
        System.out.println(result);
        if (result) {
            request.getSession().setAttribute("admins", admins);
            response.sendRedirect("admin.jsp");
        } else {

            response.sendRedirect("AddAdminServlet?action=all");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request,response);
    }
}
