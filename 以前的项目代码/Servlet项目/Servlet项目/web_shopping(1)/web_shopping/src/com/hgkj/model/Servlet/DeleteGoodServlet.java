package com.hgkj.model.Servlet;

import com.hgkj.model.service.GoodService;
import com.hgkj.model.service.impl.GoodServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteGoodServlet",value = "/DeleteGoodServlet")
public class DeleteGoodServlet extends HttpServlet {
    private GoodService goodService=new GoodServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int goodId= Integer.parseInt(request.getParameter("goodId"));
        goodService.deleteService(goodId);
        response.sendRedirect("AllGoodServlet");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
