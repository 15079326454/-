<%@ page import="com.hgkj.model.service.GoodService" %>
<%@ page import="com.hgkj.model.service.impl.GoodServiceImpl" %>
<%@ page import="com.hgkj.model.entity.Good" %>
<%@ page import="com.hgkj.model.entity.ShopCar" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/16
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@include file="checkLogin.jsp"%>--%>
<html>
<head>
    <title>购物操作</title>
</head>
<body><%

    int goodId= Integer.parseInt(request.getParameter("goodId"));
    GoodService goodService=new GoodServiceImpl();
    Good good=goodService.getGoodByIdService(goodId);
    ShopCar shopCar=new ShopCar();
    if (session.getAttribute("shopCar")!=null){
        shopCar= (ShopCar) session.getAttribute("shopCar");

    }
    shopCar.buygood(good);
    session.setAttribute("shopCar",shopCar);
    response.sendRedirect("show.jsp");
%>
</body>
</html>
