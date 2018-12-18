<%--
  Created by IntelliJ IDEA.
  User: ping
  Date: 2018/12/17
  Time: 23:27
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
    <title>管理员—首页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/notice.css">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
</head>
<body>
<div class="top">
    <div class="logo" align="left">
        <img src="${pageContext.request.contextPath}/image/adminLogo.jpeg" width="100" height="100" style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="title">
        <p style="color:rgba(50,50,50,100);">体育馆预约系统</p></div>
    <div class="today">
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe>
    </div>
    <div class="loginOut"><a href="${pageContext.request.contextPath}/links/login" >退出登录</a></div>
</div>
<div class="left_nav">
    <ul>
        <li><a href="${pageContext.request.contextPath}/links/adminEquipment" >器材管理</a></li>
        <li><a href="${pageContext.request.contextPath}/links/adminArea"  >场地管理</a></li>
        <li><a href="${pageContext.request.contextPath}/links/adminNotice" style="background-color: #E6E6FA;">通知管理</a></li>
        <li><a href="${pageContext.request.contextPath}/links/adminActivity"  >活动管理</a></li>
        <li><a href="${pageContext.request.contextPath}/links/adminUser" >会员管理</a></li>
        <li><a href="${pageContext.request.contextPath}/links/adminFinance">财务管理</a></li>
        <li><a href="${pageContext.request.contextPath}/links/adminPersonal">个人中心</a></li>
    </ul>
</div>
<div class="main">
</div>
</div>
<div class="footer">
    <center><font color="＃2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<script>

</script>
</body>

