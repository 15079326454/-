<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/27
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户界面</title>
</head>
<body>
<form action="UsersServlet?action=insert" method="post">
    <p>用户名：<input type="text" name="userName"></p>
    <p>密码：<input type="text" name="userPwd"></p>
    <span>${emsg}</span>
    <p><input type="submit" value="注册"><input type="reset" value="取消"></p>
</form>
<%--
<form action="" enctype="multipart/form-data" method="post">
 <input type="file" name="fileName"><br>
    <input type="submit" value="上传">
--%>
 <%--   <input type="submit" value="上传">--%>

</form>
</body>
</html>
