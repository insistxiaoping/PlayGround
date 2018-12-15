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
    <title>个人中心——资料修改</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/notice.css">
</head>
<body>
<div class="top">
    <div class="logo" align="left">
        <img src="${pageContext.request.contextPath}/image/logo1.jpg" width="100" height="100"  style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="title">
        <p style="color:rgba(50,50,50,100);">体育馆预约系统</p></div>
    <div class="today">
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe></div>
    <div class="sub_notice">
        <ul>
            <li style="float:left ;list-style: none;"><a href="${pageContext.request.contextPath}/links/personal" style="background-color: #E6E6FA;">我的申请</a></li>
            <li style="float:left ;list-style: none;"><a href="${pageContext.request.contextPath}/links/personal2" >我的资料</a></li>
        </ul>
    </div>
</div>
<!--这是左边导航-->
<div class="left_nav">
    <ul>
        <li><a href="${pageContext.request.contextPath}/links/home" >首页</a></li>
        <li><a href="${pageContext.request.contextPath}/links/personal" style="font-size:25px;color:rgba(50,50,50,100);">个人中心</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyEquipment" >器材申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyArea" >场地申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/SportActivity" >馆内通知</a></li>
        <li><a href="${pageContext.request.contextPath}/links/notice" >馆内须知</a></li>
    </ul>
</div>
<!-- 内容-->
<div class="main">
    <div class="Mypage">
        <img src="${pageContext.request.contextPath}/image/logo1.jpg" width="100" height="100"  style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="MyInfo">
        <hr  style="height:1px;border:none;border-top:1px solid #555555;" /></br>
        <p>昵称：<input class="ntext" type="user" name="user_name"placeholder="啦啦啦"></p>
        <p >性别：<input name="gender" type="radio" value="male" />男
            <input name="gender" type="radio" value="female" />女</p>
        <p>出生日期：<input type="date" name="txtDate"placeholder="2018-12-07"></p>
        <p>手机号码：<input class="ntext" type="user" name="phone"placeholder="12345678900"></p>
        <p>住址：<input class="ptext" type="user" name="add" placeholder="广东工业大学大学龙洞校区"></p>
        <p>密码：<input class="ptext" type="user" name="password"placeholder="请输入密码"></p>
        <p>再次输入密码：<input class="ptext" type="user" name="password"placeholder="请再次输入密码"></p></br></br>
        </br>
    </div>
    <button class="loader" type=" " >提交</button>
</div>
<!-- 底部-->
<div class="footer" style="background-color:#008c9e">
    <center><font color="＃2d2d2d" >版权所有@ 场地管理系统</font></center>
</div>
<!--版权模块-->
</body>
</html>