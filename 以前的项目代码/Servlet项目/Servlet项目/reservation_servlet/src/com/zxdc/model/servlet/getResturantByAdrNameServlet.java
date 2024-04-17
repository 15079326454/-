package com.zxdc.model.servlet;

import com.zxdc.model.entity.Resturants;
import com.zxdc.model.serviceImpl.ResturantsServiceImpl;
import com.zxdc.model.serviceInf.ResturantsServiceInf;

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
@WebServlet(name = "getResturantByAdrNameServlet",value = "/getResturantByAdrNameServlet")
public class getResturantByAdrNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String resturantName = request.getParameter("ResturantName");
        String adress = request.getParameter("adress").trim();
        ResturantsServiceInf serviceInf = new ResturantsServiceImpl();
        System.out.println(resturantName);
        System.out.println(adress);
        Resturants resturant = serviceInf.getResturantByAdrName(resturantName, adress);
        System.out.println(resturant);
        if(resturant.getRetName()!=null){
            request.getSession().setAttribute("resturantByAdd",resturant);
        }else {
            request.getSession().setAttribute("resturantByAdd",null);
        }
        response.sendRedirect("resturantsByAdd.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
