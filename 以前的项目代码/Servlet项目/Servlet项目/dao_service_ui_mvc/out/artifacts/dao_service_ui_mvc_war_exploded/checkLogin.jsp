<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/16
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
><%
    if (session.getAttribute("users")==null){
        response.sendRedirect("index.jsp");
        return;
    }
%>
