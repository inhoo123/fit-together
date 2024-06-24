<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:choose>
	<c:when test="${empty title }">
		<title>핏투게더</title>
	</c:when>
	<c:otherwise>
		<title>${title }::핏투게더</title>
	</c:otherwise>
</c:choose>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath }/css/style.css?<%=System.currentTimeMillis() %>" />
</head>
<body>
	<%@ include file="/WEB-INF/view/common/navbar.jsp"%>
	<div class="container px-1">
		<div>
			<h2 class="text-center">글 목록</h2>
		</div>
		<table style="width: 800px; margin: auto; border-collapse: collapse;">
			<c:forEach items="${feeds }" var="one">
				<tr style="border-bottom: 1px solid #ddd; height: 30px;">
					<td><a href="${pageContext.servletContext.contextPath }/feeds/view/${one.no}">제목:[${one.title }] </br> 분류:${one.category }</a></td>
				</tr>
			</c:forEach>
		</table>


	</div>
</body>
</html>














