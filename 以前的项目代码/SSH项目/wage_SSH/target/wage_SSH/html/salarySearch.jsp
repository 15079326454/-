<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�ޱ����ĵ�</title>
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
var  highlightcolor='#c1ebff';
//�˴�clickcolorֻ����winϵͳ��ɫ������ܳɹ�,�����#xxxxxx�Ĵ���Ͳ���,��û�����Ϊʲô:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>

</head>

<body>
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
                <td width="95%" class="STYLE1"><span class="STYLE3">�㵱ǰ��λ��</span>��[���ʹ���]-[���ɵ��¹��ʱ�]</td>
              </tr>
            </table></td>
            <!-- ���ܰ�ť start -->
           <td width="54%"><table border="0" align="right" cellpadding="0" cellspacing="0">
              <tr>
                <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"></div></td>
                    <td class="STYLE1"><div align="center"><a href="#" target="I3"></a></div></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
            <!-- ���ܰ�ť end -->
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
        <!-- ���� start -->
        <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
          <tr>
            <td width="3%" height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">��������</span></div></td>
            
            <td width="15%" height="22" background="images/bg.gif" bgcolor="#FFFFFF" class="STYLE1"><div align="center">
            	������<input />���ṩģ����ѯ�� | �·ݣ�<input />
                <input type="submit" value="����"/>
            </div></td>
          </tr>
        </table>
        
        <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
          <tr>
            <td width="3%" height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">���</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">Ա�����</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">����</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">���ڵ���</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">�ȼ�</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">��������</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">�²���</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">�½���</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">���ڿۿ�</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">Ӧ������</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">ʵ������</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">��ע</span></div></td>
            <td height="22" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">������ϸ</span></div></td>
          </tr>
          <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <div align="center">1</div>
            </div></td>
			<td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">0012</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">����</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">���·�콢��</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">�ŵ�-ר�ļ�</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">3200</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">300</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">400</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">0</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">3900</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">3900</span></div></td>
            <td width="140" height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">����Ϣ</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE4"><img src="images/edt.gif" width="16" height="16" />
            <a href="salaryAttendanceInfo.jsp" target="I3">������ϸ</td>
          </tr>
          </tr>
          <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <div align="center">2</div>
            </div></td>
           	<td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">0112</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">����</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">���·�콢��</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">�ŵ�-ר����</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">2800</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">150</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">400</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">-120</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">3350</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">3230</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">����Ϣ</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE4"><img src="images/edt.gif" width="16" height="16" />
            <a href="salaryAttendanceInfo.jsp" target="I3">������ϸ</td>
          </tr>
          <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <div align="center">3</div>
            </div></td>
           	<td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">0286</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">����</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">���·�콢��</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">�ŵ�-ʵϰ��</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">2400</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">150</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">200</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">-100</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">2750</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">2650</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">����Ϣ</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE4"><img src="images/edt.gif" width="16" height="16" />
            <a href="salaryAttendanceInfo.jsp" target="I3">������ϸ</td>
          </tr>
        </table>
        <!-- ���� end -->
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
          <!-- �ײ� start -->
          <tr>
            <td class="STYLE4">&nbsp;&nbsp;���� 120 ����¼����ǰ�� 1/10 ҳ</td>
            <td><table border="0" align="right" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="40"><img src="images/first.gif" width="37" height="15" /></td>
                  <td width="45"><img src="images/back.gif" width="43" height="15" /></td>
                  <td width="45"><img src="images/next.gif" width="43" height="15" /></td>
                  <td width="40"><img src="images/last.gif" width="37" height="15" /></td>
                  <td width="100"><div align="center"><span class="STYLE1">ת����
                    <input name="textfield" type="text" size="4" style="height:12px; width:20px; border:1px solid #999999;" /> 
                    ҳ </span></div></td>
                  <td width="40"><img src="images/go.gif" width="37" height="15" /></td>
                </tr>
            </table></td>
          </tr>
          <!-- �ײ� end -->
        </table></td>
        <td width="16"><img src="images/tab_20.gif" width="16" height="35" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
