<%@ page import="java.util.List" %>
<%@ page import="java.lang.management.GarbageCollectorMXBean" %>
<%@ page import="com.hgkj.model.entity.Good" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/19
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="checkFirst.jsp"%>
<html>
  <head>
    <title>展示页面</title>
  </head>
  <body><%
    List<Good> goodList= (ArrayList) session.getAttribute("goodList");
  %>
  <a href="AddGood.jsp"> 添加商品</a>
<table border="1" style="border-color: mediumspringgreen">
  <tr>
    <td>商品编号:</td>
    <td>商品名称:</td>
    <td>商品价格:</td>
    <td>商品产地:</td>
    <td>操作:</td>
  </tr>
  <%
    for (Good good:goodList){
%>
  <tr>
    <td><%=good.getGoodId()%></td>
    <td><%=good.getGoodName()%></td>
    <td><%=good.getGoodPrice()%></td>
    <td><%=good.getGoodAddress()%></td>
    <td><a href="">删除</a><a href="">修改</a></td>
  </tr>


  <% }%>
</table>

  </body>
</html>
