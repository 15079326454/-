<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="com.hgkj.model.entity.Staffinfo" %>
<style type="text/css">
    <!--
    body {
        margin-left: 0px;
        margin-top: 0px;
        margin-right: 0px;
        margin-bottom: 0px;
    }

    .STYLE1 {
        font-size: 12px;
        color: #FFFFFF;
    }

    .STYLE3 {
        font-size: 12px;
        color: #033d61;
    }

    a:link {
        color: #000000;
        text-decoration: none;
    }

    a:visited {
        color: #000000;
        text-decoration: none;
    }

    a:hover {
        color: #000000;
        text-decoration: none;
    }

    a:active {
        color: #000000;
        text-decoration: none;
    }

    -->
</style>
<style type="text/css">
    .menu_title SPAN {
        FONT-WEIGHT: bold;
        LEFT: 3px;
        COLOR: #ffffff;
        POSITION: relative;
        TOP: 2px
    }

    .menu_title2 SPAN {
        FONT-WEIGHT: bold;
        LEFT: 3px;
        COLOR: #FFCC00;
        POSITION: relative;
        TOP: 2px
    }

</style>
<script>
    /*  var he=document.body.clientHeight-105
      document.write("<div id=tt style=height:"+he+";overflow:hidden>")*/
</script>

<table width="165" height="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td height="28" background="images/main_40.gif">

            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="19%">&nbsp;</td>
                    <td width="81%" height="20"><span class="STYLE1">管理菜单</span></td>
                </tr>
            </table>
        </td>

    </tr>
    <tr>
        <td valign="top">

            <table width="151" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="23" background="images/main_47.gif" id="imgmenu1" class="menu_title"
                                    onMouseOver="this.className='menu_title2';" onClick="showsubmenu(1)"
                                    onMouseOut="this.className='menu_title';" style="cursor:hand">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="18%">&nbsp;</td>
                                            <td width="82%" class="STYLE1">系统管理</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td background="images/main_51.gif" id="submenu1">
                                    <div class="sec_menu">
                                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
                                                             <a href="find.action?staffId=${staffinfo1.staffId}" target="I3">修改密码</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td height="5"><img src="images/main_52.gif" width="151" height="5"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </td>
                            </tr>

                        </table>
                    </td>
                </tr>

                <!-- start -->

                <tr id="CSGL">
                    <td>
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="23" background="images/main_47.gif" id="imgmenu2" class="menu_title"
                                    onMouseOver="this.className='menu_title2';" onClick="showsubmenu(2)"
                                    onMouseOut="this.className='menu_title';" style="cursor:hand">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="18%">&nbsp;</td>
                                            <td width="82%" class="STYLE1">参数管理</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td background="images/main_51.gif" id="submenu2">
                                    <div class="sec_menu">
                                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <!-- start -->
                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allRewardAction.action" target="I3">奖金管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                            <!-- end -->
                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allSubidyAction.action" target="I3">津贴管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allDeptAction.action" target="I3">部门管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allAttdantceAction.action" target="I3">考勤项管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allShopAction.action" target="I3">店铺管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allLevelAction.action" target="I3">员工级别项管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td height="5"><img src="images/main_52.gif" width="151" height="5"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </td>
                            </tr>


                        </table>
                    </td>
                </tr>
                <!-- end -->

                <tr id="YGGL">
                    <td>
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="23" background="images/main_47.gif" id="imgmenu3" class="menu_title"
                                    onmouseover="this.className='menu_title2';" onclick="showsubmenu(3)"
                                    onmouseout="this.className='menu_title';" style="cursor:hand">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="18%">&nbsp;</td>
                                            <td width="82%" class="STYLE1">员工管理</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td background="images/main_51.gif" id="submenu3">
                                    <div class="sec_menu">
                                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">

                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allStaffAction.action" target="I3">员工信息管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>

                                                        <tr>
                                                            <td height="23">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allRolesAction.action" target="I3">角色管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>

                                                        <tr>
                                                            <td height="23">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'">
                                                                            <span class="STYLE3"><a
                                                                                    href="html/resetrole.jsp"
                                                                                    target="I3">权限管理</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td height="23">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="allSubLogAction.action" target="I3">员工补贴记录</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>

                                                        <tr>
                                                            <td height="23">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'">
                                                                            <span class="STYLE3"><a
                                                                                    href="allRewLogAction.action"
                                                                                    target="I3">员工奖项记录</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td height="5"><img src="images/main_52.gif" width="151" height="5"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>


                <tr id="YGKQ">
                    <td>
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="23" background="images/main_47.gif" id="imgmenu4" class="menu_title"
                                    onmouseover="this.className='menu_title2';" onclick="showsubmenu(4)"
                                    onmouseout="this.className='menu_title';" style="cursor:hand">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="18%">&nbsp;</td>
                                            <td width="82%" class="STYLE1">员工考勤</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td background="images/main_51.gif" id="submenu4" style="DISPLAY: none">
                                    <div class="sec_menu">
                                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
                                                      <a href="allAttLogAction.action" target="I3">考勤记录</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>

                                                    </table>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td height="5"><img src="images/main_52.gif" width="151" height="5"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

                <tr id="GZGL">
                    <td>
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="23" background="images/main_47.gif" id="imgmenu5" class="menu_title"
                                    onmouseover="this.className='menu_title2';" onclick="showsubmenu(5)"
                                    onmouseout="this.className='menu_title';" style="cursor:hand">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="18%">&nbsp;</td>
                                            <td width="82%" class="STYLE1">工资管理</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td background="images/main_51.gif" id="submenu5" style="DISPLAY: none">
                                    <div class="sec_menu">
                                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr>
                                                <td>
                                                    <table width="90%" border="0" align="center" cellpadding="0"
                                                           cellspacing="0">
                                                        <tr id="SCGZB">
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
                                               <a href="html/salaryList.jsp" target="I3">生成工资表</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
                                           <a href="all" target="I3">查询工资</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                        <tr id="GZBDC">
                                                            <td width="16%" height="25">
                                                                <div align="center"><img src="images/left.gif"
                                                                                         width="10" height="10"/></div>
                                                            </td>
                                                            <td width="84%" height="23">
                                                                <table width="95%" border="0" cellspacing="0"
                                                                       cellpadding="0">
                                                                    <tr>
                                                                        <td height="20" style="cursor:hand"
                                                                            onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
                                                                            onmouseout="this.style.borderStyle='none'"><span
                                                                                class="STYLE3">
<a href="html/salaryExport.jsp" target="I3">工资表导出</a></span></td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td height="5"><img src="images/main_52.gif" width="151" height="5"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

            </table>
        </td>
    </tr>
    <tr>
        <td height="18" background="images/main_58.gif">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="18" valign="bottom">
                        <div align="center" class="STYLE3">版本：1.1</div>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>


<script>
    <%
    Staffinfo staffinfo=(Staffinfo) request.getSession().getAttribute("staffinfo1");
    %>
    var RolesId =
    <%=staffinfo.getRoles().getRolesId()%>

    if (RolesId == 2) {
        document.getElementById("CSGL").remove();
        document.getElementById("YGGL").remove();
        document.getElementById("YGKQ").remove();
        document.getElementById("SCGZB").remove();
        document.getElementById("GZBDC").remove();
    }
    if (RolesId == 1) {
        document.getElementById("CSGL").remove();
        document.getElementById("YGGL").remove();
        document.getElementById("SCGZB").remove();
        document.getElementById("GZBDC").remove();
    }
</script>
<script>


    function showsubmenu(sid) {
        whichEl = eval("submenu" + sid);
        imgmenu = eval("imgmenu" + sid);
        if (whichEl.style.display == "none") {
            eval("submenu" + sid + ".style.display=\"\";");
            imgmenu.background = "images/main_47.gif";
        }
        else {
            eval("submenu" + sid + ".style.display=\"none\";");
            imgmenu.background = "images/main_48.gif";
        }
    }

</script>