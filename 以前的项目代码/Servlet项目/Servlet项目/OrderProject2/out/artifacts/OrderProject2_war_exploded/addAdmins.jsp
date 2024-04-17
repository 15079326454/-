<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/15
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员管理页面</title>
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
<%@include file="commons/adminHeadTop.jsp"%>

<div class="main-1">
    <div class="container">
        <div class="register">
            <form action="AddAdminServlet?action=insert" method="post">
                <div class="register-top-grid">
                    <h3>添加管理员</h3>

                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>管理员账户：<label>*</label></span>
                        <input type="text" name="adminName"id="adminName">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>管理员密码：<label>*</label></span>
                        <input type="text" name="adminPwd"id="adminPwd">
                    </div>

                </div>



                <div class="clearfix"> </div>
                <div class="register-but">
                    <input type="submit" value="添加">
                    <div class="clearfix"> </div>
                </div>
            </form>
        </div>

    </div>
</div>

</body>
</html>
