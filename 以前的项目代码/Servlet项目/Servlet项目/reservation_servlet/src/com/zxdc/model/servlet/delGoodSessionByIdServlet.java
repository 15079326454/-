package com.zxdc.model.servlet;

import com.zxdc.model.entity.RestMenus;
import com.zxdc.model.entity.RestMenusList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
@WebServlet(name = "delGoodSessionByIdServlet",value = "/delGoodSessionByIdServlet")
public class delGoodSessionByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodId = request.getParameter("goodId");
        HttpSession session = request.getSession();
        RestMenusList restMenusList = (RestMenusList)session.getAttribute("restMenusList");
        List<RestMenus> list = restMenusList.getList();
        RestMenus remove = list.remove(Integer.parseInt(goodId));
        //更新总钱数和商品订单
        int goodNumber = restMenusList.getGoodNumber();
        restMenusList.setGoodNumber(1);
        double countPrice = (double)session.getAttribute("countPrice");
        countPrice = countPrice-remove.getMenusPrice()*goodNumber;
        session.setAttribute("countPrice",countPrice);
        restMenusList.setList(list);
        session.setAttribute("restMenusList",restMenusList);
        response.sendRedirect("checkout.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
