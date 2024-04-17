<%@ page import="com.hgkj.model.entity.Good" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/18
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改商品</title>
    <script>
        function goBack() {
            window.location.href="show.jsp";
        }
    </script>
</head>
<body><%
    Good good= (Good) session.getAttribute("good");
%>
<form action="UpdateGoodServlet" method="post">
    <p><label for="goodName">商品名称：</label><input type="text" name="goodName"id="goodName" value="<%=good.getGoodName()%>"></p>
    <p><label for="goodPrice">商品价格：</label><input type="text" name="goodPrice"id="goodPrice" value="<%=good.getGoodPrice()%>"></p>
    <p><label for="goodAddress">商品产地：</label><input type="text" name="goodAddress"id="goodAddress" value="<%=good.getGoodAddress()%>"></p>
    <span style="color: red"><%=request.getAttribute("emsg")==null?"":request.getAttribute("emsg")%></span>
    <p><input type="submit" value="添加"><input type="button" value="返回" onclick="goBack()"></p>

</form>
</body>
</html>
