<%--
  Created by IntelliJ IDEA.
  User: sux
  Date: 2019/9/3
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <meta name="viewport"  content="width=device-width,minimum-scale=1.0, maximum-scale=2.0; charset=UTF-8">
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
</head>
<body class="layui-layout-body" >
<div class="layui-layout-admin">
    <div class="layui-row">
        <div id="head" class="layui-col-md3 layui-col-xs5">
            <i class="layui-icon layui-icon-release" style="font-size: 35px"></i>
            <p>额贼</p>
        </div>
    </div>
    <div class="layui-row" id="body">
        <div class="layui-col-md-offset8 layui-col-md-offset8">
            <div id="loginFrom">
                <form class="layui-form layui-form-pane space">
                    <div class="layui-form-item" style="padding-top: 2%">
                        <label class="layui-form-label">
                            <i class="layui-icon layui-icon-username"></i>
                        </label>
                        <div class="layui-input-inline">
                            <input type="text" name="username" lay-verify="required" placeholder="请输入需要注册的用户名" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">
                            <i class="layui-icon layui-icon-password"></i>
                        </label>
                        <div class="layui-input-inline">
                            <input type="text" name="" lay-verify="" autocomplete="off" placeholder="请输入密码" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-inline">
                            <input type="text" name="username" lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input">
                        </div>
                        <img src="/VerificationCode" alt="点击刷新验证码" id="safecode" onclick="reloadVerificationCode()">
                    </div>
                    <div id="login">
                        <button type="button"  class="layui-btn layui-btn-fluid layui-btn-normal layui-btn-radius">登录</button>
                    </div>
                    <label class="control-label" >没有账号请<a href="http://wpa.qq.com/msgrd?v=3&uin=1021773496&Site=&menu=yes" style="color: #0000FF">联系管理员</a></label>
                </form>
            </div>
        </div>
    </div>
    <div class="footer">
        2019-2818
    </div>
</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/jq/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/jq/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajax-public.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>../js/login.js"></script>
</html>
