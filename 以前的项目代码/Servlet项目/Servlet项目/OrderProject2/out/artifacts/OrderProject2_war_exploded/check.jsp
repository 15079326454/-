<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/15
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if( session.getAttribute("adminsList")==null){
        response.sendRedirect("AddAdminServlet?action=all");
        return;
    }
%>
