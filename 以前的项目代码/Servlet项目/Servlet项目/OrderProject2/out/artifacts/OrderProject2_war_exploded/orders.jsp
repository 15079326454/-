<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Orders :: w3layouts</title>
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
<script>
    function AddGoodBtn(menusId) {
        // alert(retId);
        window.location.href="AddOrdersServlet?menudId="+menusId;
    }

</script>
<!-- header -->
<div class="head-top">

		</div>
<jsp:include page="commons/headTop.jsp"/>
<!-- header -->
<!-- about -->
            ${msg}
		<c:if test="${not empty menusList}">
			<c:forEach items="${menusList}" var="menus">
				<div class="order-top">
					<li class="im-g"><a href="#"><img src="${menus.menusPhot}" class="img-responsive" alt=""style="height: 200px;"></a></li>
					<li class="data"><h4>${menus.menusName}</h4><br>
						<p>${menus.menusPrice}</p><br>
					</li>
					<li class="data">
						<div class="special-info grid_1 simpleCart_shelfItem">
							<h4>${menus.menusName}</h4><br>
							<div class="pre-top">
								<div class="pr-left">
									<div class="item_add"><span class="item_price"><h6>ONLY $${menus.menusPrice}</h6></span></div>
								</div>
								<div class="pr-right">
										<%--
                                        添加购物车的按钮
                                    <div class="item_add"><span class="item_price"><a href="#">Pick</a></span></div>
                                    添加购物车
                                        --%>
									<div onclick="AddGoodBtn(${menus.menusId})"><span class="item_price"><a href="#"style="float: right;">Pick</a></span></div>
								</div>
								<div class="clearfix"></div>
							</div>

						</div>
					</li>
					<div class="clearfix"></div>
				</div>
			</c:forEach>
		</c:if>

<c:if test="${empty menusList}">
	<h1>还没有任何菜品，不好意思</h1>
</c:if>
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