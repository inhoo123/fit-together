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
		<title>${feed.title }::핏투게더</title>
	</c:otherwise>
</c:choose>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath }/css/style.css?<%=System.currentTimeMillis() %>" />
</head>
<body>
<%@ include file="/WEB-INF/view/common/navbar.jsp"%>
	<div>
		<p style="text-align: center;">작성일: ${feed.writedAt } 분류: ${feed.category }</p>
		<div class="container px-1">
			<b>내용</b>
			<td style="border: 1px solid #ccc; padding: 12px;" colspan="2"><p
					style="height: 200px; resize: none; width: 100%; box-sizing: border-box; padding: 6px 10px; border: 1px solid #ccc">
					${feed.body }</p></td>

		</div>
	</div>

</body>
</html>