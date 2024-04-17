package com.zxdc.model.servlet;

import com.jspsmart.upload.*;
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

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "updateResturantsByIdServlet",value = "/updateResturantsByIdServlet")
public class updateResturantsByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SmartUpload smartUpload = new SmartUpload();
        smartUpload.initialize(this.getServletConfig(),request,response);
        smartUpload.setCharset("UTF-8");
        try {
            smartUpload.upload();
            Files files = smartUpload.getFiles();
            File file = files.getFile(0);
            String filePath = "uploadImg/"+file.getFileName();
            file.saveAs(filePath,SmartUpload.SAVE_VIRTUAL);
            //     request.getSession().setAttribute("filePath",filePath);
            System.out.println(filePath);
            Resturants resturants = new Resturants();
            Request req = smartUpload.getRequest();

            String retId = req.getParameter("retId");
            String retName = req.getParameter("retName");
            String retAdress = req.getParameter("retAdress");
         //   System.out.println(retName);
            resturants.setRetId(Integer.parseInt(retId));
            resturants.setRetName(retName);
            resturants.setRetAddress(retAdress);
            resturants.setRetPic(filePath);

            ResturantsServiceInf serviceInf = new ResturantsServiceImpl();

            boolean rest = serviceInf.updateResturantsById(resturants);

            /**
             * 修改成功返回管理员主页面
             */
            response.sendRedirect("adminMain.jsp");
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
