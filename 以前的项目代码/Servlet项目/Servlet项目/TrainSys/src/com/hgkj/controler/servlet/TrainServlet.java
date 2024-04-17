package com.hgkj.controler.servlet;

import com.hgkj.model.entity.TrainInfo;
import com.hgkj.model.service.TrainService;
import com.hgkj.model.service.impl.TrainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/TrainServlet")
public class TrainServlet extends HttpServlet {
    private TrainService trainService=new TrainServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String action=request.getParameter("action");
        if("all".equals(action)){
            List<TrainInfo> trainInfoList=trainService.getAllTrainService();
            request.getSession().setAttribute("trainInfoList",trainInfoList);
            response.sendRedirect("index.jsp");
        }else if("find".equals(action)){
            String no=request.getParameter("trainNo");
            TrainInfo trainInfo=trainService.findTrainService(no);
            request.getSession().setAttribute("trainInfo",trainInfo);
            response.sendRedirect("trainInfo.jsp");
        }else if("delete".equals(action)){
            String[] trainId=request.getParameterValues("trainNo");
            trainService.delTrainService(trainId);
            PrintWriter out=response.getWriter();
            out.print("<script>alert('删除成功！');window.location.href='/TrainServlet?action=all'</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
