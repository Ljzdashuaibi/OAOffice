<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>OA办公系统</title>
   <script type="text/javascript" src="statics/lib/jquery-3.1.1.js"></script>
<link rel="stylesheet" href="statics/css/wukong-ui.css" />
</head>
<body class="logonBody">
	 <form class="loginForm" action="${pageContext.request.contextPath }/" method="post" >
		<div class="logon">
	    	<ul>
	        	<li><input type="text" name="account" placeholder="请输入账户名"/></li>
	            <li><input type="password" name="password" placeholder="请输入登录密码"/></li>
	        </ul>	
	       <input type="submit" class="logonSubmitBtn" value="登录"/>
	    </div>
	</form>
		
</body>
</html>
