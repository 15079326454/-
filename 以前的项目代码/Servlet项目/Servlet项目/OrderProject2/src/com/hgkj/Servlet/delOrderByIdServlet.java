package com.hgkj.Servlet;

import com.hgkj.modal.entity.RestMenusList;
import com.hgkj.modal.entity.RetMenus;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "delOrderByIdServlet",value = "/delOrderByIdServlet")
public class delOrderByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String menusId = request.getParameter("menusId");
        HttpSession session = request.getSession();
        RestMenusList restMenusList = (RestMenusList) session.getAttribute("restMenusList");
        List<RetMenus> list = restMenusList.getList();
        RetMenus remove = list.remove(Integer.parseInt(menusId));
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
