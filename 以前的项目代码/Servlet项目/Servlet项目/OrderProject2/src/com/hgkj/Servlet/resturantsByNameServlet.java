package com.hgkj.Servlet;

import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.service.Impl.ResturantsServiceImpl;
import com.hgkj.modal.service.ResturantsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "resturantsByNameServlet",value = "/resturantsByNameServlet")
public class resturantsByNameServlet extends HttpServlet {
    ResturantsService resturantsService=new ResturantsServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.getRequestDispatcher("UTF-8");
          response.setContentType("text/html;charset=UTF-8");
          String retName =request.getParameter("retName");
          String retAddress=request.getParameter("retAddress");
           System.out.println(retName);
           System.out.println(retAddress);
           Resturants restult=resturantsService.getResturantByAdrName(retName,retAddress);
           System.out.println(restult);
        if (restult.getRet_Name()!=null){
            request.getSession().setAttribute("restult",restult);

        }else {
            request.getSession().setAttribute("restult",null);

        }
        response.sendRedirect("resturantsByAdd.jsp");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
