<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/8
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        function AddGoodBtn(retId) {
           // alert(retId);
            window.location.href="AddGoodServlet?menusRetId="+retId;
        }
    </script>
</head>
<body>

<c:if test="${not empty menusList}">
    <c:forEach items="${menusList}" var="menus">
        <div class="order-top">
            <li class="data"><h4>${menus.menusname}</h4>
                <p>${menus.menusprice}</p>
            </li>
            <li class="data">
                <div class="special-info grid_1 simpleCart_shelfItem">
                    <h4>${menus.menusname}</h4>
                    <div class="pre-top">
                        <div class="pr-left">
                            <div class="item_add"><span class="item_price"><h6>ONLY $${menus.menusprice}</h6></span></div>
                        </div>
                        <div class="pr-right">
                            <%--
                            添加购物车的按钮
                 <div class="item_add"><span class="item_price"><a href="#">Pick</a></span></div>
                    添加购物车
                            --%>
                            <div onclick="AddGoodBtn(${menus.retId})"><span class="item_price"><a href="#">Pick</a></span></div>
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
    <h1>空空如也。。。。</h1>
</c:if>

</body>
</html>
