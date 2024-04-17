<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Login :: w3layouts</title>
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
<%--	<style>

		#input{
			height: 30px;
		}
		#imag{
			position: relative;
			top: 11px;
		}
	</style>
	<script>
        function chancode(obj) {
            obj.src="/YzmServlet?r="+Math.random();
        }
        function check() {
			var a=document.getElementById("input").value;
			var b=document.getElementById("imag").value;
			if (a==b){
			    window.location.href="UsersServlet";
			} else {
			    document.getElementById("aa").innerHTML="不正确";
				document.getElementById("aa").style.color="red";
				window.location.href="login.jsp";
			}
        }
	</script>--%>
</head>
<body>
<!-- header -->
<div class="head-top">
			
		</div>
<jsp:include page="commons/headTop.jsp"/>

<!-- header -->
<!-- register -->
	<div class="login-page">
		<div class="container">
			<div class="account_grid">
				<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s">
					<h3>NEW CUSTOMERS</h3>
					<p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
					<a class="acount-btn" href="register.jsp">Create an Account</a>
			   </div>
			   <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s">
					<h3>REGISTERED CUSTOMERS</h3>
					<p>If you have an account with us, please log in.</p>
					<form action="UsersServlet" method="post">
						<div>
							<span>Email Address<label>*</label></span>
							<input type="text" id="userEmail" name="userEmail">
						</div>
						<div>
							<span>Password<label>*</label></span>
							<input type="password" id="userPwd" name="userPwd">

						</div>
						<%--<input type="text" value="code"width="150px" id="input"name="yzm">
						<a href="login.jsp">看不清</a>
						<img src="YzmServlet" onclick="changcode(this)" id="imag" name="imgyzm">
						<span id="aa"></span>--%>
						<input type="submit" value="Login">
						<a class="forgot" href="admin.jsp"style="color: #d43f3a;">Admin Sign In</a>
						<a class="forgot" href="#">Forgot Your Password?</a>


					</form>
			   </div>	
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>


<!-- register -->	
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