<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/7
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        function subLogin() {
            //useraddress
            var useraddress = $("#useraddress").val();
            if(useraddress==null){
                alert("地址不能为空");
                return false;
            }

            //邮箱
            var email = $("#email").val();
            var emailReg = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
            //测试邮箱
            if(!emailReg.test(email)){
                alert("邮箱地址错误!");
                return false;
            }


            //电话
            var usertel = $("#usertel").val();
            var telReg = /^[1][358][0-9]{9}$/;
            if(!telReg.test(usertel)){
                alert("手机号码填写错误"+usertel);
                return false;
            }
            //两次密码
            var pw1 = $("#pwd1").val();
            var pw2 = $("#pwd2").val();
            //密码的正则表达式
            var pwdReg = /^[a-z0-9_-]{6,18}$/;
            if(!pwdReg.test(pw1)&&pwdReg.test(pw2)){
                alert("请输入一个包含小写字母a-z,数字0-9,_,-的六位以上的密码");
                return false;
            }

            if(pw1==pw2){
                //alert(pw1);
                $("#gotoReg").submit();
            }else {
                alert("两次的密码不匹配");
                return false;
            }
        }



    </script>
</head>
<body>
<!-- header -->
<div class="head-top">

</div>
<!-- 导航栏 -->
<jsp:include page="commons/headTop.jsp"/>

<!-- header -->
<!-- register -->
<div class="main-1">
    <div class="container">
        <!-- 错误信息显示 -->
        ${msg}
            <!-- 用户提交二合一 -->
        <form action="UserRegistServlet" id="gotoReg" method="post">
        <div class="register">
            <!--  -->

                <div class="register-top-grid">
                    <h3>个人信息</h3>
                    <div class="wow fadeInLeft" data-wow-delay="0.4s">
                        <span>姓名<label>*</label></span>
                        <input type="text" name="userfristname">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>邮箱<label>*</label></span>
                        <input type="email" name="email" id="email" >
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span> 地址<label>*</label></span>
                        <input type="text" name="useraddress" id="useraddress">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span> 电话<label>*</label></span>
                        <input type="text" name="usertel" id="usertel">
                    </div>
                    <div class="clearfix"> </div>
                    <a class="news-letter" href="#">
                        <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Sign Up for Newsletter</label>
                    </a>
                </div>
                <div class="register-bottom-grid">
                    <h3>登陆信息</h3>
                    <div class="wow fadeInLeft" data-wow-delay="0.4s">
                        <span>密码<label>*</label></span>
                        <input type="password" id="pwd1">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>确认密码<label>*</label></span>
                        <input type="password" name="userpwd" id="pwd2">
                    </div>

                </div>

            <div class="clearfix"> </div>
            <div class="register-but">

                    <input type="button" value="提交" onclick="subLogin()">
                    <div class="clearfix"> </div>

            </div>
        </div>
       </form>
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
