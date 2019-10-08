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
    <meta name="viewport"  content="width=device-width,minimum-scale=1.0, maximum-scale=2.0; charset=UTF-8">
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
</head>
<%--<script>--%>
    <%--var   a=screen.availWidth;--%>
    <%--var   b=screen.availHeight;--%>
    <%--window.moveTo(0,0)--%>
    <%--window.resizeTo(a,b)--%>
<%--onload="javascript:window.resizeTo(screen.availWidth,screen.availHeight)"--%>
<%--</script>--%>
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
                        验证邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" name="email" lay-verify="email" autocomplete="off" placeholder="请输入邮箱" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" name="username" lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input">
                    </div>
                    <img src="/VerificationCode" alt="点击刷新验证码" id="safecode" onclick="reloadVerificationCode()">
                </div>
                <div id="register">
                <button type="button"  class="layui-btn layui-btn-normal">注册
                </button>
                </div>
                <%--<ul style="list-style-type:none">--%>
                    <%--<li>邮箱：<input type="email"></li>--%>
                    <%--<li>邮箱验证码：<input type="text"  maxlength="6"></li>--%>
                    <%--<li>用户名：<input type="text"></li>--%>
                    <%--<li>密码：<input type="password" MAXLENGTH="12"></li>--%>
                    <%--<li>验证码：<img src="/VerificationCode" alt="点击刷新验证码" id="safecode" onclick="reloadVerificationCode()"></li>--%>
                    <%--<li><button type="button" id="register" class="layui-btn layui-btn-normal">注册</button></li>--%>
                <%--</ul>--%>
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
<script type="text/javascript" src="<%=request.getContextPath()%>/js/register.js"></script>
</html>
