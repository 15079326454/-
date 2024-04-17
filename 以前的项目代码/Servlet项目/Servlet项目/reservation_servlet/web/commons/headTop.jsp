<%@ page import="com.zxdc.model.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/7
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="header">

${user.userfristname}
    <div class="container">
        <div class="logo">
            <a href="index.jsp"><img src="images/logo.png" class="img-responsive" alt=""></a>
        </div>
        <div class="header-left">
            <div class="head-nav">
                <span class="menu"> </span>
                <ul>
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href=" resturants.jsp">Resturants</a></li>
                    <li><a href="login.jsp">Sign In</a></li>
                    <li><a href=" contact.jsp">Contact</a></li>
                    <li><a href="admin.jsp">管理员</a></li>
                    <div class="clearfix"> </div>
                </ul>
                <!-- script-for-nav -->
                <script>

                    function cleaCar(){
                        window.location.href="cleaCarServlet";
                    }

                    $( "span.menu" ).click(function() {
                        $( ".head-nav ul" ).slideToggle(300, function() {
                            // Animation complete.
                        });
                    });
                </script>
                <!-- script-for-nav -->
            </div>
            <div class="header-right1">
                <div class="cart box_1">
                    <a href="checkout.jsp">
                        <h3> <span > 总价${countPrice} </span> (<span>  <c:if test="${restMenusList.goodNumber>1}">${restMenusList.goodNumber}</c:if>  </span> items)<img src="images/bag.png" alt=""></h3>
                    </a>
                    <p><a href="javascript:cleaCar();" class="simpleCart_empty">empty card</a></p>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
</body>
</html>
