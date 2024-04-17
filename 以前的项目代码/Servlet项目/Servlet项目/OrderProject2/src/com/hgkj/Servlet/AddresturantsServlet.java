package com.hgkj.Servlet;

import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.service.Impl.MenusSeriviceImpl;
import com.hgkj.modal.service.Impl.ResturantsServiceImpl;
import com.hgkj.modal.service.MenusService;
import com.hgkj.modal.service.ResturantsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
/*管理员对餐厅的增删改查操作*/
@WebServlet(name = "AddresturantsServlet",value = "/AddresturantsServlet")
public class AddresturantsServlet extends HttpServlet {
    ResturantsService resturantsService=new ResturantsServiceImpl();
    private  MenusService menusService=new MenusSeriviceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String action=request.getParameter("action");
        PrintWriter out=response.getWriter();
        if ("all".equals(action)){
            //遍历所有餐厅
            List<Resturants> resturantsList=resturantsService.allresturantsService();
            request.getSession().setAttribute("resturantsList",resturantsList);
            response.sendRedirect("ResturantsControlter.jsp");
        }else if ("insert".equals(action)){
            //添加餐厅
          String ret_Name=request.getParameter("ret_Name");
          String ret_Address=request.getParameter("ret_Address");
          String ret_Path=request.getParameter("ret_Path");
            String ret_Introduc=request.getParameter("ret_Introduce");
          Resturants resturants=new Resturants(ret_Name,ret_Address,ret_Path,ret_Introduc);
              boolean result=resturantsService.addResturantsService(resturants);
            if (result) {
                request.getSession().setAttribute("resturants",resturants);
                response.sendRedirect("AddresturantsServlet?action=all");
            }else {
                request.setAttribute("emsg","添加失败");
                request.getRequestDispatcher("addResturants.jsp");
            }
        }
        else if ("delete".equals(action)){
            //删除餐厅
            int ret_Id = Integer.parseInt(request.getParameter("ret_Id"));
            boolean resultmeans=menusService.delMenusAllByIdService(ret_Id);
            boolean result = resturantsService.delResturantsByIdService(ret_Id);
//            boolean result1=menusService.delMenusByIdService(ret_Id);
            response.sendRedirect("AddresturantsServlet?action=all");
            out.print(result);
            out.print(resultmeans);


        }else if ("update".equals(action)){
            //修改餐厅
            int ret_Id=Integer.parseInt(request.getParameter("ret_Id"));
            System.out.println(ret_Id);
            String ret_Name=request.getParameter("ret_Name");
            String ret_Address= request.getParameter("ret_Address");
            String ret_Path= request.getParameter("ret_Path");
            String ret_Introduce= request.getParameter("ret_Introduce");
            Resturants resturants=new Resturants(ret_Id,ret_Name,ret_Address,ret_Path,ret_Introduce);
            boolean result=resturantsService.updateResturantsByIdService(resturants);
            if (result){
                List<Resturants> resturantsList=resturantsService.allresturantsService();
                request.getSession().setAttribute("resturantsList",resturantsList);
                response.sendRedirect("ResturantsControlter.jsp");
            }else {
                request.setAttribute("emsg","修改失败");
                request.getRequestDispatcher("updateRestruants.jsp").forward(request,response);
            }
        }else if ("find".equals(action)){
            int ret_Id= Integer.parseInt(request.getParameter("ret_Id"));
            Resturants resturants=resturantsService.getRestByIdService(ret_Id);
            request.getSession().setAttribute("resturants",resturants);
            response.sendRedirect("updateRestruants.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
