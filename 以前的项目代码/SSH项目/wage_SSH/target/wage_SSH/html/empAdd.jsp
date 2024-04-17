<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE3 {font-size: 12px; font-weight: bold; }
.STYLE4 {
	color: #03515d;
	font-size: 12px;
}
-->
</style>
</head>

<body>
<form action="../addStaffsAction.action" method="post">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30" background="images/tab_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="30"><img src="images/tab_03.gif" width="12" height="30" /></td>
        <td>

            <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="46%" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="5%"><div align="center"><img src="images/tb.gif" width="16" height="16" /></div></td>
                <td width="95%" class="STYLE1"><span class="STYLE3">你当前的位置</span>：[参数管理]-[添加新员工]</td>
              </tr>
            </table></td>
            <!-- 功能按钮 start -->
            <td width="54%"><table border="0" align="right" cellpadding="0" cellspacing="0">
              <tr>
                <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                     <td width="60">

                         <table width="90%" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <td class="STYLE1"><div align="center"><img src="images/22.gif" width="14" height="14" /></div></td>
                        <td class="STYLE1"><div align="center"><input type="submit" value="新增"></div></td>
                      </tr>
                    </table></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
            <!-- 功能按钮 end -->
          </tr>
        </table></td>
        <td width="16"><img src="images/tab_07.gif" width="16" height="30" /></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="100%" height="500" border="0" cellspacing="0" cellpadding="0">
      <tr valign="top">
        <td width="8" background="images/tab_12.gif">&nbsp;</td>
        <td>
        <!-- 内容 start -->
        <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
          <tr>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">员工姓名：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1"><input type="text" name="staffinfo.staffName"/></span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">初始密码：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1"><input type="text" name="staffinfo.staffPwd"/></span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">状态：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1">
            	<select name="staffinfo.staffState">
                	<option value="在职">在职</option>
                    <option value="离职">离职</option>
                </select>
            </span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">员工等级：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1">
            	<select name="staffinfo.level.levelId">
                    <c:forEach items="${levelList}" var="level">
                     <option value="${level.levelId}">${level.levelName}</option>
                    </c:forEach>
                </select>
            </span></div></td>
          </tr>
		  <tr>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">角色：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1">
            	<select name="staffinfo.roles.rolesId">
                  <c:forEach items="${rolesList}" var="roles">
                    <option value="${roles.rolesId}">${roles.rolesName}</option>
                  </c:forEach>
                	<%--<option>管理员</option>
                    <option>店长</option>
                    <option>普通员工</option>--%>
                </select>
            </span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">部门：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1">
            	<select name="staffinfo.department.depId">
                  <c:forEach items="${departmentList}" var="dept">
                    <option value="${dept.depId}">${dept.depName}</option>
                  </c:forEach>
                	<%--<option value="">门店部</option>
                    <option>事业发展部</option>
                    <option>采购部</option>
                    <option>行政部</option>
                    <option>人力资源部</option>--%>
                </select>
            </span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">性别：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1">
            	<select name="staffinfo.staffSex">
                	<option value="男">男</option>
                    <option value="女">女</option>
                </select>
            </span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">住址：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1"><input type="text" name="staffinfo.staffAddress"/></span></div></td>
          </tr>
          <tr>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">电话：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1"><input type="text" name="staffinfo.staffTel"/></span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">所属店铺：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1">
            	<select name="staffinfo.shop.shopId" id="shopId">
                  <c:forEach items="${shopList}" var="shop">
                    <option value="${shop.shopId}">${shop.shopName}</option>
                  </c:forEach>
                	<%--<option>天津路旗舰店</option>--%>
                </select>
            </span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">电子邮箱：</span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1"><input type="text" name="staffinfo.staffEmail" /></span></div></td>
            <td width="10%" height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"></span></div></td>
            <td width="15%" height="20" bgcolor="#FFFFFF"><div align="left"><span class="STYLE1"></span></div></td>
          </tr>
        </table>
        <!-- 内容 end -->
        </td>
        <td width="8" background="images/tab_15.gif">&nbsp;</td>
      </tr>
    </table>

    </td>
  </tr>
  <tr>
    <td height="35" background="images/tab_19.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="35"><img src="images/tab_18.gif" width="12" height="35" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <!-- 底部 start -->

          <!-- 底部 end -->
        </table></td>
        <td width="16"><img src="images/tab_20.gif" width="16" height="35" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
</body>
</html>
