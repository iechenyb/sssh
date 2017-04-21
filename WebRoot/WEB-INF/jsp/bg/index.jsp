<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎进入后台管理系统</title>		
	
	<!-- Import google fonts - Heading first/ text second -->
       <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
       <!--[if lt IE 9]>
	<link href="http://fonts.useso.com/css?family=Open+Sans:400" rel="stylesheet" type="text/css" />
	<link href="http://fonts.useso.com/css?family=Open+Sans:700" rel="stylesheet" type="text/css" />
	<link href="http://fonts.useso.com/css?family=Droid+Sans:400" rel="stylesheet" type="text/css" />
	<link href="http://fonts.useso.com/css?family=Droid+Sans:700" rel="stylesheet" type="text/css" />
	<![endif]-->

	<!-- Fav and touch icons -->
	<link rel="shortcut icon" href="${pageContext.request.contextPath }/themes/bg/assets/ico/favicon.ico" type="image/x-icon" />    

    <!-- Css files -->
    <link href="${pageContext.request.contextPath }/themes/bg/assets/css/bootstrap.min.css" rel="stylesheet">		
	<link href="${pageContext.request.contextPath }/themes/bg/assets/css/jquery.mmenu.css" rel="stylesheet">		
	<link href="${pageContext.request.contextPath }/themes/bg/assets/css/font-awesome.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/themes/bg/assets/css/climacons-font.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/themes/bg/assets/plugins/xcharts/css/xcharts.min.css" rel=" stylesheet">		
	<link href="${pageContext.request.contextPath }/themes/bg/assets/plugins/fullcalendar/css/fullcalendar.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/themes/bg/assets/plugins/morris/css/morris.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/themes/bg/assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/themes/bg/assets/plugins/jvectormap/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">	    
    <link href="${pageContext.request.contextPath }/themes/bg/assets/css/style.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/themes/bg/assets/css/add-ons.min.css" rel="stylesheet">		

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
     <script type="text/javascript">
    	function logout() {
			var form = document.getElementById("logout");
			form.submit();
		}
    </script>
    
</head>

<body>
	<!-- start: Header -->
	<div class="navbar" role="navigation">
	
		<div class="container-fluid">		
			
			<ul class="nav navbar-nav navbar-actions navbar-left">
				<li class="visible-md visible-lg"><a href="${pageContext.request.contextPath }/bg/user/home#" id="main-menu-toggle"><i class="fa fa-th-large"></i></a></li>
				<li class="visible-xs visible-sm"><a href="index.html#" id="sidebar-menu"><i class="fa fa-navicon"></i></a></li>			
			</ul>
			
			<div class="copyrights"> <a href="" ></a></div>
	        <ul class="nav navbar-nav navbar-right">
				<li class="dropdown visible-md visible-lg">
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope-o"></i><span class="badge">5</span></a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>消息</strong>
							<div class="progress thin">
							  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
							    <span class="sr-only">30% Complete (success)</span>
							  </div>
							</div>
						</li>
						<!-- 消息 -->
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar5.jpg">
								<div>New message</div>
								<small>1 hours ago</small>
							</a>
						</li>						
						<li class="dropdown-menu-footer text-center">
							<a href="page-inbox.html">查看所有消息</a>
						</li>	
	        		</ul>
	      		</li>
				<li class="dropdown visible-md visible-lg">
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell-o"></i><span class="badge">3</span></a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>通知</strong>
							<div class="progress thin">
							  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
							    <span class="sr-only">30% Complete (success)</span>
							  </div>
							</div>
						</li>							
                        
                        <!-- 通知 -->
                        <li class="clearfix">
                            <i class="fa fa-trash-o"></i> 
                            <a href="page-activity.html" class="notification-user"> Lorenzo </a> 
                            <span class="notification-action"> just remove <a href="#" class="notification-link"> 12 files</a></span> 
                        </li>                        
						<li class="dropdown-menu-footer text-center">
							<a href="page-activity.html">查看所有通知</a>
						</li>
	        		</ul>
	      		</li>
				<li class="dropdown visible-md visible-lg">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-gears"></i></a>					
					<ul class="dropdown-menu update-menu" role="menu">
						<li><a href="#"><i class="fa fa-database"></i> Database </a>
                        </li>
                        <li><a href="#"><i class="fa fa-bar-chart-o"></i> Connection </a>
                        </li>
                        <li><a href="#"><i class="fa fa-bell"></i> Notification </a>
                        </li>
                        <li><a href="#"><i class="fa fa-envelope"></i> Message </a>
                        </li>
                        <li><a href="#"><i class="fa fa-flash"></i> Traffic </a>
                        </li>
						<li><a href="#"><i class="fa fa-credit-card"></i> Invoices </a>
                        </li>
                        <li><a href="#"><i class="fa fa-dollar"></i> Finances </a>
                        </li>
                        <li><a href="#"><i class="fa fa-thumbs-o-up"></i> Orders </a>
                        </li>
						<li><a href="#"><i class="fa fa-folder"></i> Directories </a>
                        </li>
                        <li><a href="#"><i class="fa fa-users"></i> Users </a>
                        </li>		
					</ul>
				</li>
				<li class="dropdown visible-md visible-lg">
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown">
	        		<img class="user-avatar" 
	        			src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar.jpg" alt="user-mail">
	        			${user.username }
	        			</a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>Account</strong>
						</li>						
						<li><a href="page-profile.html"><i class="fa fa-user"></i> Profile</a></li>
						<li><a href="page-login.html"><i class="fa fa-wrench"></i> Settings</a></li>
						<li><a href="page-invoice.html"><i class="fa fa-usd"></i> Payments <span class="label label-default">10</span></a></li>
						<li><a href="gallery.html"><i class="fa fa-file"></i> File <span class="label label-primary">27</span></a></li>
						<li class="divider"></li>						
						<li><a href="javascript:logout()"><i class="fa fa-sign-out"></i> 退出</a></li>	
	        		</ul>
	      		</li>
				<li>
				<form id="logout" action="${pageContext.request.contextPath }/logout" method="post">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				</form><a href="javascript:logout()"><i class="fa fa-power-off"></i></a></li>
			</ul>
			
		</div>
		
	</div>
	<!-- end: Header -->
	
	<div class="container-fluid content">
	
		<div class="row">
				
			<!-- start: Main Menu -->
			<div class="sidebar ">
								
				<div class="sidebar-collapse">
					<div class="sidebar-header t-center">
                        <span>
                        	
	                        <i class="fa  fa-desktop fa-3x white"></i>
	                    </span>
                    </div>										
					<div class="sidebar-menu">						
						<ul class="nav nav-sidebar">
							<li><a href="${pageContext.request.contextPath }/bg/home/index"><i class="fa fa-gears"></i><span class="text"> 后台管理系统</span></a></li>
							<sec:authorize access="hasRole('ROLE_ADMIN')">
							<li>
								<a href="#"><i class="fa fa-shield"></i><span class="text"> 权限管理系统</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="${pageContext.request.contextPath }/bg/auth/list"><i class="fa fa-lock"></i><span class="text"> 权限管理</span></a></li>
									<li><a href="${pageContext.request.contextPath }/test/page-lockscreen2.html"><i class="fa  fa-link"></i><span class="text"> 资源管理</span></a></li>
									
								</ul>	
							</li>
							</sec:authorize>
							<sec:authorize access="hasRole('ROLE_USER')">
							<li>
								<a href="#"><i class="fa fa-users"></i><span class="text"> 用户管理系统</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="${pageContext.request.contextPath }/bg/user/list"><i class="fa fa-user"></i><span class="text"> 用户管理</span></a></li>
									
								</ul>
							</li>
							</sec:authorize>
							
							
							
						</ul>
					</div>					
				</div>
				<div class="sidebar-footer">					
					
					<div class="sidebar-brand">
						后台管理系统
					</div>
					
					<ul class="sidebar-terms">
						<li><a href="index.html#">Terms</a></li>
						<li><a href="index.html#">Privacy</a></li>
						<li><a href="index.html#">Help</a></li>
						<li><a href="index.html#">About</a></li>
					</ul>
					
					<div class="copyright text-center">
						<small>Proton <i class="fa fa-coffee"></i> from <a href="" title="前台首页" target="_blank">前台首页</a></small>
					</div>					
				</div>	
				
			</div>
			<!-- end: Main Menu -->
		
		<!-- start: Content -->
		<div class="main">
		
			<div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-laptop"></i> 后台管理系统</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="${pageContext.request.contextPath }/bg/home/index">首页</a></li>
						<li><i class="fa fa-laptop"></i>后台管理系统</li>						  	
					</ol>
				</div>
			</div>
					
		</div>
		<!-- end: Content -->
		<br><br><br>
		
		
		<div id="usage">
			<ul>
				<li>
					<div class="title">Memory</div>
					<div class="bar">
						<div class="progress">
						  	<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%"></div>
						</div>
					</div>			
					<div class="desc">4GB of 8GB</div>
				</li>
				<li>
					<div class="title">HDD</div>
					<div class="bar">
						<div class="progress">
						  	<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 25%"></div>
						</div>
					</div>			
					<div class="desc">250GB of 1TB</div>
				</li>
				<li>
					<div class="title">SSD</div>
					<div class="bar">
						<div class="progress">
					  		<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%"></div>
						</div>
					</div>			
					<div class="desc">700GB of 1TB</div>
				</li>
				<li>
					<div class="title">Bandwidth</div>
					<div class="bar">
						<div class="progress">
					  		<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%"></div>
						</div>
					</div>			
					<div class="desc">90TB of 100TB</div>
				</li>				
			</ul>	
		</div>			
		
	</div><!--/container-->
		
	
	
	
	<div class="clearfix"></div>
	
		
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
	
	
	<!-- page scripts -->
	<script src="${pageContext.request.contextPath }/themes/bg/assets/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/plugins/touchpunch/jquery.ui.touch-punch.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/plugins/moment/moment.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/plugins/fullcalendar/js/fullcalendar.min.js"></script>
	
	<!-- theme scripts -->
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/SmoothScroll.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/jquery.mmenu.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/core.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/plugins/d3/d3.min.js"></script>	
	
	<!-- inline scripts related to this page -->
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/pages/index.js"></script>	
	
	<!-- end: JavaScript-->
	
</body>
</html>