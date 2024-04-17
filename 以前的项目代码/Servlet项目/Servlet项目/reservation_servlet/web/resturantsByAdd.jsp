<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/9
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
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
    <jsp:include page="commons/headTop.jsp"/>
    <c:if test="${empty resturantByAdd}">
        查无此商家
    </c:if>
    <c:if test="${not empty resturantByAdd}">
        <div class='order-top'>
            <li class='im-g'>
                <a href='#'><img src='${resturantByAdd.retPic}' class='img-responsive' alt=''></a>
            </li><li class='data'><h4>${resturantByAdd.retName}</h4>
            <p>${resturantByAdd.retAddress}</p>
            <P> Many desktop publishing packages哈</P></li>
            <li class='bt-nn'>
                <a class='morebtn hvr-rectangle-in' href='menusByRedIdServlet?retId=${resturantByAdd.retId}'>Explore</a>
            </li>
            <div class='clearfix'></div></div>


    </c:if>
</body>
</html>
