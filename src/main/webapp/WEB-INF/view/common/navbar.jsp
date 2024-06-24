<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="my-2 p-2 px-5"
	style="background-color: gray; margin-bottom: 30px;">
	<div style="display: flex; justify-content: space-between;">
		<!-- common -->
		<div style="display: flex; align-items: center; gap: 20px;">
			<a href="${pageContext.servletContext.contextPath }/index"> <img
				src="${pageContext.servletContext.contextPath }/image/main.png"
				style="border: 1px solid black; padding: 5px; width: 64px; background-color: white; border-radius: 32px;" />
			</a> <a href="${pageContext.servletContext.contextPath }/events"
				class="fs-3 badge-dark a" >행사목록 <small>..</small></a> <a
				href="${pageContext.servletContext.contextPath }/feeds"
				class="fs-3 badge-dark a">자유게시판 <small>..</small></a> <a
				href="${pageContext.servletContext.contextPath }/gyms"
				class="fs-3 badge-dark a">체육시설 <small>..</small></a>
		</div>
		<div style="display: flex; align-items: center; gap: 20px;">
			<div>
				<input type="text" class="fs-5 p-2 border-rounded"
					style="width: 300px;" />
			</div>
			<c:choose>
				<c:when test="${sessionScope.authUser == null }">
					<div>
						<a href="${pageContext.servletContext.contextPath }/login"
							class="fs-3 badge-dark">로그인 <small>..</small></a>
					</div>
				</c:when>
				<c:otherwise>
					<div>
						<a href="${pageContext.servletContext.contextPath }/login"
							class="fs-3 badge-dark">닉네임: ${sessionScope.authUser.name }
							(아이디:${sessionScope.authUser.id }) </a>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</div>

