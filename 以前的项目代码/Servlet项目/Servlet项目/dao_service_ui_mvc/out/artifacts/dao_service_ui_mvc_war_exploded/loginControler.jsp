<%@ page import="com.hgkj.model.entity.Users" %>
<%@ page import="com.hgkj.model.service.UsersService" %>
<%@ page import="com.hgkj.model.service.impl.UsersServicelmpl" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/15
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录处理</title>
</head>
<body><%
    request.setCharacterEncoding("UTF-8");
    String userName=request.getParameter("userName");
    String userPwd=request.getParameter("userPwd");
    Users users=new Users(userName,userPwd);
    UsersService usersService=new UsersServicelmpl();
    boolean result=usersService.userLoginService(users);
    if(result){
        session.setAttribute("users",users);
        response.sendRedirect("goodControler.jsp");
    }else{
        response.sendRedirect("index.jsp");
    }
%>
</body>
</html>
