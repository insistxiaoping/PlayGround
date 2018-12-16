<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:03
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
    <title>主页</title>
    <link href="${pageContext.request.contextPath}/css/notice.css" rel="stylesheet">
</head>
<body>
<div class="top">
    <div class="logo" align="left">
        <img src="${pageContext.request.contextPath}/image/logo1.jpg" width="100" height="100"
             style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="title">
        <p style="color:rgba(50,50,50,100);">体育馆预约系统</p></div>
    <div class="today"><!--天气-->
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true"
                src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe>
    </div>
    <div class="loginOut"><a href="${pageContext.request.contextPath}/links/login">退出登录</a></div>
    <!--  <div class="sub_notice">
         <ul>
             <li style="float:left ;list-style: none;"><a href="login.jsp" >登录</a></li>
             <li style="float:left ;list-style: none;"><a href="register.jsp">注册</a></li>
         </ul>
     </div> -->
</div>
<div class="left_nav">
    <ul>
        <li><a href="${pageContext.request.contextPath}/links/home"
               style="font-size:25px;color:rgba(50,50,50,100); background-color: #E6E6FA;">首页</a></li>
        <li><a href="${pageContext.request.contextPath}/links/personal"
               style="font-size:25px;color:rgba(50,50,50,100);">个人中心</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyEquipment"
               style="font-size:25px;color:rgba(50,50,50,100);">器材申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyArea"
               style="font-size:25px;color:rgba(50,50,50,100);">场地申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/SportActivity"
               style="font-size:25px;color:rgba(50,50,50,100);">馆内通知</a></li>
        <li><a href="${pageContext.request.contextPath}/links/notice" style="font-size:25px;color:rgba(50,50,50,100);">馆内须知</a>
        </li>
    </ul>
</div>
<div class="main">
    <img src="${pageContext.request.contextPath}/image/1.jpg" width="1000" height="400"/>
    <img src="${pageContext.request.contextPath}/image/2.jpg" width="1000" height="400"/>
    <img src="${pageContext.request.contextPath}/image/3.jpg" width="1000" height="400"/>
</div>
</div>
<div class="footer">
    <center><font color="＃2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<!--版权模块-->
</body>
<script>
    window.onload = function () {
        var images = (document.getElementsByClassName('main')[0]).getElementsByTagName('img');
        var pos = 0;
        var len = images.length;
        setInterval(function () {
            images[pos].style.display = 'none';
            pos = ++pos == len ? 0 : pos;
            images[pos].style.display = 'inline';
        }, 2000);
    };
</script>
</html>