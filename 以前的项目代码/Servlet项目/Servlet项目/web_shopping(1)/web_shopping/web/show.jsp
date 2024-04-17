<%@ page import="com.hgkj.model.entity.Users" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hgkj.model.entity.Good" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.hgkj.model.service.GoodService" %>
<%@ page import="com.hgkj.model.service.impl.GoodServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: 灿啊灿
  Date: 2019/4/16
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品展示</title>
</head>
<body>
<%
    if (session.getAttribute("users")==null){
        out.print("<a href='index.jsp'>登录</a><br>");
        GoodService goodService=new GoodServiceImpl();
        List<Good>goodList=goodService.allGoodService();
        session.setAttribute("goodList",goodList);
    }else {
        Users users=(Users) session.getAttribute("users");
        out.print("欢迎"+users.getUserName()+"&nbsp;&nbsp;&nbsp；<a href='showCar.jsp'>查看购物车</a><br>");
    }
    List<Good>goodList=(ArrayList<Good>)session.getAttribute("goodList");
%>
<table border="1px">
    <tr>
        <td>商品编号</td>
        <td>商品名</td>
        <td>产地</td>
        <td>价格</td>
        <td>描述</td>
        <td>操作</td>

        <td>操作</td>
    </tr>
    <%
        for (Good good:goodList){
    %>
    <tr>
        <td><%=good.getGoodId()%></td>
        <td><%=good.getGoodName()%></td>
        <td><%=good.getGoodAddress()%></td>
        <td><%=good.getGoodPrice()%></td>

        <td><a href="buyControler.jsp?goodId=<%=good.getGoodId()%>">购买</a></td>
        <td><a href="UpdateGoodServlet?goodId<%=good.getGoodId()%>">修改</a></td>
        <td><a href="DeleteGoodServlet?goodId<%=good.getGoodId()%>">删除</a></td>
    </tr>
   <%
        }
   %>
</table>
<a href="addgood.jsp">添加商品</a>
</body>
</html>
