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
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
</head>
<body background="${pageContext.request.contextPath}/image/体育馆背景.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment:fixed;">
    <div class="register_box">
        <div class="box_row">
            <div class="boxtitle"> 欢迎注册体育馆预约系统</div>
            <form id="registForm">
                <div class="registerbox"> 
                    <div>姓名:<input class="ntext" type="user" name="user_name"placeholder="请输入注册手机号"></div></br> 
                    <div>手机号码:<input class="ntext" type="user" name="user_phone"placeholder="请输入注册手机号"></div></br> 
                    <div>密码：<input class="ptext" type="password" name="user_password"placeholder="请输入密码"></div></br> 
                    <div >性别： 
                        <div class="genderbox">
                            <input name="user_sex" type="radio" value="男" onchange="changeSex();"/>男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input  name="user_sex" type="radio" value="女" onchange="changeSex();"/>女</div>
                        </div>
                    <div>住址：<input class="ptext
                    " type="user" name="user_address" placeholder="请输入住址"></div>
                    <button type="button" class="loader" onclick="userRegis()">注册</button>   
                </div>
            </form>
        </div>   
    </div>
    <script>      
      function userRegis(){
          console.log($("#registForm").serialize());
          // 数据表字段
          // user_id ：手机号码，也是以后的登录名 name="user_phone"
          // user_phone: 手机号码  name="user_phone"
          // user_name: 姓名 name=user_name
          // user_sex：性别 name="user_sex" 
          // user_address：地址 name="user_address"
          // user_password：密码 name="user_password"
           $.ajax({
              type : "post",
              // url : 项目url/login,
              contentType : "application/json; charset=utf-8",
              dataType : "json",
              data : $("#registForm").serialize(),
              success : function(data) {
                  window.location.href="${pageContext.request.contextPath}/links/login";
              },
              error : function(data) {
                  alert("注册失败");
              }
          }); 
      };
      function changeSex(){
          var radio =document.getElementsByName("user_sex");
          for(var i =0;i < radio.length;i++){
              radio[i].removeAttribute('checked');
              if(radio[i].checked){
                  radio[i].setAttribute('checked',"checked");
                  var sex = radio[i].value;
                  // alert(varradioValue);
              }
          }
      }
    </script>
</body>
</html>