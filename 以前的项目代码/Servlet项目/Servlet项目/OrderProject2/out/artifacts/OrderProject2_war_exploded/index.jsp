<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Home :: w3layouts</title>
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
<script>
	function getMenusAll() {
		window.location.href="MenusAllServlet";
    }
    function gotoAllGood() {
		window.location.href="AddOrdersServlet";
    }
    function getMenus() {
		window.location.href="getMenusBymenusName.jsp";
    }

    function AddGoodBtn(ret_Id) {
        // alert(retId);
        window.location.href="AddOrdersServlet?munusRetId="+ret_Id;
    }

</script>

<body>
<!-- header -->
<div class="head-top">

		</div>
<jsp:include page="commons/headTop.jsp"/>

<!-- header -->
<!-- banner -->
	<div class="banner">
		<div class="container">
		<div class="b_room">
				<div class="booking_room"><br />
					<div class="reservation">
						<div class="book-top">
							<div class="b-search" onclick="getMenus()">
								<div class="boo-lef">
								<i class="sear"></i>
								<p>Search</p>
								</div>
							</div>
							<div class="pick" onclick="getMenusAll()">
								<div class="boo-lef">
								<i class="sele"></i>
								<p>Pick</p>
								</div>
							</div>
							<div class="delv" onclick="gotoAllGood()">
								<div class="boo-lef">
								<i class="ca-r"></i>
								<p>Delivered</p>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
						<ul>

								 <!----------start section_room----------->
								 <form action="resturantsByNameServlet">
									 <li class="span1_of_1">

									<input type="text" class="textbox" value="ResturantName" name="retName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Resturant Name';}">

									 </li>
							<li class="span1_of_1">

									 <div class="section_room">
										 <%--<input type="text"   value="retAddress" name="retAddress" onchange="this.value = '';" onblur="if (this.value == '') {this.value = 'retAddress';}" class="textbox">--%>


										 <input type="text" class="textbox" value="retAddress" name="retAddress" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'retAddress';}">
										 </input>
									 </div>


								 <!----------start section_room----------->

							 </li>
							 <li class="span1_of_3">
									<div class="date_btn">
											<input type="submit" value="Find resturants">
									</div>
								 </form>
							 </li>
								<div class="clearfix"></div>
						</ul>
					</div>
				</div>
			</div>
	</div>
	</div>
<!-- banner -->
<!-- latis -->
<c:forEach items="${menusList}" var="menus">
	<div class="latis">
		<div class="container">
		<div class="col-md-4 latis-left">
			<h3>Maecenas ornare enim</h3>
			<img src="images/杂酱.jpg" class="img-responsive" alt="">
			<div class="special-info grid_1 simpleCart_shelfItem">
				<p>Cum sociis natodiculus mus.rhoncus egestas ac sit </p>
				<div class="cur">
					<div class="cur-left">
						<div class="item_add"><span class="item_price"><a class="morebtn hvr-rectangle-in" href="#"onclick="AddGoodBtn(${menus.ret_Id})">Add to cart</a></span></div>
					</div>
					<div class="cur-right">
						<div class="item_add"><span class="item_price"><h6>only $45.00</h6></span></div>
					</div>
						<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="col-md-4 latis-left">
			<h3>Dis parturient montes</h3>
			<img src="images/东坡藤椒肥牛.jpg" class="img-responsive" alt="">
			<div class="special-info grid_1 simpleCart_shelfItem">
				<p>Cum sociis natodiculus mus.rhoncus egestas ac sit </p>
				<div class="cur">
					<div class="cur-left">
						<div class="item_add" onclick="AddGoodBtn(${menus.ret_Id})"><span class="item_price"><a class="morebtn hvr-rectangle-in" href="#" >Add to cart</a></span></div>
					</div>
					<div class="cur-right">
						<div class="item_add"><span class="item_price"><h6>only $55.00</h6></span></div>
					</div>
						<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<div class="col-md-4 latis-left">
			<h3>Curabitur congue blandit</h3>
			<img src="images/经典冻柠乐.jpg" class="img-responsive" alt="">
			<div class="special-info grid_1 simpleCart_shelfItem">
				<p>Cum sociis natodiculus mus.rhoncus egestas ac sit </p>
				<div class="cur">
					<div class="cur-left">
						<div class="item_add" onclick="AddGoodBtn(${menus.ret_Id})"><span class="item_price"><a class="morebtn hvr-rectangle-in" href="#">Add to cart</a></span></div>
					</div>
					<div class="cur-right">
						<div class="item_add"><span class="item_price"><h6>only $65.00</h6></span></div>
					</div>
						<div class="clearfix"> </div>
				</div>
			</div>
		</div>
			<div class="clearfix"> </div>


	</div>
	</div>
</c:forEach>
<!-- latis -->
<!-- feature -->
<div class="feature">
		<div class="container">
			<div class="fle-xsel">
				<ul id="flexiselDemo3">
					<li>

									<img src="images/沙县小吃.png" class="img-responsive" alt="" >

					</li>
					<li>

									<img src="images/港饮之港.png" class="img-responsive" alt="">

					</li>
					<li>

									<img src="images/煲仔饭.jpg" class="img-responsive" alt="">

					</li>
					<li>

									<img src="images/眉州东坡.png" class="img-responsive" alt="">


					</li>
					<li>

									<img src="images/革命小串.png" class="img-responsive" alt="">

					</li>
					<li>

									<img src="images/6p.jpg" class="img-responsive" alt="">

					</li>
					<li>

									<img src="images/7p.jpg" class="img-responsive" alt="">

					</li>
					<li>

									<img src="images/8p.jpg" class="img-responsive" alt="">

					</li>

				</ul>

							 <script type="text/javascript">
								$(window).load(function() {

									$("#flexiselDemo3").flexisel({
										visibleItems: 8,
										animationSpeed: 1000,
										autoPlay: true,
										autoPlaySpeed: 3000,
										pauseOnHover: true,
										enableResponsiveBreakpoints: true,
										responsiveBreakpoints: {
											portrait: {
												changePoint:480,
												visibleItems: 2
											},
											landscape: {
												changePoint:640,
												visibleItems: 3
											},
											tablet: {
												changePoint:768,
												visibleItems: 3
											}
										}
									});

								});
								</script>
								<script type="text/javascript" src="js/jquery.flexisel.js"></script>
					<div class="clearfix"> </div>

			</div>
		</div>
	</div>
<!-- feature -->
<!-- magnust -->
	<div class="magnust">
		<div class="container">
			<h3>Nascetur ridiculus mus</h3>
		<div class="col-md-4 magnust-top">

			<div class="magnust-left">
				<img src="images/9b.jpg" class="img-responsive" alt="">
			</div>
			<div class="magnust-right">
				<h4><a href="#">Cites of the</a></h4>
				<p> Lorem Ipsum passage, and going through the cites of the undoubtable source. Lorem sections</p>
				<a class="see" href="#">See More</a>
			</div>
				<div class="clearfix"> </div>
		</div>
		<div class="col-md-4 magnust-top">
			<div class="magnust-left">
				<img src="images/8b.jpg" class="img-responsive" alt="">
			</div>
			<div class="magnust-right">
				<h4><a href="#">Lorem Ipsum</a></h4>
				<p> Lorem Ipsum passage, and going through the cites of the undoubtable source. Lorem sections</p>
				<a class="see" href="#">See More</a>
			</div>
				<div class="clearfix"> </div>
		</div>
		<div class="col-md-4 magnust-top">
			<div class="magnust-left">
				<img src="images/10b.jpg" class="img-responsive" alt="">
			</div>
			<div class="magnust-right">
				<h4><a href="#">Will uncove</a></h4>
				<p> Lorem Ipsum passage, and going through the cites of the undoubtable source. Lorem sections</p>
				<a class="see" href="#">See More</a>
			</div>
				<div class="clearfix"> </div>
		</div>
			<div class="clearfix"> </div>
	</div>
	</div>
<!-- magnust -->
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