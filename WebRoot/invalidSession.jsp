<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>登录超时</title>
	
	<!-- Import google fonts - Heading first/ text second -->
    <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!--[if lt IE 9]>
	<link href="http://fonts.useso.com/css?family=Open+Sans:400" rel="stylesheet" type="text/css" />
	<link href="http://fonts.useso.com/css?family=Open+Sans:700" rel="stylesheet" type="text/css" />
	<link href="http://fonts.useso.com/css?family=Droid+Sans:400" rel="stylesheet" type="text/css" />
	<link href="http://fonts.useso.com/css?family=Droid+Sans:700" rel="stylesheet" type="text/css" />
	<![endif]-->

	<!-- Favicon and touch icons -->
	<link rel="shortcut icon" href="${pageContext.request.contextPath }/themes/bg/assets/ico/favicon.ico" type="image/x-icon" /> 

    <!-- Css files -->
    <link href="${pageContext.request.contextPath }/themes/bg/assets/css/bootstrap.min.css" rel="stylesheet">		
	<link href="${pageContext.request.contextPath }/themes/bg/assets/css/jquery.mmenu.css" rel="stylesheet">		
	<link href="${pageContext.request.contextPath }/themes/bg/assets/css/font-awesome.min.css" rel="stylesheet">			   
    <link href="${pageContext.request.contextPath }/themes/bg/assets/css/style.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/themes/bg/assets/css/add-ons.min.css" rel="stylesheet">
	<style>
		footer {
			display: none;
		}
	</style>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
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
						<a href="${pageContext.request.contextPath }/bg/user/login">
							<button class="btn btn-default"><span class="fa fa-lock"> 去登录</span></button>
						</a>
						<a href="#">
							<button class="btn btn-default"><span class="fa fa-envelope"> 联系管理员</span></button>	
						</a>
					</div>
					
					</div><!--/col-->
				
				</div><!--/row-->
		
			</div><!--/content-->	
				
		</div><!--/row-->

		
		<div id="usage-blank">
			<ul>
				<li>
					<div class="title">Memory</div>
					<div class="bar">
						<div class="progress">
						  	<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 25%"></div>
						</div>
					</div>			
					<div class="desc">2GB of 8GB</div>
				</li>
				<li>
					<div class="title">HDD</div>
					<div class="bar">
						<div class="progress">
						  	<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 75%"></div>
						</div>
					</div>			
					<div class="desc">750GB of 1TB</div>
				</li>
				<li>
					<div class="title">SSD</div>
					<div class="bar">
						<div class="progress">
					  		<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%"></div>
						</div>
					</div>			
					<div class="desc">300GB of 1TB</div>
				</li>
				<li>
					<div class="title">Bandwidth</div>
					<div class="bar">
						<div class="progress">
					  		<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
						</div>
					</div>			
					<div class="desc">50TB of 50TB</div>
				</li>				
			</ul>	
		</div>						
		
	</div><!--/container-->
		
		
	<!-- start: JavaScript-->
	<!--[if !IE]>-->

			<script src="${pageContext.request.contextPath }/themes/bg/assets/js/jquery-2.1.1.min.js"></script>			

	<!--<![endif]-->

	<!--[if IE]>
	
		<script src="${pageContext.request.contextPath }/themes/bg/assets/js/jquery-1.11.1.min.js"></script>
	
	<![endif]-->

	<!--[if !IE]>-->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='${pageContext.request.contextPath }/themes/bg/assets/js/jquery-2.1.1.min.js'>"+"<"+"/script>");
		</script>

	<!--<![endif]-->

	<!--[if IE]>
	
		<script type="text/javascript">
	 	window.jQuery || document.write("<script src='${pageContext.request.contextPath }/themes/bg/assets/js/jquery-1.11.1.min.js'>"+"<"+"/script>");
		</script>
		
	<![endif]-->
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/jquery-migrate-1.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/bootstrap.min.js"></script>	
	
		
	<!-- theme scripts -->
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/SmoothScroll.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/jquery.mmenu.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/core.min.js"></script>
	<!-- end: JavaScript-->
</body>
</html>