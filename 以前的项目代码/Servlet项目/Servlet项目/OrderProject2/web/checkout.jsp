<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Checkout :: w3layouts</title>
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
<!-- checkout -->
<div class="cart-items">
	<div class="container">
			 <h1>My Shopping Bag</h1>
				<script>

					function countOrders(countPrice) {
						var goodNumber=$("#goodNumber").val();
						var adressArray=new Array();
						$("#address").each(function (i) {
						    adressArray[i]=$(this).val();

                        });
						alert(adressArray);
						window.location.href="CountOrdersServlet?goodNumber="+goodNumber+"&countPrice="+countPrice+"&adressArray="+adressArray;
                    }
					//删除单个菜品
                    function delOrdaer(index){
                        window.location.href="delOrderByIdServlet?menusId="+index;
                    }

			   </script>


		<c:forEach items="${restMenusList.list}" var="RestMenus" varStatus="status">

                <div class="cart-header3">
				<div class="cart-sec simpleCart_shelfItem">
					<div class="close1" onclick="delOrdaer(${status.index})"> </div>
					<div class="cart-item cyc">
						<img src="${RestMenus.menusPhot}" class="img-responsive" alt="">
					</div>
					<div class="cart-item-info">

						<ul class="qty">
							<h3>餐厅名：<a href="#"> ${RestMenus.ret_Name} </a></h3><br>
							<li><p>菜名:${RestMenus.menusName}</p></li>
                             <br><br>
							<p>价格:${RestMenus.menusPrice}</p><br>
							<p>地址：-${RestMenus.ret_Address}</p><br><br>
						</ul>
						<div class="delivery">
							<div class="delivery">
							 <span><p>数量:</p>
									<p>${restMenusList.goodNumber}</p></span>

						      <span><p>合计:</p>
									<p>${countPrice1}</p></span>

							<div class="clearfix"></div>
						</div>

						</div>

				</div>
			</div>
</div>
		</c:forEach>
		<input type="hidden" id="goodNumber" value="${restMenusList.goodNumber}">
		总价：<input type="text" value="${countPrice}" disabled="true">
		<input type="button" value="结算" onclick="countOrders(${countPrice})">
<%--
		<a class="morebtn hvr-rectangle-in" href="orders.jsp"style="margin-top: 30px;text-align: center;width: 180px;margin-left: 30px">返回上一页</a>
--%>

		 </div>
		 </div>
<!-- checkout -->
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