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
    <link href="${pageContext.request.contextPath}/css/notice.css" rel="stylesheet">
</head>
<body>
<div class="top">
    <div class="logo" align="left">
        <img src="${pageContext.request.contextPath}/image/logo1.jpg" width="100" height="100"
             style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
    </div>
    <div class="title">
        <p style="color:rgba(50,50,50,100);">体育馆预约系统</p>
    </div>
    <div class="today"><!--天气-->
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true"
                src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe>
    </div>
    <div class="loginOut"><a href="${pageContext.request.contextPath}/links/login">退出登录</a></div>
</div>
<div class="left_nav">
    <ul>
        <li><a href="${pageContext.request.contextPath}/links/home">首页</a></li>
        <li><a href="${pageContext.request.contextPath}/links/personal">个人中心</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyEquipment">器材申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyArea" style="background-color: #E6E6FA;">场地申请</a>
        </li>
        <li><a href="${pageContext.request.contextPath}/links/SportActivity">馆内通知</a></li>
        <li><a href="${pageContext.request.contextPath}/links/notice">馆内须知</a></li>
    </ul>
</div>
<div class="main">
    <form id="applyForm" style="font-size: 25px;color:rgba(50,50,50,100);">
        选择日期:&nbsp;&nbsp;&nbsp;&nbsp;<input type="date" name="apply_date" value=""></br></br>
        选择时段
        <label><input name="apply_time" type="radio" value="8:00:00-10:00:00" /> 8:00-10:00 </label>
        <label><input name="apply_time" type="radio" value="10:00:00-12:00:00" /> 10:00-12:00 </label>
        <label><input name="apply_time" type="radio" value="14:00:00-16:00:00" /> 14:00-16:00 </label>
        <label><input name="apply_time" type="radio" value="16:00:00-18:00:00" /> 16:00-18:00</label>
        <label><input name="apply_time" type="radio" value="18:00:000-20:00:00" /> 18:00-20:00</label>
        </br></br>
        选择场地：
        <div class="main_form">
            篮球场
            <input type="text" size="12" maxlength="3" placeholder="请输入数量" name="lqchang" value="">
            足球场&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="text" size="12" maxlength="3" placeholder="请输入数量" name="zqchang" value="">
            <button  type="button" onclick="applyArea()">提交</button>
        </div>
    </form>
</div>
</div>
<div class="footer">
    <center><font color="＃2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<script>
    function applyArea(){
        // 数据库表字段
        // apply_id：自增
        // apply_user_id：
        // apply_area_id：对应 name，比如网球拍的id 是 wqpai
        // apply_date：格式：2018-12-20
        // start_time  格式：8:00:00  apply_time 字符串 “-”之前的字符
        // end_time    格式：8:00:00  apply_time 字符串 “-”之后的字符
        // apply_pay： 申请数量*乘10
        // apply_paid：0
        console.log($("#applyForm").serialize());
        var lqchangNum = parseInt($('input[name="lqchang"]').val())?parseInt($('input[name="lqchang"]').val()):0;
        var zqchangNum = parseInt($('input[name="zqchang"]').val())?parseInt($('input[name="zqchang"]').val()):0;
        var sum =  (lqchangNum+zqchangNum)*10;
        var data = "apply_pay="+sum+"&"+"apply_pay=0"
        console.log(($("#applyForm").serialize()+data));
        $.ajax({
            type : get,
            // url : ,
            contentType : "application/json; charset=utf-8",
            dataType : "json",
            data : data,
            success : function(data) {
                alert("申请成功");
                window.location.href="${pageContext.request.contextPath}/links/applyArea";
            },
            error : function(data) {
                alert("申请失败");
            }
        });
    }
</script>
</body>
</html>