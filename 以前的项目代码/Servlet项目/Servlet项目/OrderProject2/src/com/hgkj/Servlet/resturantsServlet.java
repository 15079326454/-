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
import java.util.List;

@WebServlet(name = "resturantsServlet",value = "/resturantsServlet")
public class resturantsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResturantsService resturantsService=new ResturantsServiceImpl();
        List<Resturants> resturantsList=resturantsService.allresturantsService();
        request.getSession().setAttribute("resturantsList",resturantsList);
        response.sendRedirect("resturants.jsp");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              doPost(request,response);
    }
}
