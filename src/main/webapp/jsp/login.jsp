<%--
  Created by IntelliJ IDEA.
  User: Kerry
  Date: 2018/12/13
  Time: 20:14
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
    <title>登录</title>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
</head>
<body background="${pageContext.request.contextPath}/image/体育馆背景.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment:fixed;">
    <div class="login"> 
        <div class="choose">
            <ul id="funct_cho">
                <li class="choo">用户登录 </li>
                <li class="choo">管理员登录 </li>
            </ul>
        </div>
        <div id="content" class="userlogin ">
            <form id="userForm">
                <div id="user" class="funct">
                    <p class="name"> 用户名</p>
                    <input class="ntext" type="text" name="userName" placeholder="请输入用户名" autocomplete="of"/><br/> <br/> <p class="passw"> 密码</p>
                    <input class="ptext" type="password" name="userPassword" placeholder="请输入密码" autocomplete="of"/><br/> <br/> 
                    <button class="loader" type="button" onclick="userLoad()" name="user_Load"  value="user_Load" >登录</button> <br/> <br/>
                    <div  class="registerbtn"><a  href="register.html">注册</a></div>
                    <div class="forgetbtn">忘记密码</div>
                    <!-- <p class="nosign">—— 没有账户？——</p><br/><br/> -->
                    <!-- <a class="apply" href="register.html">新建账户</a>                    -->
                </div>
            </form> 
            <form id="managerForm">   
                <div id="manager" class="funct hidden">
                        <p class="name"> 管理员名</p>
                        <input class="ntext" type="text" name="managerName" placeholder="请输入管理员登录名" /><br/> <br/>
                        <p class="passw" >密码</p>
                        <input class="ptext" type="password" name="managerPassword" placeholder="请输入密码" autocomplete="of"/><br/><br/>
                        <button class="loader" type="button" onclick="managerLoad()" name="manager_Load"  value="manager_Load">登录</button><br/><br/>
                </div>
            </form>  
        </div>
    </div>
<script>
    var lis = document.getElementById("funct_cho").getElementsByTagName("li");
    var divs = document.getElementById("content").getElementsByClassName("funct");
    for (var i = 0; i < lis.length; i++) {
        lis[i].index = i;
        lis[i].onclick = function () {
            for (var j = 0; j < lis.length; j++) {
                lis[j].className = "";
            }
            this.className = "hover";
            for (var i = 0; i < divs.length; i++) {
                divs[i].style.display = "none";
            }
            divs[this.index].style.display = "block";
        }
    }
    // 用户登录 
    function userLoad(){
        console.log($("#userForm").serialize());
        // 参数name： userName，userPassword
        // 数据库的用户信息：user 123
        // window.location.href="file:///E:/Study/%E5%A4%A7%E5%9B%9B/%E4%B8%93%E4%B8%9A%E7%BB%BC%E5%90%88%E8%AE%BE%E8%AE%A1/%E5%AE%A2%E6%88%B7%E7%AB%AF%E7%95%8C%E9%9D%A2/%E5%AE%A2%E6%88%B7%E7%AB%AF%E7%95%8C%E9%9D%A2/%E5%AE%A2%E6%88%B7%E7%AB%AF%E7%95%8C%E9%9D%A2/home.html";
         $.ajax({
            type : "post",
            // url : ,
            contentType : "application/json; charset=utf-8",
            dataType : "json",
            data : $("#userForm").serialize(),
            success : function(data) {
                window.location.href="${pageContext.request.contextPath}/links/home";
            },
            error : function(data) {
                console.log("登陆失败");
            }
        });
    }
</script>
</body>
</html>