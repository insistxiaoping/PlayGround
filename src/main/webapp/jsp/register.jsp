<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:21
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
    <link rel="stylesheet" type="text/css" href="/WEB-INF/css/register.css">
</head>
<body background="/WEB-INF/image/体育馆背景.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment:fixed;">
<!--设置背景-->

<div class="top" >
    <div class="text_433X1">
        <center><font color="#505050">体育场地预约系统</font></center>
    </div>
</div>
<!--上面这部分暂无使用-->
<div class="register_box">
    <div class="box_row">
        <img src ="/WEB-INF/image/timg.jpg" width="35" height="35" align ="left">
        <li> 欢迎注册体育馆预约系统</li>
        <hr  style="height:1px;border:none;border-top:1px solid #555555;" /></br>
        <p>手 机 号 码：<input class="ntext" type="user" name="user_name"placeholder="请输入注册手机号"></p></br></br>
        <p>密码：<input class="ptext" type="user" name="user_name"placeholder="请输入密码"></p></br></br>
        <p>再次输入密码：<input class="ptext" type="user" name="user_name"placeholder="请再次输入密码"></p></br></br>
        <p >性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input name="gender" type="radio" value="male" />男&nbsp;&nbsp;
            <input  name="gender" type="radio" value="female" />女</p></br></br>
        <p>住址：<input class="ptext" type="user" name="user_name"placeholder="请输入住址"></p></br></br>
        <button class="loader" type="submit" >注册</button>
    </div>
</div>

<div class="footer">
    <center><font color="#2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<!--版权模块-->
</body>
</html>