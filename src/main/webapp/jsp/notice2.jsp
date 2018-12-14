<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:19
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
    <title>申请器材</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/notice.css">

    <!--这是按钮组-->
</head>
<body>
<div class="top">
    <div class="logo" align="left">
        <img src="${pageContext.request.contextPath}/image/logo1.jpg" width="100" height="100" style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="title">
        <p style="color:rgba(50,50,50,100);">体育馆预约系统</p></div>
    <div class="today">
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe></div>
    <div class="sub_notice">
        <ul>
            <li style="float:left ;list-style: none;"><a href="notice.jsp" >体育馆开馆时间</a></li>
            <li style="float:left ;list-style: none;"><a href="notice2.jsp" style="background-color: #E6E6FA;">场地/器材使用规则</a></li>
            <li style="float:left ;list-style: none;"><a href="notice3.jsp">联系我们</a></li>
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
    <from>
        <table style="font-size: 15px">
            <td >类别: </td>
            <td><select name="type_choo" style="font-size: 15px">
                <option value="1">器材</option>
                <option value="2">场地</option>
            </select></td></table>
        <div class="table-head">
            <table border="1" cellspacing="0" cellpadding="10" width="1000">
                <colgroup>
                    <col style="width:80px;"/>
                    <col style="width:90px;"/>
                    <col style="width:200px;"/>
                    <col style="width:90px;"/>
                </colgroup>
                <tbody>
                <tr>
                    <td style="background-color:#008c9e;">类别 </td>
                    <td style="background-color:#008c9e;">项目</td>
                    <td style="background-color:#008c9e;">使用规则 </td>
                    <td style="background-color:#008c9e;">发布时间</td>
                </tr></tbody></table></div>
        <div class="table-body">
            <table border="1" cellspacing="0" cellpadding="10" width="1000">
                <colgroup>
                    <col style="width:80px;"/>
                    <col style="width:90px;"/>
                    <col style="width:200px;"/>
                    <col style="width:90px;"/>
                </colgroup>
                <tbody>
                <tr>
                    <td >器材</td>
                    <td>${gm.notice_title}</td>
                    <td>${gm.notice_descrip}</td>
                    <td>${gm.notice_time}</td>
     </tr>
     <tr>
     <td >器材</td>
     <td>${gm.notice_title}</td>
        <td>${gm.notice_descrip}${gm.notice_descrip}${gm.notice_descrip}</td>
        <td>${gm.notice_time}</td>
        </tr>
        </tbody>
        </table>
        </div>
        </from>
        </div>
        <div class="footer" style="background-color:#008c9e">
        <center><font color="＃2d2d2d" >版权所有@ 场地管理系统</font></center>
        </div>
        <!--版权模块-->
        </body>
</html>