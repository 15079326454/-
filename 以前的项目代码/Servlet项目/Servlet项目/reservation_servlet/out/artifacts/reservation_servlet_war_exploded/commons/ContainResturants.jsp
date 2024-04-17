<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/8
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>

        function getAllResAjax(pageNumber) {

            //进入页面立马发送请求获取所有用户

            $.ajax({
                type: "POST",
                url: "ResturantsQueryAllServlet",
                data:{"pageNumber":pageNumber},
                dataType:"json",
                withCredentials:true,
                success: function(result){
                    foreachUser(result);
                },
                error:function (XMLHttpRequest, textStatus, errorThrown,msg) {
                    alert(XMLHttpRequest.readyState);
                    alert(XMLHttpRequest.status);
                    alert(textStatus);
                }
            });
        }

        function foreachUser(result) {
            $("#foodRes").empty();
            $("#divFlush").empty();
            var t;
            var div;
            $(result).each(function (i) {
                t = "<div class='order-top'><li class='im-g'><a href='#'><img src='"+this.retPic+"' class='img-responsive' alt=''></a></li><li class='data'><h4>"+this.retName+"</h4><p>"+this.retAddress+"</p> <P> Many desktop publishing packages</P></li><li class='bt-nn'><a class='morebtn hvr-rectangle-in' href='menusByRedIdServlet?retId="+this.retId+"'>Explore</a></li><div class='clearfix'></div></div>"
                 div =  "<a href='javascript:getAllResAjax(1);'>首页</a> <a href='javascript:getAllResAjax("+(this.pageNumber+1)+");'>下一页</a>"+this.pageNumber+"|"+this.totalPages+" <a href='javascript:getAllResAjax("+(this.pageNumber-1)+")'>上一页</a> <a href='javascript:getAllResAjax("+this.totalPages+"})'>末页</a>"

                $("#foodRes").append(t);
            });


            $("#divFlush").append(div);

        }

    </script>
</head>
<body>

<div class="container" id="foodRes">

</div>
<!-- 查询分页数据 -->
<div id="divFlush">

</div>
</body>
</html>
