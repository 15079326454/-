<%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/5/17
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>通过菜品名搜索菜品</title>
</head>
<body>
<script>
    function getMenusAll() {
        window.location.href="MenusAllServlet";
    }
    function gotoAllGood() {
        window.location.href="AddOrdersServlet";
    }
    function getMenus() {
        window.location.href="getMenusBymenusName.jsp";
    }

</script>
<!-- header -->
<div class="head-top">

</div>
<jsp:include page="commons/headTop.jsp"/>

<!-- header -->
<!-- banner -->
<div class="banner">
    <div class="container">
        <div class="b_room">
            <div class="booking_room"><br />
                <div class="reservation">
                    <div class="book-top">
                        <div class="b-search" onclick="getMenus()">
                            <div class="boo-lef">
                                <i class="sear"></i>
                                <p>Search</p>
                            </div>
                        </div>
                        <div class="pick" onclick="getMenusAll()">
                            <div class="boo-lef">
                                <i class="sele"></i>
                                <p>Pick</p>
                            </div>
                        </div>
                        <div class="delv" onclick="gotoAllGood()">
                            <div class="boo-lef">
                                <i class="ca-r"></i>
                                <p>Delivered</p>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <ul>

                        <!----------start section_room----------->
                        <form action="MenusByNameServlet">
                            <li class="span1_of_1">

                                <input type="text" class="textbox" value="menusName" name="menusName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Resturant Name';}">

                            </li>
                            <li class="span1_of_1">

                                <div class="section_room">
                                    <%--<input type="text"   value="retAddress" name="retAddress" onchange="this.value = '';" onblur="if (this.value == '') {this.value = 'retAddress';}" class="textbox">--%>
                                        <%--<option value="null">Enter City Name</option>--%>
                                        <%--<option value="null">东坡外滩</option>--%>
                                        <%--<option value="AX">学生街</option>--%>
                                        <%--<option value="AX">筷子巷</option>--%>
                                    </input>
                                </div>


                                <!----------start section_room----------->

                            </li>
                            <li class="span1_of_3">
                                <div class="date_btn">
                                    <input type="submit" value="Find Menus">
                                </div>
                        </form>
                        </li>
                        <div class="clearfix"></div>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- footer-->
<div class="footer">
    <div class="container">
        <div class="footer-left">
            <p>Copyrights © 2015 SpiceMystery All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
        </div>
        <div class="footer-right">
            <ul>
                <li><a href="#"><i class="fbk"></i></a></li>
                <li><a href="#"><i class="googpl"></i></a></li>
                <li><a href="#"><i class="link"></i></a></li>
                <li><a href="#"><i class="rss"></i></a></li>
                <li><a href="#"><i class="twt"></i></a></li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!-- footer-->
</body>
</html>
