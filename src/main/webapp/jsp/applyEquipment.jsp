<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:13
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
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
</head>
<body>
<div class="top">
    <div class="logo" align="left">
        <img src="${pageContext.request.contextPath}/image/logo1.jpg" width="100" height="100" style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
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
        <li><a href="${pageContext.request.contextPath}/links/home">首页</a></li>
        <li><a href="${pageContext.request.contextPath}/links/personal"  >个人中心</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyEquipment"style="background-color: #E6E6FA;" >器材申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyArea"  >场地申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/SportActivity" >馆内通知</a></li>
        <li><a href="${pageContext.request.contextPath}/links/notice">馆内须知</a></li>
    </ul>
</div>
<div class="main">
    <form id="applyForm" style="font-size: 25px;color:rgba(50,50,50,100);">
        选择日期:&nbsp;&nbsp;&nbsp;&nbsp;<input type="date" name="applyDate" value=""></br></br>
        选择时段
        <%--<label><input name="apply_time" type="checkbox" value="8:00-10:00 " /> 8:00-10:00 </label>--%>
        <%--<label><input name="apply_time" type="checkbox" value="10:00-12:00" /> 10:00-12:00 </label>--%>
        <%--<label><input name="apply_time" type="checkbox" value="14:00-16:00" /> 14:00-16:00 </label>--%>
        <%--<label><input name="apply_time" type="checkbox" value="16:00-18:00" /> 16:00-18:00</label>--%>
        <%--<label><input name="apply_time" type="checkbox" value="18:00-20:00" /> 18:00-20:00</label>--%>

        <label><input name="apply_time" type="radio" value="8:00:00-10:00:00" /> 8:00-10:00 </label>
        <label><input name="apply_time" type="radio" value="10:00:00-12:00:00" /> 10:00-12:00 </label>
        <label><input name="apply_time" type="radio" value="14:00:00-16:00:00" /> 14:00-16:00 </label>
        <label><input name="apply_time" type="radio" value="16:00:00-18:00:00" /> 16:00-18:00</label>
        <label><input name="apply_time" type="radio" value="18:00:000-20:00:00" /> 18:00-20:00</label>
        </br></br>
     选择器材：
        <div class="main_form">
                <div class="selectBox">
                    <select name="equip_id" id="select">

                    </select>
                </div>
                <input  type="text" size="12" name="equipNum" value="0" maxlength="3" placeholder="请输入数量">
                <button  type="button" onclick="applyEquipment()">提交</button>
        </div>
    </form> 
</div>
</div>
<div class="footer">
    <center><font color="＃2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<script>
    // 页面加载，获取器材数据
    window.onload=function(){
        $.ajax({
            type: "post",
            url :"${pageContext.request.contextPath}/admin/equipments",
            contentType : "application/json; charset=utf-8",
            dataType : "json",
            success : function(data) {
                console.log('器材数据返回成功');
                console.log(data);
                var select = $('#select')
                var _option ="";
                for(var index=0; index<data.length;index++){
                    _option ="<option value='"+data[index].equipId+"'>"+data[index].equipName+"</option>"
                    // $('#select').append("<option value=data[index.equipId]>"data[index.equipName]</option>
                    $("#select").append(_option);
                }
            },
            error : function() {
                console.log("器材数据返回失败");
            }
        });
    };
    function applyEquipment(){
        var userId = sessionStorage.getItem("userId");
        console.log('userId,',userId);
        // 数据库表字段
        // apply_id：自增
        // apply_user_id：
        // apply_equip_id：对应 name，比如网球拍的id 是 wqpai
        // apply_date：格式：2018-12-20
        // start_time  格式：8:00:00  apply_time 字符串 “-”之前的字符
        // end_time    格式：8:00:00  apply_time 字符串 “-”之后的字符
        // apply_pay： 申请数量*乘10
        // apply_paid：0
        var equipNum = parseInt($('input[name="equipNum"]').val())?parseInt($('input[name="equipNum"]').val()):0;
        var sum =  equipNum*10;
        var times = $('input[name="apply_time"]').val().split('-');
        var applyObj = {
            applyEquipId: $('input[name="equipNum"]').val(),
            applyDate: $('input[name="applyDate"]').val(),
            applyNum: equipNum,
            applyUserId: userId,
            applyPaid:sum,
            applyPay: 0,
            startTime:times[0],
            endTime:times[1]
        }
        applyObj = JSON.stringify(applyObj);
        if(applyObj){
            console.log('applyObj.',applyObj)
            $.ajax({
                type : "post",
                url : "${pageContext.request.contextPath}/users/applyEquip",
                contentType : "application/json; charset=utf-8",
                dataType : "json",
                data : applyObj,
                success : function(data) {
                    if (data=="success"){
                        alert("申请成功");
                        <%--window.location.href="${pageContext.request.contextPath}/links/applyEquipment";--%>
                    }else alert("请检查信息是否填写正确！");
                },
                error : function(data) {
                    alert("申请失败");
                }
            });
        }
    }
    // 把 form获取的参数转为 json格式
    function stringToJson(str){
        console.log('str',str);
        var dataList = str.split("&");
        var userObj ={};
        for(var i in dataList){
            console.log(dataList[i]);
            if(!dataList[i].split("=")[1]){
                alert('请填入完整的信息');
                return false;
            }
            userObj[dataList[i].split("=")[0]]= dataList[i].split("=")[1];
        }
        return userObj;
    }
</script>
</body>
</html>