package com.zxdc.model.servlet;

import com.zxdc.model.entity.RestMenus;
import com.zxdc.model.entity.RestMenusList;
import com.zxdc.model.serviceImpl.MenusServiceImpl;
import com.zxdc.model.serviceInf.MenusServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 购物车更新和添加
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "AddGoodServlet",value = "/AddGoodServlet")
public class AddGoodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String menusRetId = request.getParameter("menusRetId");
       // System.out.println(menusRetId);
        if(menusRetId==null){
            response.sendRedirect("checkout.jsp");
        }else {
            MenusServiceInf serviceInf = new MenusServiceImpl();
            RestMenus restMenus = serviceInf.queryMenusByRetId(Integer.parseInt(menusRetId));
            HttpSession session = request.getSession();
            RestMenusList restMenusList = null;
            if (session.getAttribute("restMenusList") != null) {
                boolean flag = false;
                restMenusList = (RestMenusList) session.getAttribute("restMenusList");
                List<RestMenus> menusList = restMenusList.getList();
                //判断商品是否重复
                for (RestMenus restmenus : menusList) {
                    if (restmenus.getRetId() == restMenus.getRetId()) {
                        int goodNumber = restMenusList.getGoodNumber();
                        restMenusList.setGoodNumber(goodNumber + 1);
                        System.out.println(restMenusList.getGoodNumber());
                        flag = true;
                    }
                }
                if (!flag) {
                    menusList.add(restMenus);
                }
                //更新购物车数据
                restMenusList.setList(menusList);
            } else {
                restMenusList = new RestMenusList();
                List<RestMenus> list = restMenusList.getList();
                list.add(restMenus);
                restMenusList.setList(list);

            }
            session.setAttribute("restMenusList", restMenusList);
            List<RestMenus> list = restMenusList.getList();
            double countPrice = 0;
            for (RestMenus menus : list) {
                double menusPrice = menus.getMenusPrice();
                countPrice += menusPrice;
            }
            System.out.println(list);
            int goodNumber = restMenusList.getGoodNumber();
            countPrice = countPrice * goodNumber;
            System.out.println(countPrice);
            session.setAttribute("countPrice", countPrice);
            response.sendRedirect("orders.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
