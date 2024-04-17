<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/12
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>列车信息</title>
    <style>
      tr{
        text-align: center;
      }
      .hea{
        font-weight: bold;
      }
    </style>
    <script>
      function deleteTrain() {
          var boxs=document.getElementsByName("trainNo");
          var result=false;
          for(var i=0;i<boxs.length;i++){
              if(boxs[i].checked){
                  result=true;
              }
          }
          if(result){
            document.getElementById("form").submit();
          }else{
              alert("请选择车次！")
          }
      }
    </script>
  </head>
  <body>
  <form action="/DeleteServlet" method="post" id="form">
  <table border="1px" cellspacing="0px" cellpadding="0px" width="600px">
    <tr class="hea">
      <td><a href="javascript:deleteTrain()">删除</a></td>
      <td>车次</td>
      <td>发车--到达</td>
      <td>发时--到时</td>
      <td>车型</td>
      <td>运行时间(小时)</td>
    </tr>
    <c:forEach items="${trainInfoList}" var="trainInfo" varStatus="status">
      <tr <c:if test="${status.index%2==0}">style="background-color: darkgray" </c:if>>
        <td><input type="checkbox" name="trainNo" value="${trainInfo.train_no}"></td>
        <td><a href="/FindServlet?trainNo=${trainInfo.train_no}">${trainInfo.train_no}</a></td>
        <td>${trainInfo.start_station}--${trainInfo.arrival_station}</td>
        <td>${trainInfo.start_time}--${trainInfo.arrival_time}</td>
        <td>${trainInfo.type}</td>
        <td>${trainInfo.runtime}</td>
      </tr>
    </c:forEach>
  </table>
  </form>
  </body>
</html>
