package com.hgkj.model.Servlet;

import com.hgkj.model.entity.Good;
import com.hgkj.model.service.GoodService;
import com.hgkj.model.service.impl.GoodServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindGoodServlet",value = "/FindGoodServlet")
public class FindGoodServlet extends HttpServlet {
    private GoodService goodService=new GoodServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int goodId= Integer.parseInt(request.getParameter("goodId"));
        Good good=goodService.getGoodByIdService(goodId);
        request.getSession().setAttribute("good",good);
        response.sendRedirect("Updategood.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request,response);
    }
}
