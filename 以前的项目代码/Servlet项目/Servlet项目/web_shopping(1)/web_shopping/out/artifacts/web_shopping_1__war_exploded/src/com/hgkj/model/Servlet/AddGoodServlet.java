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

@WebServlet(name = "AddGoodServlet",value = "/AddGoodServlet")
public class AddGoodServlet extends HttpServlet {

    private GoodService goodService=new GoodServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("你好");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String goodName=request.getParameter("goodName");
        double goodPrice= Double.parseDouble(request.getParameter("goodPrice"));
        String goodAddress=request.getParameter("goodAddress");

        Good good=new Good(goodName,goodAddress,goodPrice);
        boolean result=goodService.insertService(good);
        if (result){
               response.sendRedirect("AllGoodServlet");
        }
        else {
            request.setAttribute("emsg","添加失败");
            request.getRequestDispatcher("addgood.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               doPost(request,response);
    }
}
