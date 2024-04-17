package com.张丽琴.controler;

import com.张丽琴.model.service.Impl.TrainServiceImpl;
import com.张丽琴.model.service.TrainService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/deleteServlet")
public class deleteServlet extends HttpServlet {
    private TrainService trainService=new TrainServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String[] trainId=request.getParameterValues("trainNo");
        trainService.delTrainService(trainId);
        PrintWriter out=response.getWriter();
        out.print("<script>alert('删除成功！');window.location.href='AllTrainsServlet'</script>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
