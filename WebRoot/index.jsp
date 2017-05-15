<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% 
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<%@ taglib prefix='sec' uri='http://www.springframework.org/security/tags'%>
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
  <%--<sec:authorize ifAllGranted ="ROLE_ADMIN">管理员页面 </sec:authorize>
     <sec:authorize ifAllGranted ="ROLE_USER">普通用户页面 </sec:authorize>
      <sec:authorize access="hasRole('ROLE_ADMIN')">
        <a href="admin.jsp">admin page</a>
      </sec:authorize> --%>
   <!-- 需要拥有所有的权限 -->
   <%-- <sec:authorize ifAllGranted="ROLE_ADMIN">
      <a href="admin.jsp">admin</a>
   </sec:authorize> --%>
   <!-- 只需拥有其中任意一个权限 -->
   <%-- <sec:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">hello</sec:authorize> --%>
   <!-- 不允许拥有指定的任意权限 -->
              用户名： <sec:authentication property="name"/> <br/> 
              <hr>
    <!-- 拥有访问指定url的权限才显示其中包含的内容 -->
   <sec:authorize url="/admin/admin.jsp">
      <a href="/admin/admin.jsp">admin</a>
   </sec:authorize>
   <sec:authorize url="/customer/user.jsp">
      <a href="/customer/user.jsp">user</a>
   </sec:authorize>
   <sec:authorize url="/other/admin.jsp">
      <a href="sdsd.jsp">other</a>
   </sec:authorize>
   <hr>
    <sec:authorize access="isFullyAuthenticated()" var="isFullyAuthenticated">
      	只有通过登录界面进行登录的用户才能看到1。<br/>
   </sec:authorize>
   		上述权限的鉴定结果是：${isFullyAuthenticated }<br/>
   <%if((Boolean)pageContext.getAttribute("isFullyAuthenticated")) {%>
      	只有通过登录界面进行登录的用户才能看到2。
   <%}%>
   <sec:authentication property="principal.username"/>
   <sec:authentication property="name"/>
   <!-- 将获取到的用户名以属性名username存放在session中 -->
   <sec:authentication property="principal.username" scope="session" var="username"/>
   ${username }
   <hr>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <a href="admin.jsp">admin page</a>
     </sec:authorize> 
     <sec:authorize access="hasRole('ADMIN')">
        <a href="admin.jsp">admin page</a>
     </sec:authorize> 
     <sec:authorize access="hasRole('ROLE_USER')">
        <a href="admin.jsp">User page</a>
     </sec:authorize> 
     <sec:authorize access="hasRole('USER')">
        <a href="admin.jsp">User page</a>
     </sec:authorize> 
</body>
</html>