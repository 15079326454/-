<%@ page import="com.hgkj.model.entity.ShopCar" %><%--
  Created by IntelliJ IDEA.
  User: 灿啊灿
  Date: 2019/4/16
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>清空购物车</title>
</head>
<body>
<%
    ShopCar shopCar=(ShopCar) session.getAttribute("shopcar");
    shopCar.clearCar();
    session.setAttribute("shopCar",shopCar);
    response.sendRedirect("showCar.jsp");
%>
</body>
</html>
