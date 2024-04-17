<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/12
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>火车车次详情</title>
</head>
<body>
<table border="1px" cellspacing="0px" cellpadding="0px" width="600px">
    <tr>
        <td colspan="2" style="background-color: darkgray;font-weight: bold;font-size: 32px;text-align: center">火车车次详情</td>
    </tr>
    <tr>
        <td style="font-weight: bold">车次</td>
        <td>${trainInfo.train_no}</td>
    </tr>
    <tr>
        <td style="font-weight: bold">发车--到达</td>
        <td>${trainInfo.start_station}--${trainInfo.arrival_station}</td>
    </tr>
    <tr>
        <td style="font-weight: bold">发时--到时</td>
        <td>${trainInfo.start_time}--${trainInfo.arrival_time}</td>
    </tr>
    <tr>
        <td style="font-weight: bold">车型</td>
        <td>${trainInfo.type}</td>
    </tr> <tr>
    <td style="font-weight: bold">运行时间(小时)</td>
    <td>${trainInfo.runtime}</td>
</tr>
    <tr>
        <td style="font-weight: bold">里程(公里)</td>
        <td>${trainInfo.mile}</td>
    </tr>

</table>
<a href="/AllTrainsServlet">返回</a>
</body>
</html>
