package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("authUser") == null) {
			response.sendRedirect(request.getContextPath() + "/index");
			return;
		}
		request.getRequestDispatcher("/WEB-INF/view/logout-decide.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		request.getSession().setAttribute("authUser", null);
		request.getSession().removeAttribute("authUser");
//	request.getSession().invalidate();

		response.sendRedirect(request.getContextPath() + "/index");
	}
}
