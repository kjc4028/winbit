<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
	<title>Home</title>

	
</head>
<body>
<%@include file="./include/menubar.jsp"%>

	<script src="<c:url value ='/resources/js/test.js' />" ></script> 
<div class="Container" align="center">
메인페이지 입니다.<br>
<input class="btn btn-primary pull" type="button" value="게시판" onclick="location.href ='${pageContext.request.contextPath}/board/listPage?startBBS=1&perPage=10'" >
<input class="btn btn-primary pull" type="button" value="게시판 글쓰기" onclick="location.href ='${pageContext.request.contextPath}/board/bbsWriteForm'" >
</div>
<div>

</div>
<div id="ttt"></div>
<button onclick="test()">test</button>
</body>
</html>
