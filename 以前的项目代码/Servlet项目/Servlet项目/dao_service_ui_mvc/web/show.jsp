<%@ page import="com.hgkj.model.entity.Users" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hgkj.model.entity.Good" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/16
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>展示页面</title>
</head>
<body><%

    if (session.getAttribute("users")==null){
        out.print("<a href='index.jsp'>登录</a><br>");
    }else {
        Users users= (Users) session.getAttribute("users");
        out.print("欢迎:"+users.getUserName()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='showCar.jsp'>查看购物车</a><br>");
    }
    List<Good> goodList= (ArrayList<Good>) session.getAttribute("goodList");

%>

<table border="1" style="border-color: deepskyblue">
    <tr>
    <td>商品编码</td>
    <td>商品名称</td>
    <td>商品价格</td>
    <td>商品产地</td>
    <td>商品描述</td>
    <td>操作</td>
</tr>
  <%
      for (Good gd:goodList){
    %>
    <tr>
        <td><%=gd.getGoodId()%></td>
        <td><%=gd.getGoodName()%></td>
        <td><%=gd.getGoodPrice()%></td>
        <td><%=gd.getGoodAddress()%></td>
        <td><%=gd.getGoodDesp()%></td>
        <td><a href="buyControler.jsp?<%=gd.getGoodId()%>">购物</a></td>


    </tr>

    <%

  }  %>


</table>

</body>

</html>