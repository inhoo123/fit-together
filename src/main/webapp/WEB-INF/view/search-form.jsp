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
	<div class="conatiner text-center" style="margin-top : 100px">
		<h1 style="font-weight: bold">핏투게더</h1>
		<div>
			<form action="${pageContext.servletContext.contextPath }/write-handle" method="post">
				<input type="text" name="title" class="p-3 fs-3 w-50 border-rounded"  />
				
				<input type="text" name="body" class="p-3 fs-3 w-50 border-rounded"  />
				
				<select name="카테고리" class="p-3 fs-3 w-50 border-rounded">
    				<option value="운동">카테고리1</option>
    				<option value="자유계시판">카테고리2</option>
    				<option value="유머">카테고리3</option>
   					 <!-- 필요한 카테고리 옵션을 추가하세요 -->
					</select>

				
				
				<button type="submit">보내기</button>
			</form>
		</div>
		<div class="my-3">
			<img src="${pageContext.servletContext.contextPath }/image/search.png" 
				style="width: 70% ; border-radius: 5%"/>
		</div>
	</div>
</body>
</html>