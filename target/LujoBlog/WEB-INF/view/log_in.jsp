<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.08.06
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://v3.bootcss.com/favicon.ico">
    <title>登录</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="./css/signin.css" rel="stylesheet">
</head>
<body>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<div class="container">
    <form class="form-signin">
        <h2 class="form-signin-heading">請登陸</h2>
        <label for="inputEmail" class="sr-only">電子郵件地址</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="電子郵件地址" required autofocus>
        <label for="inputPassword" class="sr-only">密碼</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="密碼" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me">記住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陸</button>
        <button class="btn btn-lg btn-primary btn-block" type="button">注冊</button>
    </form>
</div>
</body>
</html>
