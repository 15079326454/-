<%@ page import="com.hgkj.model.entity.ShopCar" %><%--
  Created by IntelliJ IDEA.
  User: 灿啊灿
  Date: 2019/4/17
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除商品</title>
</head>
<body>
<%
    int goodId=Integer.parseInt(request.getParameter("goodId"));
    ShopCar shopCar=(ShopCar) session.getAttribute("shopCar");
    shopCar.deleteCarById(goodId);
    session.setAttribute("shopCar",shopCar);
    response.sendRedirect("showCar.jsp");
%>
</body>
</html>
