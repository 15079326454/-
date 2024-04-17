package com.zxdc.model.servlet;

import com.zxdc.model.entity.User;
import com.zxdc.model.serviceImpl.UserServiceImpl;
import com.zxdc.model.serviceInf.UserServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
@WebServlet(name = "UserRegistServlet",value = "/UserRegistServlet")
public class UserRegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userfristname = request.getParameter("userfristname");
        String email = request.getParameter("email");
        String useraddress = request.getParameter("useraddress");
        String password = request.getParameter("userpwd");

        if(useraddress==null||useraddress.equals("")){
            request.setAttribute("msg","地址不能为空");
            request.getRequestDispatcher("register.jsp").forward(request,response);
            return ;
        }
        /**
         * 进行电话校验防止是字符串
         */
        String usertel =  request.getParameter("usertel").trim();
        System.out.println(usertel);


        /**
         * 后期进行电话号码校验
         * int tel=0;
         *         try {
         *             tel  = Integer.parseInt(usertel);
         *             System.out.println(tel);
         *         } catch (Exception e) {
         *             request.setAttribute("msg","电话号码填写错误");
         *            request.getRequestDispatcher("register.jsp").forward(request,response);
         *         }
         */

        User user = new User(email,userfristname,password,usertel,useraddress);
        UserServiceInf serviceInf = new UserServiceImpl();

        boolean b = serviceInf.userRegistService(user);
        if(!b){
            response.sendRedirect("index.jsp");
        }else {
            request.setAttribute("msg","您的账户很高级请联系管理员添加");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
