<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/15
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户登录</title>

  </head>
  <body>
  <form action="loginControler.jsp" method="post">
      <p><label for="userName">用户：</label><input type="text" name="userName" id="userName"></p>
      <p><label for="userPwd">密码：</label><input type="password" name="userPwd" id="userPwd"></p>
      <p><input type="submit" value="登录"><input type="reset" value="重置"></p>
  </form>
  </body>
</html>
