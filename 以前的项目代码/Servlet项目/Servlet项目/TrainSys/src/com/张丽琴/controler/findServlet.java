package com.张丽琴.controler;

import com.张丽琴.model.entity.TrainInfo;
import com.张丽琴.model.service.Impl.TrainServiceImpl;
import com.张丽琴.model.service.TrainService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "findServlet",value = "/findServlet")
public class findServlet extends HttpServlet {
    private TrainService trainService=new TrainServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String no=request.getParameter("trainNo");
        TrainInfo trainInfo=trainService.findTrainService(no);
        request.getSession().setAttribute("trainInfo",trainInfo);
        response.sendRedirect("find.jsp");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   doPost(request,response);
    }
}
