package com.zxdc.model.servlet;

import com.zxdc.model.entity.Resturants;
import com.zxdc.model.serviceImpl.ResturantsServiceImpl;
import com.zxdc.model.serviceInf.ResturantsServiceInf;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "ResturantsAdressAllServlet",value = "/ResturantsAdressAllServlet")
public class ResturantsAdressAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResturantsServiceInf serviceInf = new ResturantsServiceImpl();
        List<Resturants> list = serviceInf.getAllRestAdess();

        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writeValueAsString(list);
      //  System.out.println(result);
        PrintWriter writer = response.getWriter();
        writer.print(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
