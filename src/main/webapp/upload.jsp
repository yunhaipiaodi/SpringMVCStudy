<%--
  Created by IntelliJ IDEA.
  User: 浩传
  Date: 2020/4/30
  Time: 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form method="post" action="/SpringMVC/uploadControl/upload" enctype="multipart/form-data">
        上传文件：<input type="file" name="upload"/> <br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
