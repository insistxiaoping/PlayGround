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
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
    <!--这是按钮组-->
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
<div class="main">
    <from action="" method="">
        <table style="font-size: 15px">
            <td>类别:</td>
            <td><select id="listType" name="type_choo" style="font-size: 15px" >
                <option value="all">全部</option>
                <option value="equipments">器材</option>
                <option value="areas">场地</option>
            </select></td>
            <%--<td>选择日期:</td>--%>
            <%--<td><input type="date" name="txtDate"></td>--%>
            <%--<td><input type="submit" value="查询"/></td>--%>
        </table>
        </br>
        <div class="table-head">
            <table border="1" cellspacing="0" cellpadding="10" width="1000">
                <colgroup>
                    <col style="width:80px;"/>
                    <col style="width:100px;"/>
                    <col style="width:80px;"/>
                    <col style="width:100px;"/>
                    <col style="width:100px;"/>
                    <col style="width:100px;"/>
                    <col style="width:100px;"/>
                </colgroup>
                <thead>
                <tr>
                    <th style="background-color:#008c9e;">申请序号</th>
                    <th style="background-color:#008c9e;">申请项目</th>
                    <th style="background-color:#008c9e;">申请数量</th>
                    <th style="background-color:#008c9e;">申请日期</th>
                    <th style="background-color:#008c9e;">申请时段</th>
                    <th style="background-color:#008c9e;">消费金额</th>
                    <th style="background-color:#008c9e;">已付金额</th>
                </tr>
                </thead>
            </table>
        </div>
        <div class="table-body">
             <table border="1" cellspacing="0" cellpadding="10" width="1000">
                <colgroup>
                    <col style="width:80px;"/>
                    <col style="width:100px;"/>
                    <col style="width:80px;"/>
                    <col style="width:100px;"/>
                    <col style="width:100px;"/>
                    <col style="width:100px;"/>
                    <col style="width:100px;"/>
                </colgroup>
                 <tbody>
                    <c:forEach var="apply" items="${list}">
                        <tr>
                            <%--申请序号，根据list的长度遍历--%>
                                <%--<td>${}</td>--%>
                            <%--申请项目， apply_equip_id 是 equipments 表的主键，--%>
                            <td>${list.name}</td>
                            <td>${list.apply_num}</td>
                            <td>${list.apply_date}</td>
                            <td>${list.start_time}-${list.end_time}</td>
                            <td>${list.apply_pay}</td>
                            <td>${list.apply_paid}</td>
                        </tr>
                    </c:forEach>
                 </tbody>
             </table>
        </div>
    </from>
</div>

</div>
<div class="footer" style="background-color:#008c9e">
    <center><font color="＃2d2d2d">版权所有@ 场地管理系统</font></center>
</div>
<script>
    $(document).ready(
        function() {
            // 选择展示 器材/ 场地 / 器材＋场地（全部） 的申请记录，第一次返回的是 全部的申请记录
            $("#listType").change(
                function(){
                    var type = $(this).children('option:selected').val();
                    console.log(type);
                    $.ajax({
                        type : "get",
                        // url : ,
                        contentType : "application/json; charset=utf-8",
                        dataType : "json",
                        data : 'type='+type,
                        success : function(data) {
                            console.log(data);
                        },
                        error : function(data) {
                            console.log(data);
                        }
                    });
                }
            )
        }
    )
</script>
</body>
</html>