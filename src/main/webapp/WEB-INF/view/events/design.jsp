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
			로그온 메뉴바 들어갈 자리
		</div>
		<h2>새 행사 등록</h2>
		<p>
			등록할 행사에 필요한 체육시설 종류를 선택하세요.
		</p>
		<form action="${pageContext.servletContext.contextPath }/events/new">
			<select name="type">
				<c:forEach var="one" items="${types}">
				<option>${one }</option>
				</c:forEach>
			</select>
			<button>선택</button>
		</form>	
	</div>
</body>
</html>