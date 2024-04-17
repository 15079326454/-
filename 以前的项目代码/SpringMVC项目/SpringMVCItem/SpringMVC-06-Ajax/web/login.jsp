<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="statics/jquery-3.5.0.js"></script>
    <script>
        function p1(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{'name':$("#name").val()},
                success:function (data){
                    if (data.toString()=="OK"){
                        $("#userInfo").css("color","green");
                    }else {
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            });
        }
        function p2(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{'pwd':$("#pwd").val()},
                success:function (data){
                    if (data.toString()=="OK"){
                        $("#pwdInfo").css("color","green");
                    }else {
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                }
            });
        }

    </script>
</head>
<body>
<p>
    用户名：<input type="text" id="name" onblur="p1()"/>
    <span id="userInfo"></span>
</p>
<p>
    密码：<input type="text" id="pwd" onblur="p2()"/>
    <span id="pwdInfo"></span>
</p>
</body>
</html>
