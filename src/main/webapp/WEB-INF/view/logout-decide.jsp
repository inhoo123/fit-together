<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:choose>
	<c:when test="${empty title}">
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
	<div class="container">
		<div class="wrap-sm text-center my-5 p-5">
			<a href="${pageContext.servletContext.contextPath }/index"> <img
				src="${pageContext.servletContext.contextPath }/image/main.png"
				width="64" /></br>

			</a>
		</div>
		<div class="wrap-x-sm">
			<h2 class="text-center">핏투게더 즐기기</h2>
			<form class="border-rounded  p-5"
				action="${pageContext.servletContext.contextPath }/logout"
				method="post">

				<div class="my-5">
					<button type="submit" class="w-100 fs-3 p-2 border-rounded">logout</button>
					<span>${sessionScope.authUser.id }로그인중</span>
				</div>
			</form>
		</div>
	</div>

</body>
</html>