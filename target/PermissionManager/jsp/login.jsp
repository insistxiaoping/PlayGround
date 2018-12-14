<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>场地管理系统</title>
    <link rel="stylesheet" type="text/css" href="/css/login.css">
</head>
<body background="${pageContext.request.contextPath}/image/体育馆背景.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment:fixed;">
<!--设置背景-->

<div class="top" ></div>
<!--上面这部分暂无使用-->

<div class="login">
    <div class="choose">
        <ul id="funct_cho">
            <li class="choo">用户登录 </li>
            <li class="choo">管理员登录 </li>
        </ul>
    </div>
    <br/>
    <div id="content">
        <form method="${pageContext.request.contextPath}/User_load" action="post">
            <div id="user" class="funct">
                <p class="name"> 用户名 Username:</p>
                <input class="ntext" type="text" name="user_name" placeholder="请输入用户名" autocomplete="of"/><br/> <br/>
                <p class="passw"> 密码 Password:</p>
                <input class="ptext" type="password" name="user_password" placeholder="请输入密码" autocomplete="of"/><br/> <br/>
                <button class="loader" type="submit" name="user_Load"  value="user_Load" >登录</button> <br/> <br/>
                <p class="nosign">—— 没有账户？——</p><br/><br/>
                <a class="apply" href="${pageContext.request.contextPath}/Sign">新建账户</a>
            </div>
        </form>
        <form action="${pageContext.request.contextPath}/Manager_load" method="post">
            <div id="manager" class="funct hidden">
                <p class="name"> 管理员名 Username:</p>
                <input class="ntext" type="text" name="manager_name" placeholder="请输入管理员登录名" /><br/> <br/>
                <p class="passw" >密码 Password:</p>
                <input class="ptext" type="password" name="manager_password" placeholder="请输入密码" autocomplete="of"/><br/><br/>
                <button class="loader" type="submit" name="manager_Load"  value="manager_Load">登录</button><br/><br/>
            </div>
        </form>
    </div>
</div>

<div class="footer">
    <center><font color="#2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<!--版权模块-->
</body>
</html>