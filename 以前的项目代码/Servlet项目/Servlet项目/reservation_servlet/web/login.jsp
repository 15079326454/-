<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/7
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<!-- header -->
<div class="head-top">

</div>
<!-- 导航栏 -->
<jsp:include page="commons/headTop.jsp"/>

<!-- header -->
<!-- register -->
<div class="login-page">
    <div class="container">
        <div class="account_grid">
            <div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s">
                <h3>NEW CUSTOMERS</h3>
                <p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
                <a class="acount-btn" href="register.jsp">Create an Account</a>
            </div>
            <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s">
                <h3>REGISTERED CUSTOMERS</h3>
                <p>If you have an account with us, please log in.</p>


                <!-- 登陆处理 -->
                <form action="UserLoginServlet">
                    ${msg}
                    <div>
                        <span>用户账号<label>*</label></span>
                        <input type="text" name="userFirstName">
                    </div>
                    <div>
                        <span>用户密码<label>*</label></span>
                        <input type="password" name="pwd">
                    </div>
                    <a class="forgot" href="#">Forgot Your Password?</a>
                    <input type="submit" value="Login">
                </form>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>


<!-- register -->
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