<%@ page import="com.hgkj.model.entity.Users" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/15
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body><%
    Users users=(Users) session.getAttribute("users");
    List<Users> usersList=(ArrayList)session.getAttribute("usersList");
%>
欢迎<%=users.getUserName()%>
    <table border="1px">
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>用户密码</td>
        <td>用户操作</td>
    </tr>
    <%
        for (Users us:usersList){
    %>
    <tr>
        <td><%=us.getUserId()%></td>
        <td><%=us.getUserName()%></td>
        <td><%=us.getUserPwd()%></td>
        <td><a href="#">删除</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
