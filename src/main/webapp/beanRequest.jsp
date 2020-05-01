<%--
  Created by IntelliJ IDEA.
  User: 浩传
  Date: 2020/4/28
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bean请求</title>
</head>
<body>
    <form action="/SpringMVC/beanReq/getAccount" method="post">
        <label>用户名</label>
        <input type="text" placeholder="请输入用户名" name="userName">
        <br>

        <label>密码</label>
        <input type="text" placeholder="请输入密码" name="password">
        <br>

        <label>金额</label>
        <input type="text" placeholder="请输入金额" name="money">
        <br>

        <label>用户名称</label>
        <input type="text" placeholder="请输入用户名称" name="user.uName">
        <br>

        <label>用户年龄</label>
        <input type="text" placeholder="请输入用户年龄" name="user.age">
        <br>

        <label>用户生日</label>
        <input type="text" placeholder="请输入用户生日" name="user.birthday">
        <br>

        <input type="submit" value="提交">
    </form>

</body>
</html>
