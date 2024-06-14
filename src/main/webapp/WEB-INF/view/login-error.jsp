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
				<div>
				<img  src="data:image/jpeg;base64,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">
				</div>
			
			<form class="border-rounded  p-5" action="${pageContext.servletContext.contextPath }/login"
			method="post">
				<div>
					<label class="fs-3">계정아이디<span class="warning">(*)</span></label>
					<div class="my-1">
						<input type="text" placeholder="아이디.." class="w-100 p-1 fs-4 border-rounded" value="${pram.value}"/>
					</div>
				</div>
				<div>
					<label class="fs-3">계정 비밀번호<span class="warning">(*)</span></label>
					<div class="my-1">
						<input type="password" placeholder="비밀번호.." class="w-100 p-1 fs-4 border-rounded" />
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