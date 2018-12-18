<%--
  Created by IntelliJ IDEA.
  User: ping
  Date: 2018/12/17
  Time: 23:39
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
    <title>管理员—首页</title>
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
        <img src="${pageContext.request.contextPath}/image/adminLogo.jpeg" width="100" height="100" style="border-radius:50% ;margin-top: 30px;margin-left: 35px">
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
            <li><a href="${pageContext.request.contextPath}/links/adminEquipment" style="background-color: #E6E6FA;"> 器材管理</a></li>
            <li><a href="${pageContext.request.contextPath}/links/adminArea"  >场地管理</a></li>
            <li><a href="${pageContext.request.contextPath}/links/adminNotice"  >通知管理</a></li>
            <li><a href="${pageContext.request.contextPath}/links/adminActivity"  >活动管理</a></li>
            <li><a href="${pageContext.request.contextPath}/links/adminUser" >会员管理</a></li>
            <li><a href="${pageContext.request.contextPath}/links/adminFinance">财务管理</a></li>
            <li><a href="${pageContext.request.contextPath}/links/adminPersonal">个人中心</a></li>
        </ul>
    </div>
    <%-- 器材数据表格--%>
    <div class="main" id="equipTable">
        <div>
            <input class="btn btn-default deleteEquip" type="button" value="批量删除" onclick="deleteEquip()">
            <input class="btn btn-default addEquip" type="button" value="新增器材" data-toggle="modal" data-target="#addModal">
        </div>
        <div class="table-responsive table-bordered">
            <table class="table" id="equipTableList">
                <thead>
                    <tr>
                        <th> </th>
                        <th>器材名称</th>
                        <th>器材库存</th>
                        <th>器材余数</th>
                        <th>每件租金</th>
                        <th>编辑</th>
                    </tr>
                </thead>
                <tbody>
                <%--&lt;%&ndash; equipList 是一个数组对象，这里我不知道是不是这样遍历&ndash;%&gt;--%>
                    <%--<c:if test="${!empty equipList}">--%>
                        <%--<c:forEach var="equip" items="${equipList}">--%>
                            <%--<tr>--%>
                                <%--<td><input  name="deleteId" value="${equip.equipId}" type="checkbox" class="checkItem" /></td>--%>
                                <%--<td>${equip.equipName}</td>--%>
                                <%--<td>${equip.equipTotal}</td>--%>
                                <%--<td>${equip.equipRest}</td>--%>
                                <%--<td>${equip.equipConst}</td>--%>
                                <%--<td>$<input class="btn btn-default editEquip" type="button" value="编辑" data-toggle="modal" onclick="equipMsg(${equip.equipId})">  </td>--%>
                                <%--&lt;%&ndash;<td>$<input class="btn btn-default editEquip" type="button" value="编辑" data-toggle="modal" data-target="#editModal" onclick="equipMsg(1)"></td>&ndash;%&gt;--%>
                            <%--</tr>--%>
                        <%--</c:forEach>--%>
                    <%--</c:if>--%>
                </tbody>
            </table>
        </div>
    </div>
    <%-- 修改器材模态框--%>
    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">
                        器材修改
                    </h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="editForm" role="form" method="post">
                        <div class="form-group" style="display: none">
                            <label class="col-sm-3 control-label" for="equipIdEdit">器材ID</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"  id="equipIdEdit" name="equipId" value="${equipData.equipId}"
                                       placeholder="请输入器材ID">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipNameEdit">器材名</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="equipNameEdit" name="equipName" value="${equipData.equipName}"
                                       placeholder="请输入器材名">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipTotalEdit">器材总数</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"  id="equipTotalEdit" name="equipTotal"  value="${equipData.equipTotal}"
                                       placeholder="请输入器材总数">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipRestEdit">器材余数</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="equipRestEdit" name="equipRest"  value="${equipData.equipRest}"
                                       placeholder="请输入器材余数">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipConstEdit">每件租金</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="equipConstEdit" name="equipConst" value="${equipData.equipConst}"
                                       placeholder="请输入每件器材租金">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary closemodal" data-dismiss="modal">关闭
                    </button>
                    <button type="button" onclick="editEquip()" class="btn btn-primary submitmodal">
                        提交
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
    <!-- 新增器材的模态框 -->
    <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <%--<h4 class="modal-title" id="myModalLabel">--%>
                    <h4 class="modal-title">
                        器材新增
                    </h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="addForm" role="form" method="post">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipId">器材ID</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"  id="equipId" name="equipId" value=""
                                       placeholder="请输入器材ID">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipName">器材名</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="equipName" name="equipName" value=""
                                       placeholder="请输入器材名">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipTotal">器材总数</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control"  id="equipTotal" name="equipTotal" value=""
                                   placeholder="请输入器材总数">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipRest">器材余数</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="equipRest" name="equipRest" value=""
                               placeholder="请输入器材余数">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="equipConst">每件租金</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="equipConst" name="equipConst" value=""
                                       placeholder="请输入每件器材租金">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary closemodal" data-dismiss="modal">关闭
                    </button>
                    <button type="button" onclick="addEquip()" class="btn btn-primary submitmodal">
                        提交
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
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
                },
                error : function() {
                    console.log("器材数据返回失败");
                }
            })
        };
        // 把 form 表单获取的参数转为 json格式
        function stringToJson(str){
            console.log('str',str);
            var obj ={};
            //将表单数据转换为json
            $.each(str,function(i,v){
              obj[v.name] = v.value;
            });
            obj = JSON.stringify(obj);
            return obj;
        }
        // 提交新增器材
        function addEquip() {
        console.log('addEquip')
        console.log($("#addForm").serializeArray());
        var addEquipObj = this.stringToJson($("#addForm").serializeArray());
        if(addEquipObj){
        console.log('addEquipObj',addEquipObj)
        $.ajax({
        type: "post",
        url :"${pageContext.request.contextPath}/admin/addEquip",
        contentType : "application/json; charset=utf-8",
        dataType : "json",
        data : addEquipObj,
        success : function(data) {
        console.log("器材添加成功");
        console.log(data)
        if (data.result ="success"){
        window.location.href="${pageContext.request.contextPath}/links/adminEquipment";
        }else{
        alert("检查输入信息！")
        }
        },
        error : function(data) {
        console.log("器材添加失败");
        }
        })
        }
        }
        // 根据器材ID 删除器材数据
        function deleteEquip(){
        // 获取要删除的 idList  数组
        var idList = [];
        $.each($('input:checkbox'),function(){
        if(this.checked) {
        idList.push($(this).val());
        console.log(idList);
        }
        });
        console.log(idList);
        if(idList.length>0){
        console.log('发送请求',idList)
        $.ajax({
        type: "post",
        url :"${pageContext.request.contextPath}/admin/deleteEquip",
        contentType : "application/json; charset=utf-8",
        dataType : "json",
        data :{equipIds: idList},
        success : function(data) {
        if (data.result ="success"){
        window.location.href="${pageContext.request.contextPath}/links/adminEquipment";
        }
        },
        error : function(data) {
        console.log("器材删除失败");
        }
        })
        }
        }
        // 提交修改器材的数据
        function editEquip(){
        console.log('editEquip')
        console.log($("#editForm").serializeArray());
        var editEquipObj = this.stringToJson($("#editForm").serializeArray());
        if(editEquipObj){
        console.log('editEquipObj',editEquipObj)
        $.ajax({
        type: "post",
        url :"${pageContext.request.contextPath}/admin/editEquip",
        contentType : "application/json; charset=utf-8",
        dataType : "json",
        data : editEquipObj,
        success : function(data) {
        console.log("器材修改成功");
        console.log(data)
        if (data.result ="success"){
        window.location.href="${pageContext.request.contextPath}/links/adminEquipment";
        }else{
        alert("检查输入信息！")
        }
        },
        error : function(data) {
        console.log("器材修改失败");
        }
        })
        }
        }
        // 根据器材 ID，获取器材数据用于编辑器材
        function equipMsg(id) {
        console.log('id',id);
        $.ajax({
        type: "post",
        url :"${pageContext.request.contextPath}/admin/"+id+"getEquip",
        contentType : "application/json; charset=utf-8",
        dataType : "json",
        success : function(data) {
        console.log("成功返回器材数据");
        console.log(data)
        // 返回数据以后，才让模态框弹出，此时模态框才有编辑器材的数据
        if (data.result ="success"){
        $("#editModal").modal("show")
        }else{
        alert("检查输入信息！")
        }
        },
        error : function(data) {
        console.log("器材查询失败");
        }
        })
}
</script>
</body>

