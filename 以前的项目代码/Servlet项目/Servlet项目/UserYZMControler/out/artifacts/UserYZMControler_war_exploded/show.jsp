<%@ page import="java.util.List" %>
<%@ page import="com.hgkj.model.entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/26
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示页面</title>
</head>
<body><%
    Users users= (Users) session.getAttribute("users");
  /*  List<Users> usersList= (List <Users>) session.getAttribute("users");*/
%>

欢迎<%=users.getUserName()%>来到该页面
</body>
</html>
