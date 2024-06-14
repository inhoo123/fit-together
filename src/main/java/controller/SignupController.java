package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.UserDao;

@WebServlet("/signup")
public class SignupController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	UserDao userDao= new UserDao();	
		
		request.getRequestDispatcher("/WEB-INF/view/signup.jsp").forward(request, response);
	}
}
