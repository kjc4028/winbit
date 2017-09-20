<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>



<%@include file="../include/menubar.jsp"%>
<c:set var="ctt" value="${content }"/>

게시글 내용 보기 페이지
<div align="center">
<br>
<table border="1" class ="table table-striped" style="text-align: center; border: 1px solid #dddddd">
<tr><td style="background-color: #eeeeee; text-align: center;">제목</td><td>${ctt.title}</td></tr>
<tr><td style="background-color: #eeeeee; text-align: center;">작성자</td><td>${ctt.writer }</td></tr>
<tr><td style="background-color: #eeeeee; text-align: center;">작성일자</td><td>${ctt.wtime }</td></tr>
<tr><td style="background-color: #eeeeee; text-align: center;">내용</td><td>${ctt.content }</td></tr>
</table>
<form name ="form1" action="${pageContext.request.contextPath}/board/reWriteForm" method="post">
<input type="hidden" name = "title" value="${ctt.title}">
<input type="hidden" name = "content" value="${ctt.content }">
<input type="hidden" name = "gNum" value="${ctt.gNum}">
<input type="hidden" name = "lNum" value="${ctt.lNum}">
<input type="hidden" name = "indent" value="${ctt.indent}">

</form>
<button id = "reWrite">답글</button><button id = "modify">수정</button><button id = "del">삭제</button>
</div>

<script>
$(document).ready(function(){
	var bbsID = ${ctt.bbsID};
	$("#reWrite").click(function(){
		document.form1.submit();

		});
	$("#del").click(function(){
	location.href="${pageContext.request.contextPath}/board/delete?bbsID="+bbsID;

	});
	
	$("#modify").click(function(){
		location.href="${pageContext.request.contextPath}/board/modifyForm?bbsID="+bbsID;

		});
});

</script>
</body>
</html>