<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<base href="<%=basePath%>">
	<link rel="stylesheet" href="statics/bootstrap/css/bootstrap.min.css" >    
	<link rel="stylesheet" href="statics/bootstrap/css/bootstrap-theme.min.css">
	<script type="text/javascript" src="statics/lib/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="statics/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="statics/css/wukong-ui.css">
	<link rel="stylesheet" href="statics/bootstrap/css/bootstrap-select.min.css">
    <script type="text/javascript" src="statics/bootstrap/js/bootstrap-select.min.js"></script>
</head>

<body>
<div class="row">
    <div class="col-lg-12">
        <ul class="breadcrumb wk-breadcrumb">
            <li><a href="#">企业信息管理系统</a></li>
            <li><a href="#">人事管理</a></li>
            <li><a href="#">编辑员工</a></li>
        </ul>
    </div>
</div>
    
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default wk-panel ">
                <div class="panel-heading">
                    编辑员工 Create Data
                </div>
                <form action="${pageContext.request.contextPath }/editUser.html" method="POST">
                <input type="hidden" name="id" value="${user.id }"/>
                <div class="panel-body">
                    <div class="row">
                      <div class="form-inline">  
                      
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">员工姓名: </label>
                                 <div class="input-group">
                                    <input required="required" value="${user.name}" name="name" type="text" class="form-control wk-normal-input" id="mark" placeholder="请输入员工姓名"/>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">薪资水平: </label>
                                <div class="input-group">
                                    <input required="required" value="${user.wages}" name="wages" type="number" class="form-control wk-normal-input" id="mark" placeholder="请输入薪资水平"/>
                                </div>
                            </div>
                                
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">所属部门: </label>
                                <select class="wk-select" name="deptId">
                                    <c:forEach items="${depts}" var="var">
                                        <c:choose>
								          		<c:when test="${var.id == user.deptId}">
								          			<option value="${var.id}" selected="selected">${var.name}</option>
								          		</c:when>
								          		<c:otherwise>
								          			<option value="${var.id}" >${var.name}</option>
								          		</c:otherwise>
								          	</c:choose>
                                    </c:forEach>
                                </select>
                            </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">性别: </label>
                                <select class="wk-select" name="gender">
                                	<c:choose>
						          		<c:when test="${1 == user.gender}">
						          			<option value="1" selected="selected">男</option>
                                			<option value="2">女</option>
						          		</c:when>
						          		<c:otherwise>
						          			<option value="1">男</option>
                                			<option value="2" selected="selected">女</option>
						          		</c:otherwise>
						          	</c:choose>
                                	
                                </select>
                            </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">联系电话: </label>
                                <div class="input-group">
                                    <input required="required"  value="${user.telphone}"  name="telphone" type="text" class="form-control wk-normal-input" id="mark" placeholder="请输入联系电话"/>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">联系地址: </label>
                                <div class="input-group">
                                    <input required="required"  value="${user.address}"  name="address" type="text" class="form-control wk-long-2col-input" id="mark" placeholder="请输入联系地址"/>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">登录账号: </label>
                                <div class="input-group">
                                    <input required="required" value="${user.account}" name="account" type="text" class="form-control wk-normal-input" id="mark" placeholder="请输入登录账号"/>
                                </div>
                            </div>
                            
                            
                            
                        </div>

                    </div>
                 </div>

                <div class="panel-footer wk-panel-footer">
                    <button type="submit" class="btn btn-default wk-btn">提&nbsp;&nbsp;交</button>
                </div>
                </form>
            </div>
        </div>
    </div>

</body>
</html>