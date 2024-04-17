<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/12
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Login :: w3layouts</title>
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
<script>
    function AddGoodBtn(ret_Id) {
        // alert(retId);
        window.location.href="AddOrdersServlet?orderId="+ret_Id;
    }
</script>
<!-- header -->
<div class="head-top">

</div>
<jsp:include page="commons/headTop.jsp"/>
<c:forEach items="${menusList}" var="menus">
    <div class="order-top">
        <img src="${menus.menusPhot}" class="img-responsive" alt=""style="width: 300px;height: 200px">
    <li class="data"><h4>${menus.menusName}</h4>
    <p>${menus.menusPrice}</p>
    </li>
    <li class="data">
    <div class="special-info grid_1 simpleCart_shelfItem">
    <h4>${menus.menusName}</h4>
    <div class="pre-top">
    <div class="pr-left">
    <div class="item_add"><span class="item_price"><h6>ONLY $${menus.menusPrice}</h6></span></div>
    </div>
    <div class="pr-right">
    <%--
    添加购物车的按钮
<div class="item_add"><span class="item_price"><a href="#">Pick</a></span></div>
添加购物车
    --%>
    <div onclick="AddGoodBtn(${menus.ret_Id})"><span class="item_price"><a href="#">Pick</a></span></div>
    </div>
    <div class="clearfix"></div>
    </div>

    </div>
    </li>
    <div class="clearfix"></div>
    </div>
</c:forEach>
<!-- about -->
<!-- footer-->
<div class="footer">
    <div class="container">
        <div class="footer-left">
            <p>Copyrights © 2015 SpiceMystery All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
        </div>
        <div class="footer-right">
            <ul>
                <li><a href="#"><i class="fbk"></i></a></li>
                <li><a href="#"><i class="googpl"></i></a></li>
                <li><a href="#"><i class="link"></i></a></li>
                <li><a href="#"><i class="rss"></i></a></li>
                <li><a href="#"><i class="twt"></i></a></li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!-- footer-->
</body>
</html>