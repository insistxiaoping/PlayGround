<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:20
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
    <title>个人中心-我的申请</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/notice.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/Mock.js/1.0.1-beta3/mock-min.js"></script>
    <script src="${pageContext.request.contextPath}/js/mock.js"></script>
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
    <div class="today">
        <iframe width="300" scrolling="no" height="65" frameborder="0" allowtransparency="true"
                src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></iframe>
    </div>
    <div class="loginOut"><a href="${pageContext.request.contextPath}/links/login">退出登录</a></div>
    <div class="sub_notice">
        <ul>
            <li style="float:left ;list-style: none;">
                <a href="${pageContext.request.contextPath}/links/personal" style="background-color: #E6E6FA;">我的申请</a>
            </li>
            <li style="float:left ;list-style: none;">
                <a href="${pageContext.request.contextPath}/links/personal2">我的资料</a>
            </li>
        </ul>
    </div>
</div>
<!--这是左边导航-->
<div class="left_nav">
    <ul>
        <li><a href="${pageContext.request.contextPath}/links/home">首页</a></li>
        <li><a href="${pageContext.request.contextPath}/links/personal"
               style="font-size:25px;color:rgba(50,50,50,100); background-color: #E6E6FA;">个人中心</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyEquipment">器材申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/applyArea">场地申请</a></li>
        <li><a href="${pageContext.request.contextPath}/links/SportActivity">馆内通知</a></li>
        <li><a href="${pageContext.request.contextPath}/links/notice">馆内须知</a></li>
    </ul>
</div>
<div class="main" id="equipTable">
    <div class="table-responsive table-bordered">
        <table class="table" id="equipTableList">
            <thead>
            <tr>
                <th >申请序号</th>
                <th >申请项目</th>
                <th >申请数量</th>
                <th >申请日期</th>
                <th >申请时段</th>
                <th >消费金额</th>
                <th >已付金额</th>
            </tr>
            </thead>
        </table>
    </div>
</div>
</div>
<div class="footer" style="background-color:#008c9e">
    <center><font color="＃2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<script>
    $(document).ready(
        function() {
            // 展示 用户的申请记录
            $.ajax({
                type : "get",
                url :"${pageContext.request.contextPath}/user/applyData",
                contentType : "application/json; charset=utf-8",
                dataType : "json",
                success : function(data) {
                    console.log(data);
                    for(var i =0;i<data.applyList.length;i++){
                        var x=document.getElementById('equipTableList').insertRow();
                        var cell1=x.insertCell();
                        var cell2=x.insertCell();
                        var cell3=x.insertCell();
                        var cell4=x.insertCell();
                        var cell5=x.insertCell();
                        var cell6=x.insertCell();
                        var cell7=x.insertCell();
                        cell1.innerText = i+1;
                        for(var j =0;j<data.equipList.length;j++){
                         if(data.equipList[j].equipId==data.applyList[i].applyEquipId){
                             cell2.innerText = data.equipList[j].equipName;
                         }
                        }
                        cell3.innerText = data.applyList[i].applyNum;
                        cell4.innerText = data.applyList[i].applyDate;
                        cell5.innerText = data.applyList[i].startTime + '-' + data.applyList[i].endTime;
                        cell6.innerText = data.applyList[i].applyPay;
                        cell7.innerText = data.applyList[i].applyPaid;
                    }
                },
                error : function(data) {
                    console.log(data);
                }
            });
        }
    )
</script>
</body>
</html>