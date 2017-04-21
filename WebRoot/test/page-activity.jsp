<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
	<head>
    	<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">	   
	    <title>Proton - Admin Template</title>		
		
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
		<link href="${pageContext.request.contextPath }/themes/bg/assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">		   
	    <link href="${pageContext.request.contextPath }/themes/bg/assets/css/style.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/themes/bg/assets/css/add-ons.min.css" rel="stylesheet">

	    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	    <!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->
	</head>
</head>

<body>
	<!-- start: Header -->
	<div class="navbar" role="navigation">
	
		<div class="container-fluid">		
			
			<ul class="nav navbar-nav navbar-actions navbar-left">
				<li class="visible-md visible-lg"><a href="page-activity.html#" id="main-menu-toggle"><i class="fa fa-th-large"></i></a></li>
				<li class="visible-xs visible-sm"><a href="page-activity.html#" id="sidebar-menu"><i class="fa fa-navicon"></i></a></li>			
			</ul>
			
			<form class="navbar-form navbar-left">
				<button type="submit" class="fa fa-search"></button>
				<input type="text" class="form-control" placeholder="Search..."></a>
			</form>
			
	        <ul class="nav navbar-nav navbar-right">
				<li class="dropdown visible-md visible-lg">
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope-o"></i><span class="badge">5</span></a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>Messages</strong>
							<div class="progress thin">
							  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
							    <span class="sr-only">30% Complete (success)</span>
							  </div>
							</div>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar1.jpg">
								<div>New message</div>
								<small>1 minute ago</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar2.jpg">
								<div>New message</div>
								<small>3 minute ago</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar3.jpg">
								<div>New message</div>
								<small>4 minute ago</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar4.jpg">
								<div>New message</div>
								<small>30 minute ago</small>
							</a>
						</li>
						<li class="avatar">
							<a href="page-inbox.html">
								<img class="avatar" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar5.jpg">
								<div>New message</div>
								<small>1 hours ago</small>
							</a>
						</li>						
						<li class="dropdown-menu-footer text-center">
							<a href="page-inbox.html">View all messages</a>
						</li>	
	        		</ul>
	      		</li>
				<li class="dropdown visible-md visible-lg">
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell-o"></i><span class="badge">3</span></a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>Notifications</strong>
							<div class="progress thin">
							  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
							    <span class="sr-only">30% Complete (success)</span>
							  </div>
							</div>
						</li>							
                        <li class="clearfix">
							<i class="fa fa-comment"></i> 
                            <a href="page-activity.html" class="notification-user"> Sharon Rose </a> 
                            <span class="notification-action"> replied to your </span> 
                            <a href="page-activity.html" class="notification-link"> comment</a>
                        </li>
                        <li class="clearfix">
                            <i class="fa fa-pencil"></i> 
                            <a href="page-activity.html" class="notification-user"> Nadine </a> 
                            <span class="notification-action"> just write a </span> 
                            <a href="page-activity.html" class="notification-link"> post</a>
                        </li>
                        <li class="clearfix">
                            <i class="fa fa-trash-o"></i> 
                            <a href="page-activity.html" class="notification-user"> Lorenzo </a> 
                            <span class="notification-action"> just remove <a href="#" class="notification-link"> 12 files</a></span> 
                        </li>                        
						<li class="dropdown-menu-footer text-center">
							<a href="page-activity.html">View all notification</a>
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
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img class="user-avatar" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar.jpg" alt="user-mail">jhonsmith@mail.com</a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>Account</strong>
						</li>						
						<li><a href="page-profile.html"><i class="fa fa-user"></i> Profile</a></li>
						<li><a href="page-login.html"><i class="fa fa-wrench"></i> Settings</a></li>
						<li><a href="page-invoice.html"><i class="fa fa-usd"></i> Payments <span class="label label-default">10</span></a></li>
						<li><a href="gallery.html"><i class="fa fa-file"></i> File <span class="label label-primary">27</span></a></li>
						<li class="divider"></li>						
						<li><a href="index.html"><i class="fa fa-sign-out"></i> Logout</a></li>	
	        		</ul>
	      		</li>
				<li><a href="index.html"><i class="fa fa-power-off"></i></a></li>
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
                        <span><img class="text-logo" src="${pageContext.request.contextPath }/themes/bg/assets/img/logo1.png"><i class="fa fa-space-shuttle fa-3x blue"></i></span>
                    </div>										
					<div class="sidebar-menu">						
						<ul class="nav nav-sidebar">
							<li><a href="index.html"><i class="fa fa-laptop"></i><span class="text"> Dashboard</span></a></li>
							<li>
								<a href="#"><i class="fa fa-file-text"></i><span class="text"> Pages</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="page-activity.html"><i class="fa fa-car"></i><span class="text"> Activity</span></a></li>
									<li><a href="page-inbox.html"><i class="fa fa-envelope"></i><span class="text"> Mail</span></a></li>
									<li><a href="page-invoice.html"><i class="fa fa-credit-card"></i><span class="text"> Invoice</span></a></li>							
									<li><a href="page-profile.html"><i class="fa fa-heart-o"></i><span class="text"> Profile</span></a></li>
									<li><a href="page-pricing-tables.html"><i class="fa fa-columns"></i><span class="text"> Pricing Tables</span></a></li>
									<li><a href="page-404.html"><i class="fa fa-puzzle-piece"></i><span class="text"> 404</span></a></li>
									<li><a href="page-500.html"><i class="fa fa-puzzle-piece"></i><span class="text"> 500</span></a></li>
									<li><a href="page-lockscreen.html"><i class="fa fa-lock"></i><span class="text"> LockScreen1</span></a></li>
									<li><a href="page-lockscreen2.html"><i class="fa fa-lock"></i><span class="text"> LockScreen2</span></a></li>
									<li><a href="page-login.html"><i class="fa fa-key"></i><span class="text"> Login Page</span></a></li>
									<li><a href="page-register.html"><i class="fa fa-sign-in"></i><span class="text"> Register Page</span></a></li>
								</ul>	
							</li>
							<li>
								<a href="#"><i class="fa fa-list-alt"></i><span class="text"> Forms</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="form-elements.html"><i class="fa fa-indent"></i><span class="text"> Form elements</span></a></li>
									<li><a href="form-wizard.html"><i class="fa fa-tags"></i><span class="text"> Wizard</span></a></li>
									<li><a href="form-dropzone.html"><i class="fa fa-plus-square-o"></i><span class="text"> Dropzone Upload</span></a></li>
									<li><a href="form-x-editable.html"><i class="fa fa-pencil"></i><span class="text"> X-editable</span></a></li>
								</ul>
							</li>
							<li><a href="table.html"><i class="fa fa-table"></i><span class="text"> Tables</span></a></li>
							<li>
								<a href="#"><i class="fa fa-signal"></i><span class="text"> Visual Chart</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="chart-flot.html"><i class="fa fa-random"></i><span class="text"> Flot Chart</span></a></li>
									<li><a href="chart-xchart.html"><i class="fa fa-retweet"></i><span class="text"> xChart</span></a></li>
									<li><a href="chart-other.html"><i class="fa fa-bar-chart-o"></i><span class="text"> Other</span></a></li>
								</ul>
							</li>
							<li>
								<a href="#"><i class="fa fa-briefcase"></i><span class="text"> UI Features</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">
									<li><a href="ui-sliders-progress.html"><i class="fa fa-align-left"></i><span class="text"> Progress</span></a></li>
									<li><a href="ui-nestable-list.html"><i class="fa fa-outdent"></i><span class="text"> Nestable Lists</span></a></li>
									<li><a href="ui-elements.html"><i class="fa fa-list"></i><span class="text"> Elements</span></a></li>
									<li><a href="ui-panels.html"><i class="fa fa-list-alt"></i><span class="text"> Panels</span></a></li>
									<li><a href="ui-buttons.html"><i class="fa fa-th"></i><span class="text"> Buttons</span></a></li>
								</ul>
							</li>
							<li><a href="widgets.html"><i class="fa fa-life-bouy"></i><span class="text"> Widgets</span></a></li>
							<li><a href="typography.html"><i class="fa fa-font"></i><span class="text"> Typography</span></a></li>
							<li>
								<a href="#"><i class="fa fa-bolt"></i><span class="text"> Icons</span> <span class="fa fa-angle-down pull-right"></span></a>
								<ul class="nav sub">									
									<li><a href="icons-font-awesome.html"><i class="fa fa-meh-o"></i><span class="text"> Font Awesome</span></a></li>
									<li><a href="icons-climacons.html"><i class="fa fa-meh-o"></i><span class="text"> Climacons</span></a></li>
								</ul>
							</li>
							<li><a href="gallery.html"><i class="fa fa-picture-o"></i><span class="text"> Gallery</span></a></li>							
							<li><a href="calendar.html"><i class="fa fa-calendar"></i><span class="text"> Calendar</span></a></li>
						</ul>
					</div>					
				</div>
				<div class="sidebar-footer">					
					
					<div class="sidebar-brand">
						Proton
					</div>
					
					<ul class="sidebar-terms">
						<li><a href="index.html#">Terms</a></li>
						<li><a href="index.html#">Privacy</a></li>
						<li><a href="index.html#">Help</a></li>
						<li><a href="index.html#">About</a></li>
					</ul>
					
					<div class="copyright text-center">
						<small>Proton <i class="fa fa-coffee"></i> from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></small>
					</div>					
				</div>	
				
			</div>
			<!-- end: Main Menu -->
						
		<!-- start: Content -->
		<div class="main ">
		
			<div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-car"></i>Activity</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
						<li><i class="fa fa-file-text"></i><a href="#">Pages</a></li>
						<li><i class="fa fa-car"></i>Activity</li>
					</ol>
				</div>
			</div>
						
			<div class="row activity">
				
				<div class="col-md-6">
					
					<div class="panel panel-default">						
					  	<div class="panel-body">														
					    	<input type="email" class="form-control" placeholder="What's on your mind?">
					  	</div>
						<div class="panel-footer">
							<div class="btn-group">
								<button type="button" class="btn btn-link"><i class="fa fa-map-marker"></i></button>
								<button type="button" class="btn btn-link"><i class="fa fa-camera"></i></button>
								<button type="button" class="btn btn-link"><i class="fa fa-video-camera"></i></button>								
							</div>
							
							<div class="pull-right">
								<button type="button" class="btn btn-primary">Post</button>
							</div>	
						</div>
					</div>			
					
					<div class="panel panel-default">
					  	<div class="panel-heading">
							<img src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar.jpg" class="img-rounded">
							<div class="pull-right text-right">
								<i class="fa fa-car"></i><br/> 30 minutes ago
							</div>
							<div><a href="page-activity.html#"><strong>Jhon Smith</strong></a></div>
							<div class="small"><i class="fa fa-map-marker"></i> California, USA</div>
							
					    	
					  	</div>
					  	<div class="panel-body">
					    	<blockquote>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</blockquote>
							<div class="actions">
							<div class="btn-group">
								<button type="button" class="btn btn-link">Like</button>
								<button type="button" class="btn btn-link">Comment</button>
								<button type="button" class="btn btn-link">Share</button>									
							</div>
							<div class="pull-right"><strong>2.596</strong> People liked this</div>
						</div>
						</div>
						<div class="panel-footer">
							<input type="email" class="form-control" placeholder="Write a comment...">
						</div>
					</div>
					
					<div class="panel panel-default">
					  	<div class="panel-heading">
							<img src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar.jpg" class="img-rounded">
							<div class="pull-right text-right">								
								<i class="fa fa-car"></i><br/> 30 minutes ago								
							</div>
							<div><a href="page-activity.html#"><strong>Jhon Smith</strong></a></div>
							<div class="small"><i class="fa fa-map-marker"></i> California, USA</div>
							
					    	
					  	</div>
						<div class="panel-body">
					    	<blockquote>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</blockquote>
							<div class="actions">
								<div class="btn-group">
									<button type="button" class="btn btn-link">Like</button>
									<button type="button" class="btn btn-link">Comment</button>
									<button type="button" class="btn btn-link">Share</button>									
								</div>
								<div class="pull-right"><strong>2.596</strong> People liked this</div>
							</div>
						</div>
						
					  	<div class="panel-footer">												
							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar7.jpg">
							  	</a>
							  	<div class="media-body">
									<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Sharon Rose</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>																
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>									
								</div>
							</div>							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar7.jpg">
							  	</a>
							  	<div class="media-body">
							    	<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Sharon Rose</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>
								</div>
							</div>
							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar7.jpg">
							  	</a>
							  	<div class="media-body">
							    	<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Sharon Rose</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>
								</div>
							</div>			
							
					  	</div>
						<div class="panel-footer">
							<input type="email" class="form-control" placeholder="Write a comment...">
						</div>
					</div>

					<div class="panel panel-default">
					  	<div class="panel-heading">
							<img src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar.jpg" class="img-rounded">
							<div class="pull-right text-right">								
								<i class="fa fa-car"></i><br/> 30 minutes ago								
							</div>
							<div><a href="page-activity.html#"><strong>Jhon Smith</strong></a></div>
							<div class="small"><i class="fa fa-map-marker"></i> California, USA</div>
							
					    	
					  	</div>
						<div class="panel-body">
					    	<blockquote>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</blockquote>
							<div class="actions">
								<div class="btn-group">
									<button type="button" class="btn btn-link">Like</button>
									<button type="button" class="btn btn-link">Comment</button>
									<button type="button" class="btn btn-link">Share</button>									
								</div>
								<div class="pull-right"><strong>2.596</strong> People liked this</div>
							</div>
						</div>
						
					  	<div class="panel-footer">												
							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar6.jpg">
							  	</a>
							  	<div class="media-body">
									<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Lorenzo</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>																
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>									
								</div>
							</div>							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar6.jpg">
							  	</a>
							  	<div class="media-body">
							    	<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Lorenzo</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>
								</div>
							</div>
							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar6.jpg">
							  	</a>
							  	<div class="media-body">
							    	<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Lorenzo</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>
								</div>
							</div>			
							
					  	</div>
						<div class="panel-footer">
							<input type="email" class="form-control" placeholder="Write a comment...">
						</div>
					</div>				
				</div><!--/.col-->
				
				
				<div class="col-md-6">
					<div class="panel panel-default">
					  	<div class="panel-heading">
							<img src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar.jpg" class="img-rounded">
							<div class="pull-right text-right">
								<i class="fa fa-car"></i><br/> 30 minutes ago
							</div>
							<div><a href="page-activity.html#"><strong>Jhon Smith</strong></a></div>
							<div class="small"><i class="fa fa-map-marker"></i> California, USA</div>
							
					    	
					  	</div>
					  	<div class="panel-body">
					    	
							<div class="row">
								
								<div class="col-lg-4 col-md-6 col-xs-12">
									<img class="img-responsive" src="${pageContext.request.contextPath }/themes/bg/assets/img/gallery/photo1.jpg">
								</div><!--/.col-->
								
								<div class="col-lg-4 col-md-6 col-xs-12">
									<img class="img-responsive" src="${pageContext.request.contextPath }/themes/bg/assets/img/gallery/photo2.jpg">
								</div><!--/.col-->
								
								<div class="col-lg-4 col-md-6 col-xs-12">
									<img class="img-responsive" src="${pageContext.request.contextPath }/themes/bg/assets/img/gallery/photo3.jpg">
								</div><!--/.col-->
								
							</div><!--/.row-->
							<div class="actions">
								<div class="btn-group">
									<button type="button" class="btn btn-link">Like</button>
									<button type="button" class="btn btn-link">Comment</button>
									<button type="button" class="btn btn-link">Share</button>									
								</div>
								<div class="pull-right"><strong>2.596</strong> People liked this</div>
							</div>
					
					  	</div>
						<div class="panel-footer">
							<input type="email" class="form-control" placeholder="Write a comment...">
						</div>
					</div>					
					
					<div class="panel default">
					  	<div class="panel-heading">
							<img src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar.jpg" class="img-rounded">
							<div class="pull-right text-right">
								<i class="fa fa-car"></i><br/> 30 minutes ago
							</div>
							<div><a href="page-activity.html#"><strong>Jhon Smith</strong></a></div>
							<div class="small"><i class="fa fa-map-marker"></i> California, USA</div>
							
					    	
					  	</div>
					  	<div class="panel-body">
					    	
							<div class="video-container">
								<iframe src="http://player.vimeo.com/video/87526548" width="500" height="281" frameborder="0"></iframe>
							</div>
							<div class="actions">
								<div class="btn-group">
									<button type="button" class="btn btn-link">Like</button>
									<button type="button" class="btn btn-link">Comment</button>
									<button type="button" class="btn btn-link">Share</button>									
								</div>
								<div class="pull-right"><strong>2.596</strong> People liked this</div>
							</div>
							
						</div>
						
						<div class="panel-footer">												
							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar3.jpg">
							  	</a>
							  	<div class="media-body">
									<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Nadine</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>																
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>									
								</div>
							</div>							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar3.jpg">
							  	</a>
							  	<div class="media-body">
							    	<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Nadine</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>
								</div>
							</div>
							
							<div class="media">
							  	<a class="pull-left" href="page-activity.html#">
							    	<img class="media-object img-rounded" src="${pageContext.request.contextPath }/themes/bg/assets/img/avatar3.jpg">
							  	</a>
							  	<div class="media-body">
							    	<div class="pull-right small">30 minutes ago</div>
									<a href="page-activity.html#">
										<div class="media-heading">
											<strong>Nadine</strong>
										</div>
									</a>
							    	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia, suscipit, autem sit natus deserunt officia error odit ea minima soluta ratione maxime molestias fugit explicabo aspernatur praesentium quisquam voluptatum fuga.</p>
									<a href="page-activity.html#">Like</a><small><strong> 2.596</strong> People liked this</small>
								</div>
							</div>
							
					  	</div>
						<div class="panel-footer">
							<input type="email" class="form-control" placeholder="Write a comment...">
						</div>	
					
					</div>
					
				</div><!--/.col-->
				
			</div><!--/.row-->
     
					
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
		
	
	<div class="modal fade" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title">Modal title</h4>
				</div>
				<div class="modal-body">
					<p>Here settings can be configured...</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
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
	
	<!-- theme scripts -->
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/SmoothScroll.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/jquery.mmenu.min.js"></script>
	<script src="${pageContext.request.contextPath }/themes/bg/assets/js/core.min.js"></script>
	
	<!-- inline scripts related to this page -->
	
	<!-- end: JavaScript-->
	
</body>
</html>