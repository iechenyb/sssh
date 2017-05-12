<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <% 
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>登录超时</title>
</head>
<body>
	<div class="container-fluid content">
		<div class="row">
			<div id="content" class="col-sm-12 full">
			
				<div class="row box-error">
				
					<div class="col-lg-12 col-md-12 col-xs-12">
					<div class="text-center">
						<h3>登录超时</h3>
						<h4>您的登录已超时，请重新登录 ...</h4>
						<a href="<%=basePath%>login.jsp">
							<button class="btn btn-default"><span class="fa fa-lock"> 去登录</span></button>
						</a>
					</div>
					
					</div><!--/col-->
				
				</div><!--/row-->
		
			</div><!--/content-->	
				
		</div><!--/row-->
</body>
</html>