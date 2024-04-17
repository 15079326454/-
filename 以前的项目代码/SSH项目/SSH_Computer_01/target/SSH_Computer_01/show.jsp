<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/6/19
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%--    <script src="webjars/jquery/3.4.0/dist/jquery.js"></script>
    <script>
        $(function () {
            $.ajax({
                type: "post",
                url: "allComputer.action",
                dataType: "json",
                success:function (data) {
                    var str="<table border='1px'>";
                    str+="<tr><td>电脑编号</td><td>电脑名称</td><td>电脑价格</td><td>电脑类型</td><td>操作</td></tr>";
                    $(data).each(function () {
                        str+="<tr id='com"+this.computerId+"'><td>"+this.computerId+"</td><td>"+this.computerName+"</td><td>"+this.computerPrice+"</td><td>"+this.computerType+"</td>" +
                            "<td><a href='javascript:deleteComputer("+this.computerId+")'>删除</a>" +
                            "<a href='findComputer.action?computer.computerId="+this.computerId+"'>修改</a></td></tr>";
                    });
                    str+="</table>";
                    $("body").append(str);
                }
            });
        });
        function deleteComputer(computerId) {
            $.ajax({
                type: "post",
                url: "deleteComputer.action",
                dataType: "json",
                data:{"computer.computerId":computerId},
                success:function (data) {
                    if(data=="ok"){
                        $("#com"+computerId).remove();
                    }else{
                        alert("删除失败！")
                    }
                }
            });
        }
    </script>--%>
    <title>展示</title>
    <style>
        table{
            background-color: bisque;
            font-size: 16px;
            width: 550px;
            height:200px;
            border-color: deepskyblue;
        }
        tr{
            border-color: deeppink;
            text-align: center;
        }
        #tr1{
            font-weight: bold;
            font-size: 24px;
        }
        .dele{
        color: red;
        }
        #up{
            color: fuchsia;
        }
        #add{
            color: darkgreen;

        }
    </style>
</head>
<body>
<a id="add" href="/add.jsp">添加电脑</a>
<table border="3px">

    <tr id="tr1">
        <td>电脑编号</td>
        <td>电脑名称</td>
        <td>电脑价格</td>
        <td>电脑类型</td>
        <td style="text-align: center">操作</td>
    </tr>
    <c:forEach items="${computerList}" var="computer">
        <tr>
            <td>${computer.computerId}</td>
            <td>${computer.computerName}</td>
            <td>${computer.computerPrice}</td>
            <td>${computer.computerType}</td>
            <td>
                <a class="dele" href="deleteComputer.action?computerId=${computer.computerId}">删除</a>&nbsp;&nbsp;
                <a  id="up" href="findComputer.action?computerId=${computer.computerId}">修改</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
