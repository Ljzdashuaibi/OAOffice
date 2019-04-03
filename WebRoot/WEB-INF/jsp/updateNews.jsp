<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	            <li><a href="#">新闻管理</a></li>
	            <li><a href="#">发布新闻</a></li>
			</ul>
		</div>
	</div>

	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default wk-panel ">
				<div class="panel-heading">发布新闻 Create Data</div>
				<form action="${pageContext.request.contextPath }/addnews.html" method="POST">
					<div class="panel-body">
						<div class="row">
							<div class="form-inline">
								<div class="form-group">
									<label for="filePath" class="control-label wk-filed-label">新闻标题:
									</label>
									<div class="input-group">
										<input required="required" value="${news.title}" name="title" type="text"
											class="form-control wk-normal-input"
											placeholder="请输入新闻标题" />
									</div>
								</div>

								<div class="form-group">
									<label for="filePath" class="control-label wk-filed-label">:
									</label>
									<div class="input-group">
										<input required="required" value="${news.content}" name="content" type="text"
											class="form-control wk-long-2col-input" height="500px;"
											placeholder="请输入新闻内容" />
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