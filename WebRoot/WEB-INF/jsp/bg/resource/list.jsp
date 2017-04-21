<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资源信息列表</title>
</head>
<body>
资源信息列表<br><br><br>

<c:forEach var="entry" items="${pageView.records }">
	${entry.name }<br>
</c:forEach>

</body>
</html>