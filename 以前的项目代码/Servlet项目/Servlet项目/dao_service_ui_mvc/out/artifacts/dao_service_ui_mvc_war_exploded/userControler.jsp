<%@ page import="com.hgkj.model.service.UsersService" %>
<%@ page import="com.hgkj.model.service.impl.UsersServicelmpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hgkj.model.entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/15
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询所有用户</title>
</head>
<body><%
    UsersService usersService=new UsersServicelmpl();
    List<Users> usersList=usersService.allGoodService();
    session.setAttribute("usersList",usersList);
    response.sendRedirect("welcome.jsp");
%>
</body>
</html>
