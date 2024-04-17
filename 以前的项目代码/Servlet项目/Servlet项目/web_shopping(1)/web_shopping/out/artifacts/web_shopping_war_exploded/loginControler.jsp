<%@ page import="com.hgkj.model.entity.Users" %>
<%@ page import="com.hgkj.model.service.UsersService" %>
<%@ page import="com.hgkj.model.service.impl.UsersServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: 灿啊灿
  Date: 2019/4/16
  Time: 16:07
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
    UsersService us=new UsersServiceImpl();
    boolean result=us.userLoginService(users);
    if (result){
        session.setAttribute("users",users);
        //response.sendRedirect("checkgood.jsp");
        response.sendRedirect("checkgood.jsp");
    }else {
        response.sendRedirect("index.jsp");
    }

%>
</body>
</html>
