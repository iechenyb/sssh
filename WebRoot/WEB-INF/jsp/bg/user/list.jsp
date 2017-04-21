<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>用户信息列表</title>
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	
	
	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
    	function logout() {
			var form = document.getElementById("logout");
			form.submit();
		}
    </script>
</head>
<body>
user list<br><br><br>

<div class="container">


<table class="table table-bordered table-hover table-condensed">
	<thead>
		<tr>
			<td>邮箱</td>
			<td>昵称</td>
			<td>IP地址</td>
			<td>账号未过期</td>
			<td>账号未锁定</td>
			<td>凭证未过期</td>
			<td>状态</td>
			<td>创建时间</td>
			<td>手机号码</td>
			<td>操作</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="entry" items="${pageView.records }">
		<tr>
			<td>${entry.email }</td>
			<td>${entry.nikename }</td>
			<td>${entry.createdIPAddress }</td>
			<td>${entry.accountNonExpired }</td>
			<td>${entry.accountNonLocked }</td>
			<td>${entry.credentialsNonExpired }</td>
			<td>${entry.enabled }</td>
			<td>${entry.createdTime }</td>
			<td>${entry.cellphone }</td>
			<td>
			<sec:authorize access="hasRole('ROLE_ADMIN')">
				<a href="${pageContext.request.contextPath }/bg/user/disable">冻结</a>
				<a href="${pageContext.request.contextPath }/bg/user/enable">激活</a>
				<a href="${pageContext.request.contextPath }/bg/user/delete">删除</a>
				<a href="${pageContext.request.contextPath }/bg/user/addpage">添加</a><br>
			</sec:authorize>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

	<br>
	<br>
	<form id="logout" action="${pageContext.request.contextPath }/logout" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
	<a href="javascript:logout()">退出</a><br>
</div>
	
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" 
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>