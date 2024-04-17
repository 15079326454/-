<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/13
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订单</title>
</head>
<body>
<!-- header -->
<div class="head-top">

</div>
<jsp:include page="commons/headTop.jsp"/>
<!-- header -->
<table border="1">
    <tr>
        <td>订单总价</td>
        <td>订单产生时间</td>
        <td>商家地址</td>
    </tr>

    <c:forEach items="${listOrders}" var="ordrs">
        <tr>
            <td>${ordrs.orderprice}</td>
            <td>${ordrs.ordertime}</td>
            <td>${ordrs.orderadress}</td>
        </tr>
    </c:forEach>

</table>




</body>
</html>
