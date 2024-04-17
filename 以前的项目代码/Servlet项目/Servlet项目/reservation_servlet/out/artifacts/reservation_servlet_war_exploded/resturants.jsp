<%--
 查询所有的餐馆
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Resturant :: w3layouts</title>
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
<!-- 导航栏 -->
<jsp:include page="commons/headTop.jsp"/>

<!-- header -->
<!-- about -->
<div class="orders">

        <!-- 查询所有餐馆 -->
<jsp:include page="commons/ContainResturants.jsp"/>


</div>
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
<script>
    getAllResAjax(1);
</script>
</html>
