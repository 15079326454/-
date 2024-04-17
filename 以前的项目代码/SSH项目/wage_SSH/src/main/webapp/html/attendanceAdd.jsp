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
  <script>
    window.onload=function () {
        function getDate() {
            debugger;
            var today=new Date();
            var date;
            date=(today.getFullYear())+"-"+(today.getMonth()+1)+"-"+today.getDate();
            return date;
        }
        window.setInterval(function () {
            document.getElementById("attendanceLog.attlogTime").value=getDate();
        },10000);
    }
  </script>
</head>

<body>
<form action="../addAttLogAction.action" method="post">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30" background="images/tab_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="30"><img src="images/tab_03.gif" width="12" height="30" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="46%" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="5%"><div align="center"><img src="images/tb.gif" width="16" height="16" /></div></td>
                <td width="95%" class="STYLE1"><span class="STYLE3">你当前的位置</span>：[员工考勤]-[新增考勤记录]</td>
              </tr>
            </table></td>
            <!-- 功能按钮 start -->
            <td width="54%"><table border="0" align="right" cellpadding="0" cellspacing="0">
              <tr>
                <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"><img src="images/22.gif" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center"><input type="submit" value="新增"></div></td>
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
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">姓名：</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
            	<select name="attendanceLog.staffinfo.staffId" style="width:146px;">
                	<c:forEach items="${staffinfoList}" var="staff">
                      <option value="${staff.staffId}">${staff.staffName}</option>
                    </c:forEach>
                </select>
                （本店员工）
            </span></div></td>
          </tr>
		  <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">考勤：</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
            	<select  name="attendanceLog.attendance.attId" style="width:146px;">
                	<c:forEach items="${attendanceList}" var="att">
                      <option value="${att.attId}">${att.attName}</option>

                    </c:forEach>
                </select>
                （考勤类型）
            </span></div></td>
          </tr>
          <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">次数：</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><input name="attendanceLog.attlogCount"/> （按月统计）</span></div></td>
          </tr>
          <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">发生时间：</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
              <input name="attendanceLog.attlogTime" type="date" id="attendanceLog.attlogTime"/></span></div></td>
          </tr>
        </table>
        <!-- 内容 end -->
        </td>
        <td width="8" background="images/tab_15.gif">&nbsp;</td>
      </tr>
    </table></td>
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
