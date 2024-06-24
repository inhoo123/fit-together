package controller.feeds;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.FeedDao;
import model.dao.GymDao;

@WebServlet("/feeds")
public class FeedListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			FeedDao feedDao = new FeedDao();
			feedDao.findAll();
			req.setAttribute("feeds", feedDao.findAll());
			req.getRequestDispatcher("/WEB-INF/view/feeds/list.jsp").forward(req, resp);

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


