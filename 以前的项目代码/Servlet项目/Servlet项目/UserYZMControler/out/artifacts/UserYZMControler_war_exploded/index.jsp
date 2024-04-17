<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/26
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录界面</title>
    <style>
      input{
        height: 30px;
      }

      img{
        position: relative;
        top: 11px;
      }

    </style>
    <script>
      function chancode(obj) {
          obj.src="/YzmServlet?r="+Math.random();
      }
    </script>
  </head>
  <body>

<form action="loginControler.jsp" method="post">
  <a href="newUsers.jsp">注册用户</a>
  <p><label for="userName">用户:</label><input type="text" name="userName" id="userName" style="width: 150px"></p>
  <p><label for="userPwd">密码:</label><input type="password" name="userPwd" id="userPwd" style="width: 150px"></p>
  验证码:<input type="text" value="code" style="width: 150px">
  <a href="index.jsp">看不清</a>
  <img src="/YzmServlet" onclick="chancode(this)">
  <p><input type="submit" value="登录"><input type="reset" value="重置"></p>
</form>
  </body>
</html>
