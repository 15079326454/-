package com.zxdc.model.servlet;

import com.zxdc.model.serviceImpl.MenusServiceImpl;
import com.zxdc.model.serviceInf.MenusServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "delMenusByRetIdServlet",value = "/delMenusByRetIdServlet")
public class delMenusByRetIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String retId = request.getParameter("retId");
        MenusServiceInf serviceInf = new MenusServiceImpl();
        boolean b = serviceInf.delMenusByRetId(Integer.parseInt(retId));
        if(b){
            response.sendRedirect("ResturantsByRetIdServlet?retId="+retId);
        }else {
            request.setAttribute("msg","删除失败");
            request.getRequestDispatcher("ResturantsByIdCom.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
