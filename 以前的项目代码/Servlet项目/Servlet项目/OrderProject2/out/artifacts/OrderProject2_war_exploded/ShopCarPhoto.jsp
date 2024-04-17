<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/5/15
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
${user.userfristname}
<script>
    function cleaCar(){
        window.location.href="cleaCarServlet";
    }

    $( "span.menu" ).click(function() {
        $( ".head-nav ul" ).slideToggle(300, function() {
        });
    });
</script>
<a href="checkout.jsp">
<h3> <span > 总价${countPrice1} </span> (<span>  <c:if test="${restMenusList.goodNumber>1}">${restMenusList.goodNumber}</c:if>  </span> items)<img src="images/bag.png" alt=""></h3>
</a>
<p><a href="javascript:cleaCar();" class="simpleCart_empty">empty card</a></p>
</body>
</html>
