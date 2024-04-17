package com.hgkj.Servlet;


import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.service.AdminsService;
import com.hgkj.modal.service.Impl.AdminsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
/*用于对管理员进行增删改查工作*/
@WebServlet(name = "AddAdminServlet",value = "/AddAdminServlet")
public class AddAdminServlet extends HttpServlet {
    private AdminsService adminsService=new AdminsServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String action=request.getParameter("action");
        PrintWriter out=response.getWriter();
        if ("all".equals(action)){
            //遍历管理员内的内容
            List<Admins> adminsList=adminsService.allAdminsService();
            request.getSession().setAttribute("adminsList",adminsList);
            response.sendRedirect("AdminControlter.jsp");

        }else if ("insert".equals(action)){
            //添加管理员
            String adminName=request.getParameter("adminName");
            String adminPwd=request.getParameter("adminPwd");
            Admins admins=new Admins(adminName,adminPwd);
            boolean result=adminsService.addAdminService(admins);
            if (result) {
                request.getSession().setAttribute("admins",admins);
                response.sendRedirect("AddAdminServlet?action=all");
            }else {
                request.setAttribute("emsg","添加失败");
                request.getRequestDispatcher("addAdmins.jsp");
            }
        }else if ("delete".equals(action)){
            //删除管理员
           int adminId= Integer.parseInt(request.getParameter("adminId"));
           boolean result=adminsService.delAdminService(adminId);
           response.sendRedirect("AddAdminServlet?action=all");
           out.print(result);
        }else if ("update".equals(action)){
            //修改管理员信息
               int adminId= Integer.valueOf(request.getParameter("adminId"));
            System.out.println(adminId);
            String adminName=request.getParameter("adminName");
                String adminPwd=request.getParameter("adminPwd");
                Admins admins=new Admins(adminId,adminName,adminPwd);
                boolean result=adminsService.updateAdminService(admins);
                if (result){
                    response.sendRedirect("AddAdminServlet?action=all");
                }else {
                    request.setAttribute("emsg","修改失败");
                    request.getRequestDispatcher("updateAdmin.jsp").forward(request,response);
            }
        }else if ("find".equals(action)){
            int adminId= Integer.parseInt(request.getParameter("adminId"));
            Admins admins=adminsService.getAdminByIdDao(adminId);
            request.getSession().setAttribute("admins",admins);
            response.sendRedirect("updateAdmin.jsp");
        }


/* List<Admins> list=adminsService.getAdminByIdDao2(adminId);
               String adminName=list.get(0).getAdminName();
            System.out.println(adminName);
            request.getSession().setAttribute("adminName",adminName);
                String adminPwd=list.get(0).getAdminPwd();
             request.getSession().setAttribute("adminPwd",adminPwd);
               response.sendRedirect("updateAdmin.jsp");*/
       /* String adminName=request.getParameter("adminName");
        String adminPwd=request.getParameter("adminPwd");
        Admins admins=new Admins(adminName,adminPwd);
        boolean result=adminsService.addAdminService(admins);
        if (result) {
            request.getSession().setAttribute("admins",admins);
            response.sendRedirect("AdminControlter.jsp");
        }else {
            request.setAttribute("emsg","添加失败");
            request.getRequestDispatcher("addAdmins.jsp");
        }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doPost(request,response);
    }
}
