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
	<div class="container px-1">
		<div class="my-3">로그온 메뉴바 들어갈 자리</div>
		<div class="border-rounded p-2 text-center">
			<p class="fs-3">
				<span class="warning"><c:set var="contextPath"></c:set>${user.id }</span> 의
				체육행사 <small>✍ ${event.openAt }</small>
			</p>
			<h1>
				<span class="warning">[${event.tag }]</span> ${event.title }
			</h1>
			<p class="fs-3">${event.description }</p>
			<p class="fs-3">
				<span>📆 ${event.registerAt }</span> <span>🚩 염주 테니스장 (서구)</span> <span>😊
					${event.attendee} / ${event.capacity }</span>
			</p>
		</div>
		<div class="my-2 text-right">
			<a href="${pageContext.servletContext.contextPath }/events/join/${ev.id}">
			<button class="p-2 fs-4 border-rounded">참가신청</button>
			</a>
		</div>
		<h3 class="my-2">참가자들(1)</h3>
		<div>
			<c:forEach var="i" items="${participants}">
				<li style="list-style: none">${i}</li>
			</c:forEach>
		</div>




	</div>

</body>
</html>