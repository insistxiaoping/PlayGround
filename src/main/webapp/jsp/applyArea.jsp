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
    <title>申请场地</title>
    <link rel="stylesheet" type="text/css" href="/css/notice.css">
</head>
<body><div class="top">
    <div class="logo" align="left">
        <img src="/image/logo1.jpg" width="100" height="100" style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="title">
        <p style="color:rgba(50,50,50,100);">体育馆预约系统</p></div>

    <div class="today"><!--天气-->
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe>
    </div>
</div>
<div class="left_nav">
    <ul>
        <li><a href="home.jsp">首页</a></li>
        <li><a href="personal.jsp"  >个人中心</a></li>
        <li><a href="applyEquipment.jsp" >器材申请</a></li>
        <li><a href="applyArea.jsp" style="background-color: #E6E6FA;" >场地申请</a></li>
        <li><a href="SportActivity.jsp" >馆内通知</a></li>
        <li><a href="notice.jsp">馆内须知</a></li>
    </ul>
</div>
<div class="main">
    <form action="" style="font-size: 25px;color:rgba(50,50,50,100);">
        选择日期:    <input type="date" name="txtDate"/></br></br>
        选择时段：
        <label><input name="time" type="checkbox" value="" />8:00-10:00 </label>
        <label><input name="time" type="checkbox" value="" />10:00-12:00 </label>
        <label><input name="time" type="checkbox" value="" />14:00-16:00 </label>
        <label><input name="time" type="checkbox" value="" />16:00-18:00</label>
        <label><input name="time" type="checkbox" value="" />18:00-20:00</label>
        </br></br>
        选择场地：
        <div class="main_form">
            <label ><input name="Area" type="checkbox" value="" />羽毛球场
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"></label>
            <label ><input name="Area" type="checkbox" value="" />乒乓球场
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"> </label> <br>
            <label ><input name="Area" type="checkbox" value="" />网球场&nbsp;&nbsp;&nbsp;&nbsp;
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"></label>
            <label ><input name="Area" type="checkbox" value="" />游泳馆
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"></label> </br>
            <label ><input name="Area" type="checkbox" value="" />排球场&nbsp;&nbsp;&nbsp;&nbsp;
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"></label>
            <label ><input name="Area" type="checkbox" value="" />篮球场
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"></label> </br>
            <label ><input name="Area" type="checkbox" value="" />足球场&nbsp;&nbsp;&nbsp;&nbsp;
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"></label>
            <label ><input name="Area" type="checkbox" value="" />其他
                <input  type="text" size="12" maxlength="3" placeholder="请输入数量"></label>
        </div>
    </form>
    <div class="button" >
        <button  type="submit" >提交</button>

    </div>
</div>
</div>
<div class="footer">
    <center><font color="＃2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<!--版权模块-->
</body>
</html>