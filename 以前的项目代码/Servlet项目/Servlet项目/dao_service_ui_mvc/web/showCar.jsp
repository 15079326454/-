        <%@ page import="com.hgkj.model.entity.GoodItem" %>
<%@ page import="com.hgkj.model.entity.Users" %>
<%@ page import="com.hgkj.model.entity.ShopCar" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/16
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@include file="checkLogin.jsp"%>
<html>
<head>
    <title>展示购物车</title>
</head>
<body><%
    Users users = (Users) session.getAttribute("users");
    out.print("欢迎:" + users.getUserName());

    /*out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"clearCarControler.jsp\">清空购物车</a>");
    ShopCar shopCar = null;*/
    if (session.getAttribute("shopCar") == null) {
        out.print("<br>你的购物车啥都没有,亲!"+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='show.jsp'>购物</a>");
    } else {
        out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='show.jsp'>继续购物</a><br><a href='clearCarControler.jsp'>继续购物</a>");
       ShopCar shopCar = (ShopCar) session.getAttribute("shopCar");
       %>
<table border="1px">
    <tr>
        <td>商品编码</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品数量</td>
        <td>操作</td>
    </tr>

<%
       for (GoodItem goodItem:shopCar.getItemMap().values()){
           %>
    <tr>
        <td><%=goodItem.getGoodId()%></td>
        <td><%=goodItem.getGoodName()%></td>
        <td><%=goodItem.getGoodPrice()%></td>
        <td><%=goodItem.getGetCount()%></td>
        <td><a href="deleteControler.jsp ?goodId<%=goodItem.getGoodId()%>">删除</a></td>
    </tr>
      <% }%>
    <tr>
        <td colspan="2">总计</td>
        <td colspan="3"><%=shopCar.getTotalMoney()%></td>
    </tr>
</table>
      <%
    }
%>




</body>
</html>
