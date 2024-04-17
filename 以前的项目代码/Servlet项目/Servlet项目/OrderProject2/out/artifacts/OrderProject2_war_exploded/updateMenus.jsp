<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/16
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜品的修改</title>
</head>
<body>
<%@include file="commons/adminHeadTop.jsp"%>





<div class="main-1">
    <div class="container">
        <div class="register">
            <form action="MenusControlterServlet?action=update" method="post">
                <div class="register-top-grid">
                    <h3>菜品信息</h3>
                    <p><input type="hidden" name="menusId" id="meanId" value="${menus.menusId}"></p>
                    <div class="wow fadeInLeft" data-wow-delay="0.4s">
                        <span>餐厅编号:<label>*</label></span>
                        <input type="text"name="ret_Id"id="ret_Id"value="${menus.ret_Id}">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>菜品名称:<label>*</label></span>
                        <input type="text" name="menusName"id="menusName" value="${menus.menusName}">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>菜品价格:<label>*</label></span>
                        <input type="text" name="menusPrice"id="menusPrice" value="${menus.menusPrice}">
                    </div>
                </div>



                <div class="clearfix"> </div>
                <div class="register-but">
                    <input type="submit" value="修改">
                    <div class="clearfix"> </div>
                </div>
            </form>
        </div>

    </div>
</div>
</body>
</html>
