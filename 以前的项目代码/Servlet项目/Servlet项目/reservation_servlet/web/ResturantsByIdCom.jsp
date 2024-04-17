<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/9
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
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
    <script>
        /**
         * 发送请求修改
         * @param retId
         */
        function updateResturants() {
            $("#updateResturantsById").show();
        }
    </script>
</head>
<body>
<jsp:include page="commons/headTop.jsp"/>

餐馆详情：
<table border="1">
    <tr>
        <td>餐馆名</td>
        <td>餐馆地址</td>
        <td>图片</td>
        <td>操作</td>
    </tr>
   <tr>
       <td>${resturants.retName}</td>
       <td>${resturants.retAddress}</td>
       <td><img src="${resturants.retPic}"></td>
       <td><a href="#" onclick="updateResturants()">修改</a></td>
   </tr>

</table>
该商户菜品

<table border="1">
    ${msg}
    <tr>
        <td>菜品名</td>
        <td>菜品价格</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${menusList}" var="menus">
        <tr>
            <td>${menus.menusname}</td>
            <td>${menus.menusprice}</td>
            <td>
                <a href="delMenusByRetIdServlet?retId=${menus.retId}">删除</a>
                <a href="updateMenusByRetIdServlet?retId=${menus.retId}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
添加菜品：
${msgs}
<form action="addMenusByRetIdServlet" method="get">
    <input type="hidden" value="${resturants.retId}" name="retId">
    菜品名：<input type="text" name="menusname">
    菜品价格:<input type="text" name="menusprice">
    <input type="submit" value="添加">
</form>

<%-- 餐馆修改的隐藏表单 --%>
<div id="updateResturantsById" style="display: none">
    餐馆修改：
    <form enctype="multipart/form-data" action="updateResturantsByIdServlet" method="post">
        <input type="hidden" name="retId" value="${resturants.retId}">
        餐馆名： <input type="text" name="retName" value="${resturants.retName}"> <br>
        餐馆地址： <input type="text" name="retAdress" value="${resturants.retAddress}"><br>
        餐馆图片： <input type="file" name="file" value="${resturants.retPic}"><br>
        <input type="submit" value="提交"><br>
    </form>

</div>

</body>
</html>
