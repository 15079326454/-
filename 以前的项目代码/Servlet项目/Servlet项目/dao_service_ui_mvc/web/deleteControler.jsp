<%@ page import="com.hgkj.model.entity.ShopCar" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/16
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="checkLogin.jsp"%>
<html>
<head>
    <title>删除操作</title>
</head>
<body><%
    int goodId=Integer.parseInt(request.getParameter("goodId"));
    ShopCar shopCar=new ShopCar();
    if (session.getAttribute("shopCar")!=null){
    shopCar= (ShopCar) session.getAttribute("shopCar");
    }
    shopCar.deleteCar(goodId);
   session.setAttribute("shopCar",shopCar);
    response.sendRedirect("showCar.jsp");
%>
</body>
</html>
