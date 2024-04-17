<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/13
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Contact :: w3layouts</title>
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

<div class="header">

    <div class="container">
        <div class="logo">
            <a href="index.jsp"><img src="images/logo.png" class="img-responsive" alt=""></a>
        </div>
        <div class="header-left">
            <div class="head-nav">
                <span class="menu"> </span>
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="resturantsServlet">Resturants</a></li>
                    <li><a href="login.jsp">Sign In</a></li>
                    <li><a href=" contact.html">Contact</a></li>
                    <li><a href="admin.jsp">管理员</a></li>
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
            <div class="header-right1">
                <div class="cart box_1">
                    <a href="checkout.jsp">
                        <h3> <span class="simpleCart_total"id="address">总价</span> (<span <c:if test="${restMenusList.goodNumber>1}">${restMenusList.goodNumber}</c:if>  </span> items)<img src="images/bag.png" alt=""></h3>							</a>
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">empty card</a></p>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- header -->
</body>
</html>
