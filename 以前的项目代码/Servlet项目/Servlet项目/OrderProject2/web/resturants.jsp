<%@ page import="com.hgkj.modal.entity.Resturants" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.hgkj.modal.service.ResturantsService" %>
<%@ page import="com.hgkj.modal.service.Impl.ResturantsServiceImpl" %>

<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<jsp:include page="commons/headTop.jsp"/>
<!-- header -->
<!-- about -->

<c:forEach items="${resturantsList}" var="rest">

<div class="orders">
	<div class="container">
		<div class="order-top">
			<li class="im-g"><a href="#"><img src="${rest.ret_Path}" class="img-responsive" alt="" style="height: 160px"></a></li>
			<li class="data"><h4>${rest.ret_Name}</h4><br>
				<p>${rest.ret_Address}</p><br>
				<P> ${rest.ret_Introduce}</P>
			</li>
			<li class="bt-nn">
				<a class="morebtn hvr-rectangle-in" href="MenusByIdServlet?ret_Id=${rest.ret_Id}">Explore</a>
			</li>
			<div class="clearfix"></div>
		</div>

		</div>
	</div>


<div>

</div>
</c:forEach>
<%--
	<div id="fenye">
		<a class="sg" href="AddresturantsServlet?action=all&pageIndex=1">首页</a>
		<a class="sg" href="AddresturantsServlet?action=all&pageIndex=${pageIndex-1}">上一页</a>
			${pageIndex}/${totalPage}
		<a class="sg" href="AddresturantsServlet?action=all&pageIndex=${pageIndex+1}">下一页</a>
		<a class="sg" href="AddresturantsServlet?action=all&pageIndex=${totalPage}">尾页</a>
		<input type="text" id="num" size="1"><a class="sg" href="javascript:goPage()">GO</a>
	</div>
--%>


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