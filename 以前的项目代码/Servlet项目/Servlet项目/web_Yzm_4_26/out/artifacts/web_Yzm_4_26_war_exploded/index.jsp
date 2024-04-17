<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/26
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style>
          input{
              height: 30px;
          }
          img{
              position: relative;
              top: 11px;
          }
      </style>

  </head>
  <body>
<form method="post" action="uploadServlet"enctype="multipart/form-data">

  文件：<input type="file" name="fileName"><br/>
  作者：<input type="text" name="userName"><br>
        <input type="submit" value="上传">
</form>

验证码：<input type="text" value="code">
<a href="index.jsp">看不清换一张</a>
         <img src="/YZMServlet" onclick="chancode(this)">
  </body>
</html>
