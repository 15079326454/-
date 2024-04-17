<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/17
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示菜品</title>
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
        function AddGoodBtn(menusId) {
            // alert(retId);
            window.location.href="AddOrdersServlet?menudId="+menusId;
        }

    </script>
</head>
<body>

<!-- header -->
<div class="head-top">

</div>
<jsp:include page="commons/headTop.jsp"/>
<!-- header -->
<c:if test="${empty restult}">
    查无此菜品
</c:if>
<c:if test="${not empty restult}">
    <div class='order-top'>
        <li class='im-g'>
            <%--<a href='#'><img src='${restult.ret_Path}' class='img-responsive' alt=''></a>--%>
        <li class="im-g"><a href="#"><img src="${restult.menusPhot}" class="img-responsive" alt=""style="width: 300px;height: 200px"></a></li>
        </li><li class='data'><h4>${restult.menusName}</h4>
        <p>$${restult.menusPrice}</p>
        <P>餐厅编号： ${restult.ret_Id}</P></li>
        <li class='bt-nn'>
                <%--<a class='morebtn hvr-rectangle-in' href='menusByRedIdServlet?retId=${resturantsByAdd.retId}'>Explore</a>--%>
                    <div onclick="AddGoodBtn(${menus.menusId})"><span class="item_price"><a href="#"style="margin-right: 300px;float: right">Pick</a></span></div>
        </li>
        <div class='clearfix'></div></div>

</c:if>
</body>
</html>
