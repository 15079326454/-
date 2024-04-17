<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/17
  Time: 8:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>餐厅修改</title>
</head>
<body>
<%@include file="commons/adminHeadTop.jsp"%>



<div class="main-1">
    <div class="container">
        <div class="register">
            <form action="AddresturantsServlet?action=update" method="post">
                <div class="register-top-grid">
                    <h3>餐厅信息</h3>
                    <div class="wow fadeInLeft" data-wow-delay="0.4s">
                        <span>餐厅编号:<label>*</label></span>
                    <input type="text"name="ret_Id"id="ret_Id"value="${resturants.ret_Id}"readonly>
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>店名:<label>*</label></span>
                        <input type="text" name="ret_Name"id="ret_Name" value="${resturants.ret_Name}">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>地址:<label>*</label></span>
                        <input type="text" name="ret_Address"id="ret_Address" value="${resturants.ret_Address}">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>餐馆图片：<label>*</label></span>
                        <input type="text" name="ret_Path"id="ret_Path" value="${resturants.ret_Path}">
                    </div>
                    <div class="wow fadeInRight" data-wow-delay="0.4s">
                        <span>餐馆介绍:<label>*</label></span>
                        <input type="text" name="ret_Introduce"id="ret_Introduce" value="${resturants.ret_Introduce}">
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
