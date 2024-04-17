package com.zxdc.model.servlet;

import com.zxdc.model.serviceImpl.ResturantsServiceImpl;
import com.zxdc.model.serviceInf.ResturantsServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "DelResturantsByRedIdServlet",value = "/DelResturantsByRedIdServlet")
public class DelResturantsByRedIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String retId = request.getParameter("retId");
        ResturantsServiceInf serviceInf = new ResturantsServiceImpl();
        boolean b = serviceInf.delResturantsById(Integer.parseInt(retId));
        if(b){
           response.sendRedirect("adminMain.jsp");
        }else {
            PrintWriter writer = response.getWriter();
            writer.print("删除失败");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
