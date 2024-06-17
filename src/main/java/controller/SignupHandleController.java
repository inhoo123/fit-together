package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dao.UserDao;
import model.vo.User;

@WebServlet("/signup-handle")
public class SignupHandleController extends HttpServlet {

	@Override

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		int birth = Integer.parseInt(request.getParameter("birth"));
		String email = request.getParameter("email");
		String interests = request.getParameter("interests");

		UserDao userDao = new UserDao();
		boolean result = false;

		User one = new User(id, password, name, gender, birth, email, String.join(",", interests));
		try {
			User exist = userDao.findById(id);
			if (exist == null) {
				result = userDao.save(one);
			}

			if (result) {
				// 여기에서 로그인 상태가 되게 코드를 작성
				request.getSession().setAttribute("authuser", one);
				response.sendRedirect(request.getContextPath() + "/index");

			} else {
				response.sendRedirect(request.getContextPath() + "/signup?error");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
