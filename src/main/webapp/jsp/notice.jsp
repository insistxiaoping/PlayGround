<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:18
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
    <title>馆内须知</title>
    <link rel="stylesheet" type="text/css" href="/WEB-INF/css/notice.css">

    <!--这是按钮组-->
</head>
<body>
<div class="top">
    <div class="logo" align="left">
        <img src="/WEB-INF/image/logo1.jpg" width="100" height="100"  style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="title">
        <p style="color:rgba(50,50,50,100);">体育馆预约系统</p></div>
    <div class="today">
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe></div>
    <div class="sub_notice">
        <ul>
            <li style="float:left ;list-style: none;">
                <a href="notice.html" style="background-color: #E6E6FA;">体育馆开馆时间</a></li>
            <li style="float:left ;list-style: none;">
                <a href="notice2.html" >场地/器材使用规则</a></li>
            <li style="float:left ;list-style: none;">
                <a href="notice3.html">联系我们</a></li>
        </ul>
    </div>
</div>
<!--这是左边导航-->
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

    <table border="1" cellspacing="0" cellpadding="20" width="400">
        <!-- <colgroup>
             <col style="background-color:#008c9e;">

         </colgroup>
         -->
        <tr >
            <td style="background-color:#008c9e;">星期 </td>
            <td style="background-color:#008c9e;">时间</td>
        </tr>
        <tr>
            <td style="background-color:#008c9e;">周一至周五</td>
            <td>18:30-22:00</td>
        </tr>
        <tr>
            <td style="background-color:#008c9e;">周六至周日</td>
            <td>7:00-22:00</td>
        </tr>
    </table>
    <p>注意： 国家法定节假日开放时间 9:00-20:00</p>
</div>
</div>
<div class="footer" style="background-color:#008c9e">
    <center><font color="＃2d2d2d" >版权所有@ 场地管理系统</font></center>
</div>
<!--版权模块-->
</body>
</html>