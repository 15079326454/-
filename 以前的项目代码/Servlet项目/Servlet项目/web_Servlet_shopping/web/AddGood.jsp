<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/19
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
</head>
<body>
<form action="AddGoodServlet" method="post">
    <p><label for="goodName">商品名称：</label><input type="text" name="goodName" id="goodName"></p>
    <p><label for="goodPrice">商品价格：</label><input type="text" name="goodPrice" id="goodPrice"></p>
    <p><label for="goodAddress">商品产地：</label><input type="text" name="goodAddress" id="goodAddress"></p>
    <span style="color: fuchsia"><%=request.getAttribute("emsg")==null?"":request.getAttribute("emsg")%></span>
    <p><input type="submit" value="添加"><input type="reset" value="取消"></p>
</form>
</body>
</html>
