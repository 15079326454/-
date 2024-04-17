<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/6/19
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="updateComputer.action">
    <input type="hidden" name="computer.computerId" value="${computer.computerId}"><br>
    电脑名称：<input type="text" name="computer.computerName" value="${computer.computerName}"><br>
    电脑价格：<input type="text" name="computer.computerPrice" value="${computer.computerPrice}"><br>
    电脑类型：<input type="text" name="computer.computerType" value="${computer.computerType}"><br>
    <input type="submit" value="修改"><a href="/show.jsp"><input type="button" value="取消"></a>
</form>
</body>
</html>
