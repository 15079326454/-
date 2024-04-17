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
import java.util.List;


@WebServlet(name = "AllTrainsServlet",value = "/AllTrainsServlet")
public class AllTrainsServlet extends HttpServlet {
    private TrainService trainService=new TrainServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              request.setCharacterEncoding("UTF-8");
              response.setContentType("text/html;charset=UTF-8");
          List<TrainInfo> trainInfoList=trainService.getAllTrainService();
        request.getSession().setAttribute("trainInfoList",trainInfoList);
        response.sendRedirect("trainInfo.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request,response);
    }
}
