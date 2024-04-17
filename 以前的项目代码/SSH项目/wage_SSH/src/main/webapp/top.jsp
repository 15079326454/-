
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
.STYLE1 {
	font-size: 12px;
	color: #FFFFFF;
}
.STYLE2 {font-size: 9px}
.STYLE3 {
	color: #033d61;
	font-size: 12px;
}
-->
</style></head>
<script type="text/javascript">
    function clock(){
        var time=new Date();
        var week;
        switch (time.getDay()){            <!--time.getDay()获取后显示1~7阿拉伯数字-->
            case 1: week="星期一"; break;
            case 2: week="星期二"; break;
            case 3: week="星期三"; break;
            case 4: week="星期四"; break;
            case 5: week="星期五"; break;
            case 6: week="星期六"; break;
            default: week="星期天";
        }
        var year=time.getFullYear();
        var month=time.getMonth();
        var date=time.getDate();
        document.getElementById("clock").innerHTML = "今天是："+year+"年"+(month+1)+"月"+date+"日  "+week;
    }
    setInterval(clock,1000);<!--每隔1秒显示一次-->
/*前进后退首页，刷新，退出按钮的功能*/
    function index() {
        window.top.location.reload("../main.jsp");
    }
    function houtui() {
        window.history.back()
    }
    function qianjin() {
        window.history.forward()
    }
    function shuaxin() {
        window.parent.location.reload();
    }
    function tuichu() {
        if (confirm("确认退出")) {
            window.top.location.href="../login.jsp"
        }
    }










</script>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="70" background="images/main_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="24"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" height="24" background="images/main_03.gif">&nbsp;</td>
            <td width="505" background="images/main_04.gif">&nbsp;</td>
            <td>&nbsp;</td>
            <td width="21"><img src="images/main_07.gif" width="21" height="24"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="38"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" height="38" background="images/main_09.gif">&nbsp;</td>
            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="77%" height="25" valign="bottom"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="50" height="19"><div align="center"><img src="images/main_12.gif" width="49" height="19" onclick="index()"></div></td>
                    <td width="50"><div align="center"><img src="images/main_14.gif" width="48" height="19" onclick="houtui()"></div></td>
                    <td width="50"><div align="center"><img src="images/main_16.gif" width="48" height="19" onclick="qianjin()"></div></td>
                    <td width="50"><div align="center"><img src="images/main_18.gif" width="48" height="19" onclick="shuaxin()"></div></td>
                    <td width="50"><div align="center"><img src="images/main_20.gif" width="48" height="19" onclick="tuichu()"></div></td>
                    <td width="26"><div align="center"><img src="images/main_21.gif" width="26" height="19"></div></td>
                    <td width="100"><div align="center"><img src="images/main_22.gif" width="98" height="19" onclick="gerenziliao()"></div></td>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
                <td width="220" valign="bottom"  nowrap="nowrap"><div align="right"><span class="STYLE1">
                  <span class="STYLE2">■</span><span id="clock"></span> </span></div></td>
              </tr>
            </table></td>
            <td width="21"><img src="images/main_11.gif" width="21" height="38"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="8" style=" line-height:8px;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" background="images/main_29.gif" style=" line-height:8px;">&nbsp;</td>
            <td width="505" background="images/main_30.gif" style=" line-height:8px;">&nbsp;</td>
            <td style=" line-height:8px;">&nbsp;</td>
            <td width="21" style=" line-height:8px;"><img src="images/main_31.gif" width="21" height="8"></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="28" background="images/main_36.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="177" height="28" background="images/main_32.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="20%"  height="22">&nbsp;</td>
            <td width="59%" valign="bottom">
            <div align="center" class="STYLE1">当前用户：${staffinfo.staffName}</div></td>
            <td width="21%">&nbsp;</td>
          </tr>
        </table></td>
        <td></td>
        <td width="21"><img src="images/main_37.gif" width="21" height="28"></td>
      </tr>
    </table></td>
  </tr>
</table>

</body>
</html>
