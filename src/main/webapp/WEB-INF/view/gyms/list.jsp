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
			<h2 class="text-center">사용가능한 체육시설</h2>
		</div>
		<table style="width: 800px; margin: auto; border-collapse: collapse;">
			<c:forEach items="${gyms }" var="one">
				<tr style="border-bottom: 1px solid #ddd; height: 30px;">
					<td>${one.name }</td>
					<td>${one.type }</td>
					<td>${one.location }</td>
					<td>${one.owner }</td>
					<td>${one.manager }</td>
				</tr>
			</c:forEach>
		</table>
		<!-- 페이지 링크 -->
		<div style="text-align: center; margin-top: 30px;">

			<c:forEach begin="1" end="${totalPages }" var="i">

				<c:choose>
					<c:when test="${i == currentPage }">
						<b style="color: red">${i }</b>
					</c:when>
					<c:otherwise>
						<a href="${pageContext.servletContext.contextPath }/gyms?${one.type }p=${i}">${i }</a>
					</c:otherwise>
				</c:choose>

			</c:forEach>
		</div>

	</div>
</body>
</html>














