package com.zxdc.model.servlet;

import com.jspsmart.upload.*;
import com.zxdc.model.entity.Resturants;
import com.zxdc.model.serviceImpl.ResturantsServiceImpl;
import com.zxdc.model.serviceInf.ResturantsServiceInf;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
@WebServlet(name = "ResturantsServlet",value = "/ResturantsServlet")
@MultipartConfig
public class ResturantsServlet extends HttpServlet {

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
            String retName = req.getParameter("retName");
            String retAdress = req.getParameter("retAdress");
            System.out.println(retName);

            resturants.setRetName(retName);
            resturants.setRetAddress(retAdress);
            resturants.setRetPic(filePath);

            ResturantsServiceInf serviceInf = new ResturantsServiceImpl();

            Resturants rest = serviceInf.addResturantsService(resturants);
            //添加商品
            ObjectMapper objectMapper = new ObjectMapper();
            String restJson = objectMapper.writeValueAsString(rest);
            System.out.println(restJson);

        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
