<%@ page import="com.hgkj.model.entity.Users" %>
<%@ page import="com.hgkj.model.entity.ShopCar" %>
<%@ page import="com.hgkj.model.entity.GoodItem" %><%--
  Created by IntelliJ IDEA.
  User: 灿啊灿
  Date: 2019/4/16
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车展示</title>
</head>
<body>
<%
    Users users=(Users) session.getAttribute("users");
    out.print("欢迎"+users.getUserName()+"&nbsp;&nbsp;&nbsp;&nbsp;<a href='checkgood.jsp'>继续购物</a>");
    out.print("<a href='clearCarControler.jsp'>清空购物车</a><br/>");
    if (session.getAttribute("shopCar")==null){
        out.print("你的购物车是空的哦，亲！");
    }else{
        ShopCar shopCar=(ShopCar)session.getAttribute("shopCar");

%>
<table border="1px">
    <tr>
        <td>商品编号</td>
        <td>商品名</td>
        <td>价格</td>
        <td>数量</td>
        <td>描述</td>
        <td>操作</td>
    </tr>
    <%
        for (GoodItem goodItem:shopCar.getItemMap().values()){
    %>
    <tr>
        <td><%=goodItem.getGoodId()%></td>
        <td><%=goodItem.getGoodName()%></td>
        <td><%=goodItem.getGoodPrice()%></td>
        <td><%=goodItem.getCount()%></td>
        <td><a href="DeleteGoodServlet?goodId=<%=goodItem.getGoodId()%>">删除</a></td>
    </tr>
    <%
        }
    %>

    <tr>
        <td colspan="2">总计</td>
        <td colspan="3"><%=shopCar.getTotalPrice()%></td>
    </tr>
</table>
<%
    }
%>
</body>
</html>
