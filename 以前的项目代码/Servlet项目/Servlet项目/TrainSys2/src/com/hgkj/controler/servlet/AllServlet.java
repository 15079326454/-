package com.hgkj.controler.servlet;

import com.hgkj.model.Service.TrainService;
import com.hgkj.model.Service.impl.TrainServiceImpl;
import com.hgkj.model.entity.TrainInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/AllServlet")
public class AllServlet extends HttpServlet {
    private TrainService trainService=new TrainServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<TrainInfo> trainInfoList=trainService.getAllTrainService();
        request.getSession().setAttribute("trainInfoList",trainInfoList);
        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
