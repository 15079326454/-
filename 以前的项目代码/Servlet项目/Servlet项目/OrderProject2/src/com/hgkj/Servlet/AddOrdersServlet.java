package com.hgkj.Servlet;

import com.hgkj.modal.entity.RestMenusList;
import com.hgkj.modal.entity.RetMenus;
import com.hgkj.modal.entity.Users;
import com.hgkj.modal.service.Impl.MenusSeriviceImpl;
import com.hgkj.modal.service.MenusService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddOrdersServlet",value = "/AddOrdersServlet")
public class AddOrdersServlet extends HttpServlet {
    MenusService menusService=new MenusSeriviceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Users users= (Users) request.getSession().getAttribute("users");
        if (request.getSession().getAttribute("users")==null){
            request.getSession().setAttribute("msg","请您登陆后方可购买商品");
            response.sendRedirect("login.jsp");
            return;
        }
        String menudId=request.getParameter("menudId");
        System.out.println(menudId);
        if (menudId==null){
           response.sendRedirect("checkout.jsp");
        }else {
            System.out.println("添加的内容");

            RetMenus  retMenus=menusService.RestMenusByIdService(Integer.parseInt(menudId));
            HttpSession session=request.getSession();
            RestMenusList restMenusList = null;
            if (session.getAttribute("restMenusList")!=null){
                boolean flag=false;
                restMenusList= (RestMenusList) session.getAttribute("restMenusList");
                List<RetMenus> menusList=restMenusList.getList();
                //判断商品是否重复
                for (RetMenus restmenus:menusList){
                    if (restmenus.getRet_Id()==retMenus.getMenusId()){
                        int goodNumber=restMenusList.getGoodNumber();
                        restMenusList.setGoodNumber(goodNumber+1);
                        System.out.println(restMenusList.getGoodNumber());
                        flag=true;
                    }
                }
                if (!flag){
                    menusList.add(retMenus);
                }
                //更新购物车
                restMenusList.setList(menusList);
            }else {
                restMenusList=new RestMenusList();
                List<RetMenus> list=restMenusList.getList();
                list.add(retMenus);
                restMenusList.setList(list);
            }
            session.setAttribute("restMenusList",restMenusList);
            List<RetMenus> list=restMenusList.getList();
            double countPrice=0;
            for (RetMenus menus:list){
                double menusPrice=menus.getMenusPrice();
                countPrice+=menusPrice;
            }
            System.out.println(list);
            int goodNumber=restMenusList.getGoodNumber();
            countPrice=countPrice*goodNumber;
            System.out.println(countPrice);
            session.setAttribute("countPrice",countPrice);
            response.sendRedirect("orders.jsp");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
