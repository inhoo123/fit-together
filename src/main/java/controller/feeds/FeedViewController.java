package controller.feeds;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.FeedDao;
import model.dao.GymDao;
import model.vo.Feed;

@WebServlet("/feeds/view/*")
public class FeedViewController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String uri = request.getRequestURI();
		
			int id = Integer.parseInt(uri.substring(uri.lastIndexOf("/") + 1));
			
			FeedDao feedDao = new FeedDao();
			Feed feed = feedDao.findByNo(id);
			request.setAttribute("feed", feed);
			
			request.getRequestDispatcher("/WEB-INF/view/feeds/view.jsp").forward(request, response);
				
		} catch (Exception e) {
			request.getRequestDispatcher("/WEB-INF/view/events/error.jsp").forward(request, response);
		}
	}
}