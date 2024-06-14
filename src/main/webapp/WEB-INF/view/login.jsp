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
		<title>${title } :: 핏투게더</title>
	</c:otherwise>
</c:choose>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath }/css/style.css?<%=System.currentTimeMillis() %>" />
</head>
<body>
	<div class="container">
		<div class="wrap-sm text-center my-5 p-5">
			<a href="${pageContext.servletContext.contextPath }/index">
				<img src="${pageContext.servletContext.contextPath }/image/main.png" width="64"/>
			</a>
		</div>
		<div class="wrap-x-sm">
			<h2 class="text-center">핏투게더 즐기기</h2>
			<form class="border-rounded  p-5" action="${pageContext.servletContext.contextPath }/login-handle"
			method="post">
				<div>
					<label class="fs-3">계정아이디<span class="warning">(*)</span></label>
					<div class="my-1">
						<input type="text" placeholder="아이디.." name="id"class="w-100 p-1 fs-4 border-rounded" />
					</div>
				</div>
				<div>
					<label class="fs-3">계정 비밀번호<span class="warning">(*)</span></label>
					<div class="my-1">
						<input type="password" placeholder="비밀번호.." name="password" class="w-100 p-1 fs-4 border-rounded" />
					</div>
				</div>
				<div class="my-5">
					<button type="submit" class="w-100 fs-3 p-2 border-rounded">로그인</button>
				</div>
			</form>
			
			<div class="border-rounded  p-5 my-2">
				핏투게더에 처음이신가요? <a href="${pageContext.servletContext.contextPath }/signup" class="warning">계정을 만들어 보세요</a>
			
			</div>
			
		</div>
	</div>

</body>
</html>