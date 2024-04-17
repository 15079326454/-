package servlet;

import com.jspsmart.upload.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "uploadServlet",value = "/uploadServlet")
public class uploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        SmartUpload smartUpload=new SmartUpload();
        smartUpload.initialize(this.getServletConfig(),request,response);
        smartUpload.setCharset("UTF-8");
        File file= null;
        try {
            smartUpload.upload();
            Files files=smartUpload.getFiles();
            System.out.println(files.getCount()+"=========");
            file = files.getFile(0);
            String filePath="upload\\"+file.getFileName();
            System.out.println(filePath+"=========");
            file.saveAs(filePath,SmartUpload.SAVE_VIRTUAL);
            request.getSession().setAttribute("filePath",filePath);
            request.getSession().setAttribute("fileName",file.getFileName());

        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
           response.sendRedirect("down.jsp");
       /* Request req=smartUpload.getRequest();
        String userName=req.getParameter("userName");
        out.print(userName+":"+file.getFileName()+":上传成功！");*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}
