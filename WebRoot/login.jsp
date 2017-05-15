<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>login</title>
</head>
<body>
<div class="container-fluid content">
		<div class="row">
			<div id="content" class="col-sm-12 full">
				<div class="row">
					<div class="login-box">
					
						<div class="header">
						欢迎进入后台管理系统
						</div>
						<div class="text-center">
						<c:if test="${param.error != null}">
							<span style="color: red;">账号或密码错误!  ${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}</span>
						</c:if>
						</div>				
				
						<br>
					
						<form class="form-horizontal login" action="${pageContext.request.contextPath }/customer/login" method="post">
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						
							<fieldset class="col-sm-12">
								<div class="form-group">
									<div class="controls row">
										<div class="input-group col-sm-12">	
											<input type="text" class="form-control" name="username" id="username" placeholder="E-mail" required="required"/>
											<span class="input-group-addon"><i class="fa fa-user"></i></span>
										</div>	
									</div>
								</div>
							
								<div class="form-group">
									<div class="controls row">
										<div class="input-group col-sm-12">	
											<input type="password" class="form-control" name="password" id="password" placeholder="Password" required="required"/>
											<span class="input-group-addon"><i class="fa fa-key"></i></span>
										</div>	
									</div>
								</div>

								<div class="confirm">
									<input type="checkbox" name="remember"/>
									<label for="remember">记住我</label>
								</div>	

								<div class="row">
							
									<button type="submit" class="btn btn-lg btn-primary col-xs-12">登录</button>
							
								</div>
								
							</fieldset>	

						</form>
					      
						<div class="clearfix"></div>				
						
					</div>
				</div><!--/row-->
		
			</div>	
			
		</div><!--/row-->		
	</div><!--/container-->
</body>
</html>