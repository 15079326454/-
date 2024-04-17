<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/2/26
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>失去焦点时，发送请求</title>
    <script src="statics/jquery-3.5.0.js"></script>
<script>
function a(){
  $.post({
    url:"${pageContext.request.contextPath}/a1",
    data:{"name":$("#userName").val()},
    success:function (data,status){
    console.log("data="+data);
    console.log("status="+status);
    }
  })
}
</script>
  </head>


  <body>
  用户名：<input type="text" id="userName" onblur="a()">
  </body>
</html>
