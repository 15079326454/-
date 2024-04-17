<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/5/8
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Spicemystery Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Libre+Baskerville:400,700' rel='stylesheet' type='text/css'>
    <script src="js/jquery.min.js"></script>
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    <script src="js/simpleCart.min.js"> </script>

</head>
<body>


<jsp:include page="commons/headTop.jsp"/>
<a href="QueryOrdersServlet">查看订单</a>


${admin.adminname}
        餐馆的添加：
        <form enctype="multipart/form-data" action="ResturantsServlet" method="post">
           餐馆名： <input type="text" name="retName"> <br>
           餐馆地址： <input type="text" name="retAdress"><br>
           餐馆图片： <input type="file" name="file"><br>
            <input type="submit" value="提交"><br>
        </form>
    <hr>
    餐馆列表：
<div class="container" id="foodRes">

</div>
<!-- 查询分页数据 -->
<div id="divFlush">

</div>








    <script>
        getAllResAjax(1);

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
                    $.one(function () {
                        window.location.reload();
                    });
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
                t = "<div class='order-top'><li class='im-g'><a href='#'><img src='"+this.retPic+"' class='img-responsive' alt=''></a></li><li class='data'><h4>"+this.retName+"</h4><p>"+this.retAddress+"</p> <P> Many desktop publishing packages</P></li><li class='bt-nn'><a class='morebtn hvr-rectangle-in' href='ResturantsByRetIdServlet?retId="+this.retId+"'>查看</a></li> <li class='bt-nn'><a class='morebtn hvr-rectangle-in' href='DelResturantsByRedIdServlet?retId="+this.retId+"'>删除</a></li> <div class='clearfix'></div></div>"
                div =  "<a href='javascript:getAllResAjax(1);'>首页</a> <a href='javascript:getAllResAjax("+(this.pageNumber+1)+");'>下一页</a>"+this.pageNumber+"|"+this.totalPages+" <a href='javascript:getAllResAjax("+(this.pageNumber-1)+")'>上一页</a> <a href='javascript:getAllResAjax("+this.totalPages+"})'>末页</a>"

                $("#foodRes").append(t);
            });


            $("#divFlush").append(div);

        }

    </script>


</body>
</html>
