package controller.feeds;

import java.io.IOException;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.FeedDao;
import model.vo.Feed;
import model.vo.User;

@WebServlet("/write-handle")
public class WriteHandleController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User authUser = (User) request.getSession().getAttribute("authUser");
		if(authUser == null) {
			response.sendRedirect(request.getContextPath() + "/login?url=/events/design");
			return;
			
		}
		try {
			String writerId = authUser.getId();
			String title = request.getParameter("title");
			String body = request.getParameter("body");
			String category = request.getParameter("category");

			FeedDao feedDao = new FeedDao();
			Feed one = new Feed(0, writerId, title, body, category, new Date(System.currentTimeMillis()));
			boolean r = feedDao.save(one);
			
			if(r) {
				request.getRequestDispatcher("/WEB-INF/view/feeds/list.jsp").forward(request, response);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
