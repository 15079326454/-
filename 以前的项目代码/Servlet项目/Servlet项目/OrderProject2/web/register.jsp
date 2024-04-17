<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
<title>Spicemystery a Hotel and Resturant Category Flat Bootstarp Responsive Website Template | Register :: w3layouts</title>
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
		function checkEmail() {
			var reg=/^\w+@\w{2,3}\.[a-z]{2,3}$/;
			var  userEmail=document.getElementById("userEmail").value;
			if (reg.test(userEmail)) {
			    document.getElementById("emsg").innerHTML="√";
			    document.getElementById("emsg").style.color="blue";
			}else {
			    document.getElementById("emsg").innerHTML="邮箱格式不正确";
			    document.getElementById("emsg").style.color="red";
			}

        }
        function checkFirst() {
            var name=document.getElementById("userFirstName").value;
            var name1=/^[a-zA-Z\u4e00-\u9fa5][a-zA-Z0-9\u4e00-\u9fa5]*$/;
            if ((name!=""||name!=null)&&(name1.test(name))){
                document.getElementById("fna").innerHTML="√";
                document.getElementById("fna").style.color="blue";
            } else {

                document.getElementById("fna").innerHTML="名字不能为空且由字母数字下划线1到10位组成, 不能是数字开头";
                document.getElementById("fna").style.color="red";
            }
        }
        function checkPwd() {
            var mima=/^(\w){6,12}$/;
            var userPwd=document.getElementById("userPwd").value;
            if (mima.test(userPwd)){
                document.getElementById("pwd").innerHTML="√";
                document.getElementById("pwd").style.color="blue";
            } else {
                document.getElementById("pwd").innerHTML="要求密码的格式为6-12位，只能是字母、数字和下划线";
                document.getElementById("pwd").style.color="red";
            }
        }
        function checkLast() {
            var name2=document.getElementById("userLastName").value;
            var  name3= /^[a-zA-Z\u4e00-\u9fa5][a-zA-Z0-9\u4e00-\u9fa5]*$/;
            if ((name2!=""||name!=null)&&(name3.test(name2))){
                document.getElementById("Lna").innerHTML="√";
                document.getElementById("Lna").style.color="blue";
            } else {
                document.getElementById("Lna").innerHTML="名字不能为空且由字母数字下划线1到10位组成, 不能是数字开头";
                document.getElementById("Lna").style.color="red";
                document.getElementById("Lna").style.fontSize="14px";
            }
        }
        function checkPwdText() {
              var pwd1=document.getElementById("userPwd").value;
              var pwd2=document.getElementById("userPwdText").value;
              if (pwd1!=pwd2){
                  document.getElementById("pt").innerHTML="两次密码不一致";
                  document.getElementById("pt").style.color="red";
           document.getElementById("pt").style.fontSize="14px";

			  }
        }
	</script>
</head>
<body>
<!-- header -->
<div class="head-top">
			
		</div>
<jsp:include page="commons/headTop.jsp"/>
<!-- header -->
<!-- register -->
	<div class="main-1">
		<div class="container">
			<div class="register">
		  	  <form action="insertServlet" method="post">
				 <div class="register-top-grid">
					<h3>PERSONAL INFORMATION</h3>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">

						<span>First Name<label>*</label></span>
						<input type="text"name="userFirstName"id="userFirstName"onblur="checkFirst()">
						 <span id="fna"></span>
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>Last Name<label>*</label></span>
						<input type="text" name="userLastName"id="userLastName" onblur="checkLast()">
						 <span id="Lna"></span>
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>Email Address<label>*</label></span>
						 <input type="text" name="userEmail"id="userEmail" onblur="checkEmail()">
						 <span id="emsg"></span>
					 </div>
					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Sign Up for Newsletter</label>
					   </a>
					 </div>
				     <div class="register-bottom-grid">
						    <h3>LOGIN INFORMATION</h3>
							 <div class="wow fadeInLeft" data-wow-delay="0.4s">
								<span>Password<label>*</label></span>
								<input type="password" name="userPwd" id="userPwd" onblur="checkPwd()">
								 <span id="pwd"></span><br>
							 </div>
							 <div class="wow fadeInRight" data-wow-delay="0.4s">
								<span>Confirm Password<label>*</label></span>
								<input type="password" name="userPwdText" id="userPwdText" onblur="checkPwdText()">
                                     <span id="pt"></span>

							 </div>
					 </div>

				<div class="clearfix"> </div>
				<div class="register-but">
					   <input type="submit" value="submit">
					   <div class="clearfix"> </div>
				</div>
			  </form>
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