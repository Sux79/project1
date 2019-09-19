<%--
  Created by IntelliJ IDEA.
  User: sux
  Date: 2019/9/11
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
</head>
<body>
    <table>
        <ul style="list-style-type:none">
            <li>邮箱：<input type="email"></li>
            <li>邮箱验证码：<input type="text"  maxlength="6"></li>
            <li>用户名：<input type="text"></li>
            <li>密码：<input type="password" MAXLENGTH="12"></li>
            <li>验证码：<img src="/VerificationCode" alt="点击刷新验证码" id="safecode" onclick=""></li>
            <li><button type="button" id="register" class="layui-btn layui-btn-normal">注册</button></li>
        </ul>
    </table>
</body>
</html>
