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



</head>
<body >
<table>
    <tr>
        <td>账号：</td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td>密码：</td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td><input type="text" placeholder="请输入验证码"></td>
        <td><div></div></td>
    </tr>
    <tr>
    <ul>
        <li>
            账号：<input type="text">
        </li>
        <li>
            密码：<input type="text">
        </li>
        <li>
            <button>登录</button>
        </li>
    </ul>
    </tr>
</table>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/jq/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajax-public.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>../js/login.js"></script>

</html>
