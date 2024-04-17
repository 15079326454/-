<%@ page import="com.hgkj.modal.entity.Admins" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/14
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="check.jsp"%>
<html>
<head>
    <title>管理员管理界面</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Spicemystery Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Libre+Baskerville:400,700' rel='stylesheet' type='text/css'>
    <script src="js/jquery.min.js"></script>
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    <script src="js/simpleCart.min.js"> </script>
</head>
<body>
<!-- header -->
<div class="head-top">

</div>
<%@include file="commons/adminHeadTop.jsp"%>
<h2 style="color: #ac2925;text-align: center">管理员表：</h2>
<table border="1px" style="margin: auto;width: 500px;height: 350px;text-align: center">
    <tr>
        <td>管理员编号</td>
        <td>管理员名称</td>
        <td>管理员密码</td>
        <td >操作</td>
        <td>操作</td>
    </tr>
<c:forEach items="${adminsList}" var="admin">
    <tr>
        <td>${admin.adminId}</td>
        <td>${admin.adminName}</td>
        <td>${admin.adminPwd}</td>
        <td><a href="AddAdminServlet?action=find&adminId=${admin.adminId}">修改</a>
        <td><a href="AddAdminServlet?action=delete&adminId=${admin.adminId}">删除</a>

    </tr>
</c:forEach>
</table>
<hr style="color:plum;border: 1px plum dashed">



<a class="morebtn hvr-rectangle-in" href="addAdmins.jsp"style="margin: auto;width: 200px">添加管理员</a>



</body>
</html>
