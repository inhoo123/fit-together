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
	<div class="conatiner text-center" style="margin-top: 100px">
		<h1 style="font-weight: bold">게시글쓰기</h1>
		<div>
			<form
				action="${pageContext.servletContext.contextPath }/write-handle"
				method="post">
				<table style="border-collapse: collapse; width: 100%">
					<tr>
						<td
							style="border: 1px solid #ccc; padding: 12px; text-align: center; background-color: #eee"><span
							style="color: red">*</span>제목</td>
						<td style="border: 1px solid #ccc; padding: 12px;"><input
							name="title" type="text"
							style="padding: 6px 10px; width: 500px; border: 1px solid #ccc" /></td>
					</tr>
					<tr>
						<td style="border: 1px solid #ccc; padding: 12px;" colspan="2">
							<textarea name="body"
								style="height: 200px; resize: none; width: 100%; box-sizing: border-box; padding: 6px 10px; border: 1px solid #ccc"></textarea>
						</td>

					</tr>
					<tr>
						<td><select  name="category"
							class="p-3 fs-3 w-50 border-rounded">
								<option value="운동">운동</option>
								<option value="유머">유머</option>
								<option value="자유글">자유글</option>
								<!-- 필요한 카테고리 옵션을 추가하세요 -->
						</select></td>

					</tr>

				</table>
				<button type="submit">보내기</button>
			</form>
		</div>
		<div class="my-3">
			<img
				src="${pageContext.servletContext.contextPath }/image/search.png"
				style="width: 70%; border-radius: 5%" />
		</div>
	</div>
</body>
</html>