<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/4/10
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登陆</title>
    <link type="text/css" rel="stylesheet" href="style/reset.css">
    <link type="text/css" rel="stylesheet" href="style/main.css">
</head>

<body>
<div class="headerBar">
    <div class="logoBar login_logo">
        <div class="comWidth">
            <div class="logo fl">
            </div>
            <h3 class="welcome_title">欢迎登陆</h3>
        </div>
    </div>
</div>
<s:form action="employee_Login" method="post" namespace="">

    <div class="loginBox">
        <div class="login_cont">
            <ul class="login">
                <li class="l_tit">用户名</li>
                <li class="mb_10"><input type="text" name="uername" class="login_input user_icon"></li>
                <li class="l_tit">密码</li>
                <li class="mb_10"><input type="text" name="password" class="login_input user_icon"></li>

                <li><input type="submit" value="" class="login_btn"></li>
            </ul>
            <div class="login_partners">
                <p class="l_tit">使用合作方账号登陆网站</p>
                <ul class="login_list clearfix">
                    <li><a href="#">QQ</a></li>
                    <li><span>|</span></li>
                    <li><a href="#">网易</a></li>
                    <li><span>|</span></li>
                    <li><a href="#">新浪微博</a></li>
                    <li><span>|</span></li>
                    <li><a href="#">腾讯微薄</a></li>
                    <li><span>|</span></li>
                    <li><a href="#">新浪微博</a></li>
                    <li><span>|</span></li>
                    <li><a href="#">腾讯微薄</a></li>
                </ul>
            </div>
        </div>

    </div>

</s:form>
<div class="hr_25"></div>
<div class="footer">
    <p><a href="#">慕课简介</a><i>|</i><a href="#">慕课公告</a><i>|</i> <a href="#">招纳贤士</a><i>|</i><a href="#">联系我们</a><i>|</i>客服热线：400-675-1234</p>
    <p>Copyright &copy; 2006 - 2014 慕课版权所有&nbsp;&nbsp;&nbsp;京ICP备09037834号&nbsp;&nbsp;&nbsp;京ICP证B1034-8373号&nbsp;&nbsp;&nbsp;某市公安局XX分局备案编号：123456789123</p>
    <p class="web">
        <a href="#">
            <img src="images/webLogo.jpg" alt="logo"></a>
        <a href="#">
            <img src="images/webLogo.jpg" alt="logo"></a>
        <a href="#">
            <img src="images/webLogo.jpg" alt="logo"></a>
        <a href="#">
            <img src="images/webLogo.jpg" alt="logo"></a>
    </p>
</div>
</body>
</html>