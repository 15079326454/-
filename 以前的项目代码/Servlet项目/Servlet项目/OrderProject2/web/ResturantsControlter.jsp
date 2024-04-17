<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/15
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>餐厅管理页面</title>
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
<div class="head-top">

</div>
<%@include file="commons/adminHeadTop.jsp"%>
<a class="morebtn hvr-rectangle-in" href="addResturants.jsp" style="margin-left: 200px;margin-top: 100px">添加新餐厅</a>
<c:forEach items="${resturantsList}" var="list">

    <div class="orders">
        <div class="container">
            <div class="order-top">
                <li class="im-g"><a href="#"><img src="${list.ret_Path}" class="img-responsive" alt=""style="height: 160px;"></a></li>
                <li class="data"><h4>${list.ret_Name}</h4><br>
                    <p>${list.ret_Address}</p><br>
                    <P> ${list.ret_Introduce}</P>
                </li>
                <li class="bt-nn">
                    <a class="morebtn hvr-rectangle-in" href="MenusControlterServlet?action=all&ret_Id=${list.ret_Id}">Explore</a><br>
                    <a class="morebtn hvr-rectangle-in" href="AddresturantsServlet?action=find&ret_Id=${list.ret_Id}">修改餐厅</a><br>
                    <a class="morebtn hvr-rectangle-in" href="AddresturantsServlet?action=delete&ret_Id=${list.ret_Id}">删除餐厅</a><br>

                </li>

                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    </div>


</c:forEach>


</body>
</html>
