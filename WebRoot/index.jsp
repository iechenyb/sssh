<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% 
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
<%=basePath%>
<a href="<%=basePath%>customer/1">user</a>
<a href="<%=basePath%>admin/1">admin</a>
<a href="<%=basePath%>login.jsp">登录</a>
<a href="<%=basePath%>customer/exit">退出</a>
</body>
</html>