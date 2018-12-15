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
    <title>通知-体育类活动</title>
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
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe>
    </div>
    <div class="sub_notice">
        <ul>
            <li style="float:left ;list-style: none;">
                <a href="${pageContext.request.contextPath}/links/SportActivity" style="background-color: #E6E6FA;">体育类活动</a></li>
            <li style="float:left ;list-style: none;">
                <a href="${pageContext.request.contextPath}/links/NotSportActivity">非体育类活动</a></li>
            <li style="float:left ;list-style: none;">
                <a href="${pageContext.request.contextPath}/links/LostAndFound">失物招领</a></li>
        </ul>
    </div>
</div>
<!--这是左边导航-->
<div class="left_nav">
    <ul>
       <li><a href="${pageContext.request.contextPath}/links/home">首页</a></li>
        <li><a href="${pageContext.request.contextPath}/links/personal"  >个人中心</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyEquipment" >器材申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyArea"  >场地申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/SportActivity"style="background-color: #E6E6FA;" >馆内通知</a></li>
        <li><a href="${pageContext.request.contextPath}/links/notice">馆内须知</a></li>
    </ul>
</div>
<div class="main">

    <table width="56%">
        <tr>
            <th>标题</th>
            <th>时间</th>
            <th>内容</th>
        </tr>
        <tr>
            <td>${gm.activity_title}</td>
            <td>${gm.activity_time}</td>
            <td>${gm.activity_descrip}</td>
        </tr>

    </table>
</div>
</div>
<div class="footer" style="background-color:#008c9e">
    <center><font color="＃2d2d2d" >版权所有@ 场地管理系统</font></center>
</div>
<!--版权模块-->
</body>
</html>