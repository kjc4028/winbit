<%@page import="java.sql.Timestamp"%>
<%@page import="web.page.DTO.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC>
<html>
<head>
 <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
 <link href="/resources/dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width initial-scale=1">
 <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.css'/>" type="text/css">
 <link rel="stylesheet" href="<c:url value='/resources/css/custom.css'/>" >
 <link rel="stylesheet" href="<c:url value='/resources/css/*'/>" >
 <script src="<c:url value ='/resources/js/bootstrap.js' />" ></script>
<title>Insert title here</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<br>

<div class="jbMenu">
<nav class="navbar navbar-default">
<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed"
			data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
			aria-expended="false">
			<span class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="${pageContext.request.contextPath}/">Winbit</a>
	</div>
	
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
		<li><a href="${pageContext.request.contextPath}/">홈</a></li>

		<li><a href="${pageContext.request.contextPath}/board/listPage?startBBS=1&perPage=10">게시판</a></li>
		
		</ul>
		
		
		
</div>

</nav>
</div>
		
</body>
</html>