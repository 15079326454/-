<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/15
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
</head>
<body>
<%@include file="commons/adminHeadTop.jsp"%>

<div class="main-1">
    <div class="container">
        <div class="register">
            <form action="AddAdminServlet?action=update" method="post">
                <div class="register-top-grid">
                    <h3>个人信息</h3>

                        <input type="hidden"name="adminId"id="adminId"value="${admins.adminId}">

                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>管理员名称<label>*</label></span>
                        <input type="text" name="adminName"id="adminName" value="${admins.adminName}">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>管理员密码<label>*</label></span>
                        <input type="text" name="adminPwd"id="adminPwd" value="${admins.adminPwd}">
                    </div>

                </div>



                <div class="clearfix"> </div>
                <div class="register-but">
                    <input type="submit" value="修改">
                    <div class="clearfix"> </div>
                </div>
            </form>
        </div>

    </div>
</div>

</body>
</html>
