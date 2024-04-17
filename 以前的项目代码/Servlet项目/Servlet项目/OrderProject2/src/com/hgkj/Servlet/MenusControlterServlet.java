package com.hgkj.Servlet;

import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.service.Impl.MenusSeriviceImpl;
import com.hgkj.modal.service.MenusService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "MenusControlterServlet",value = "/MenusControlterServlet")
public class MenusControlterServlet extends HttpServlet {
    private MenusService menusService=new MenusSeriviceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action=request.getParameter("action");
            PrintWriter out=response.getWriter();
            if ("all".equals(action)){

//            List<Menus> menusList=menusService.getMenusAllService();
//            request.getSession().setAttribute("menusList",menusList);

//            if(request.getSession().getAttribute("ret_Id")==null){

                int ret_Id= Integer.parseInt(request.getParameter("ret_Id"));
//            }else{
//                ret_Id=  Integer.parseInt( request.getSession().getAttribute("ret_Id").toString()) ;
//            }
                List<Menus> menusList=menusService.MenusByIdService(ret_Id);
                request.getSession().setAttribute("menusList",menusList);
                response.sendRedirect("MenusControlter.jsp");
            }else if ("insert".equals(action)){
                String menusName=request.getParameter("menusName");
                double menusPrice=Double.parseDouble(request.getParameter("menusPrice"));
                int ret_Id=Integer.parseInt(request.getParameter("ret_Id"));
                Menus menus=new Menus(menusName,menusPrice,ret_Id);
                boolean result=menusService.addMenussService(menus);
                System.out.println(result);
                if (result) {
                    request.getSession().setAttribute("menus",menus);
                    List<Menus> menusList=menusService.MenusByIdService(ret_Id);
                    request.getSession().setAttribute("menusList",menusList);
                    response.sendRedirect("MenusControlter.jsp");
                }else {
                    request.setAttribute("emsg","添加失败");
                    request.getRequestDispatcher("addMenus.jsp");
                }

            }else if ("delete".equals(action)){
                int menusId= Integer.parseInt(request.getParameter("menusId"));
                int ret_Id=Integer.parseInt(request.getParameter("ret_Id"));
                boolean result = menusService.delMenusByIdService(menusId);
                if (result) {
                    List <Menus> menusList = menusService.MenusByIdService(ret_Id);
                    request.getSession().setAttribute("menusList", menusList);
                    response.sendRedirect("MenusControlter.jsp");
                }
            }else if ("update".equals(action)){
                int menusId= Integer.parseInt(request.getParameter("menusId"));
                System.out.println(menusId);
                String menusName=request.getParameter("menusName");
                Double menusPrice= Double.parseDouble(request.getParameter("menusPrice"));
                int ret_Id= Integer.parseInt(request.getParameter("ret_Id"));
                Menus menus=new Menus(menusId,menusName,menusPrice,ret_Id);
                boolean result=menusService.updateMenusService(menus);
                if (result){
                    List <Menus> menusList = menusService.MenusByIdService(ret_Id);
                    request.getSession().setAttribute("menusList",menusList);
                    response.sendRedirect("MenusControlter.jsp");
                }else {
                    request.setAttribute("emsg","修改失败");
                    request.getRequestDispatcher("updateMenus.jsp").forward(request,response);
                }
            }else if ("find".equals(action)){
                int menusId= Integer.parseInt(request.getParameter("menusId"));
                Menus menus=menusService.getMenusByIdService(menusId);
                request.getSession().setAttribute("menus",menus);
                response.sendRedirect("updateMenus.jsp");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
