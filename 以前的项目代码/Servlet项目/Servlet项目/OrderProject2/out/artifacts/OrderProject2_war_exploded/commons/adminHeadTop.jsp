<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/16
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员的页面标头</title>
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


<!-- header -->

<div class="header">

    <div class="container">
        <div class="logo">
            <a href="index.jsp"><img src="images/logo.png" class="img-responsive" alt=""></a>
        </div>
        <div class="header-left">
            <div class="head-nav">
                <span class="menu"> </span>
                <ul style="font-size: 12px">
                    <li><a href="index.jsp">首页</a></li>
                    <li><a href="commons/adminHeadTop.jsp">管理员首页</a></li>
                    <li><a href="AddAdminServlet?action=all">管理员相关</a></li>
                    <li><a href="AddresturantsServlet?action=all">商铺相关</a></li>
                    <li><a href="AllMenuslServlet?">菜品相关</a></li>
                    <li><a href="addAdmins.jsp">添加管理员</a></li>
                    <li><a href="addResturants.jsp">添加餐厅</a></li>
                    <li><a href="#">添加菜品</a></li>
                    <div class="clearfix"> </div>
                </ul>
                <!-- script-for-nav -->
                <script>
                    $( "span.menu" ).click(function() {
                        $( ".head-nav ul" ).slideToggle(300, function() {
                            // Animation complete.
                        });
                    });



                </script>

                <!-- script-for-nav -->
            </div>
        </div>

    </div>
</div>

<!-- header -->
</body>
</html>
