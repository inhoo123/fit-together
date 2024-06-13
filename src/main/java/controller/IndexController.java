package controller;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class IndexController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 처리가 일어났다고 치고
		System.out.println("/index called");
		
		LocalDate today = LocalDate.now();
		request.setAttribute("today", today);
		request.setAttribute("visit", "환영합니다");
		
		
		
		// View 를 처리할 JSP 로 보내고 싶다면
		request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
		
	}
}
