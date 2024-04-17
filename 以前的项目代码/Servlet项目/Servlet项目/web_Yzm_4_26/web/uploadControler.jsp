<%@ page import="com.jspsmart.upload.SmartUpload" %>
<%@ page import="com.jspsmart.upload.Files" %>
<%@ page import="com.jspsmart.upload.File" %><%--
  Created by IntelliJ IDEA.
  User: 28680
  Date: 2019/4/26
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>

</head>
<body><%
    SmartUpload smartUpload=new SmartUpload();
    smartUpload.initialize(pageContext);
    smartUpload.setCharset("UTF-8");
    smartUpload.upload();
    Files files=smartUpload.getFiles();
    System.out.println(files.getCount()+"=========");
    File file=files.getFile(0);
    String filePath="upload\\"+file.getFileName();
    System.out.println(filePath+"=========");
    file.saveAs(filePath,SmartUpload.SAVE_VIRTUAL);
    out.print(file.getFileName()+":上传成功!");
%>

</body>
</html>
