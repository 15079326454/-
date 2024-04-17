package com.zxdc.model.servlet;

import com.google.gson.Gson;
import com.zxdc.model.daoImpl.ResturantsDaoImpl;
import com.zxdc.model.daoInf.ResturantsDaoInf;
import com.zxdc.model.entity.Page;
import com.zxdc.model.entity.Resturants;
import com.zxdc.model.serviceImpl.ResturantsServiceImpl;
import com.zxdc.model.serviceInf.ResturantsServiceInf;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
@WebServlet(name = "ResturantsQueryAllServlet",value = "/ResturantsQueryAllServlet")
public class ResturantsQueryAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int pageSize=2;
        String pageNumber = request.getParameter("pageNumber");
      //  System.out.println("前端页面传来"+pageNumber);
        /**
         * 此处改用三层架构
         */
        ResturantsDaoImpl dao = new ResturantsDaoImpl();
        int totalCount = dao.goodNumbr();
        int totalPages=0; //总页码


        if(totalCount%pageSize==0){
            totalPages= totalCount/pageSize;
        }else{
            totalPages = totalCount/pageSize+1;
        }
        int pageNumberPai = Integer.parseInt(pageNumber);
        if(pageNumberPai>totalPages){
            pageNumberPai = totalPages;
        }else if (pageNumberPai<=0){
            pageNumberPai=1;
        }

        //   String s = session.getAttribute(pageNumber).toString();
       // System.out.println(s+"p");


        ResturantsServiceInf serviceInf = new ResturantsServiceImpl();
        List<Resturants> resturantsList = serviceInf.queryAllResturantsService(pageNumberPai, pageSize);
        List<Resturants> list = new ArrayList<>();
        /**
         * 将从数据库中的数据添加当前页和总页
         */
        for (Resturants resturants : resturantsList) {
            resturants.setPageNumber(pageNumberPai);
            resturants.setTotalPages(totalPages);
            list.add(resturants);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writeValueAsString(list);

     //   System.out.println(result);
        PrintWriter writer = response.getWriter();
        writer.print(result);
       // request.getRequestDispatcher("resturants.jsp").forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
