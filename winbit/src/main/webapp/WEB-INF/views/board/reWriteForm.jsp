<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../include/menubar.jsp"%>

게시판 답글 글작성 페이지
<div class="contaniner" style="width: 800px;" >
<form action="${pageContext.request.contextPath }/board/bbsReWrite" method="post" >
<input type="text" placeholder="제목" name = "title" class="form-control"> <br>
<input type="text" placeholder="작성자" name = "writer" class="form-control"> <br>
<textarea rows="10" cols="15" placeholder="내용" name="content" class="form-control" ></textarea>

<c:set var ="ctt2" value="${content2}"/>
<input type="hidden" name = "gNum" value="${ctt2.gNum}">
<input type="hidden" name = "lNum" value="${ctt2.lNum+1}">
<input type="hidden" name = "indent" value="${ctt2.indent+1}">
<input type="submit" value="등록" class ="btn btn-primary"> <br>
</form>
</div>
</body>
</html>