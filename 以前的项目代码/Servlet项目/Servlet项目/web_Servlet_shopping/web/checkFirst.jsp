<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/19
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("goodList")==null){
        response.sendRedirect("AllGoodServlet");
        return;
    }
%>