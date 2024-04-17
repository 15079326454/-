<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/10
  Time: 21:37
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

<!-- header -->
<div class="head-top">

</div>
<jsp:include page="commons/headTop.jsp"/>
<!-- header -->
<c:if test="${empty restult}"><br><br><br>
<h1 style="color: #c9302c;font-style: italic;text-align: center;margin-top: 250px">您好，没找到您要的商家。不好意思了。</h1>
 <%--<c:forEach items="${menusList}" var="list">
        <div class="order-top">
            <li class="im-g"><a href="#"><img src="${list.menusPhot}" class="img-responsive" alt="" style="width: 300px;height: 200px"></a></li>
            <li class="data"><h4>${list.menusName}</h4>
                <p>${list.menusPrice}</p>
                餐厅的编号：<p>${list.ret_Id}</p>
            </li>
            <li class="data">
                <div class="special-info grid_1 simpleCart_shelfItem">
                    <h4>${restult.menusName}</h4>
                    <div class="pre-top">
                        <div class="pr-left">
                            <div class="item_add"><span class="item_price"><h6>ONLY $${list.menusPrice}</h6></span></div>
                        </div>
                        <div class="pr-right">

                        </div>
                        <div class="clearfix"></div>
                    </div>

                </div>
            </li>
            <div class="clearfix"></div>
        </div>


</c:forEach>--%>
</c:if>
<c:if test="${not empty restult}">
    <div class='order-top'>
        <li class='im-g'>
            <a href='#'><img src='${restult.ret_Path}' class='img-responsive' alt=''></a>
        </li><li class='data'><h4>${restult.ret_Name}</h4>
        <p>${restult.ret_Address}</p>
        <P> ${restult.ret_Introduce}</P></li>
        <li class='bt-nn'>
            <%--<a class='morebtn hvr-rectangle-in' href='menusByRedIdServlet?retId=${resturantsByAdd.retId}'>Explore</a>--%>
                <a class="morebtn hvr-rectangle-in" href="MenusByIdServlet?ret_Id=${restult.ret_Id}">Explore</a>
        </li>
        <div class='clearfix'></div></div>

</c:if>
</body>
</html>
