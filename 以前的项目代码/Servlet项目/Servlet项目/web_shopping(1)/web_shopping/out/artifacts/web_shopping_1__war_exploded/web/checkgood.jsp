<%@ page import="com.hgkj.model.service.GoodService" %>
<%@ page import="com.hgkj.model.service.impl.GoodServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hgkj.model.entity.Good" %><%--
  Created by IntelliJ IDEA.
  User: 灿啊灿
  Date: 2019/4/16
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询商品</title>
</head>
<body>
<%
    GoodService goodService=new GoodServiceImpl();
    List<Good>goodList=goodService.allGoodService();
    session.setAttribute("goodList",goodList);
    response.sendRedirect("show.jsp");
%>
</body>
</html>
