<%@page import="java.sql.Timestamp"%>
<%@page import="web.page.DTO.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../include/menubar.jsp"%>
게시판
<div align="center">
<table border="1" class ="table table-striped" style="text-align: center; border: 1px solid #dddddd">
<tr><td>게시번호</td><td>제목</td><td>작성자</td><td>등록일자</td></tr>
<c:forEach items="${list}" var="a" begin="0" end="${ list.size()}" step="1">
<tr>
<td style="background-color: #eeeeee; text-align: center; width: 100px;">${a.bbsID}</td>
<td style="background-color: #eeeeee;">

<c:if test="${a.indent != 0 }">
<c:forEach  begin="0" end="${a.indent}" step="1">&nbsp;&nbsp;&nbsp;</c:forEach>
re:</c:if>
<a href = "${pageContext.request.contextPath}/board/bbsContent?bbsID=${a.bbsID}">${a.title}</a></td>
<td style="background-color: #eeeeee; text-align: center; width: 300px;">${a.writer }</td>
<td style="background-color: #eeeeee; text-align: center; width: 500px;">${a.wtime}</td>
</tr>
   
</c:forEach>
</table>
</div>

<input class="btn btn-primary pull-right" type="button" value="게시판 글쓰기" onclick="location.href ='${pageContext.request.contextPath}/board/bbsWriteForm'" >

<div align="center">
<c:set var = "page" value="${page}"/>
<c:set var = "tPage" value="${tPage}"/>

<c:if test="${page !=1 }">
<a href="${pageContext.request.contextPath}/board/listPage?startBBS=${page-1}&perPage=10" class="btn btn-primary"> << </a>
</c:if>
<c:forEach begin="1" end="${Math.ceil(tPage/10)}" step="1" var="p">
<c:if test="${page != p}"> <a href="${pageContext.request.contextPath}/board/listPage?startBBS=${p}&perPage=10" class="btn btn-primary"> ${p} </a> </c:if>
<c:if test="${page == p}"> <a href="${pageContext.request.contextPath}/board/listPage?startBBS=${p}&perPage=10" class="btn btn-primary active"> [${p}] </a> </c:if>



</c:forEach>
<a href="${pageContext.request.contextPath}/board/listPage?startBBS=${page+1}&perPage=10" class="btn btn-primary"> >> </a>
</div>
</body>
</html>