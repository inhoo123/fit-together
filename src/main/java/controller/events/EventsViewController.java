package controller.events;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.EventDao;
import model.dao.GymDao;
import model.dao.ParticipantDao;
import model.dao.UserDao;
import model.vo.Event;
import model.vo.Gym;
import model.vo.Participant;
import model.vo.User;

@WebServlet("/events/*")
public class EventsViewController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// System.out.println("/events/*");
//			 int id = Integer.parseInt(request.getParameter("id"));
			String uri = request.getRequestURI();
			// System.out.println(uri);
			int id = Integer.parseInt(uri.substring(uri.lastIndexOf("/") + 1));

			// System.out.println(id);
			EventDao eventDao = new EventDao();
			Event event = eventDao.findById(id);
			request.setAttribute("event", event);

//			UserDao userDao = new UserDao();
//			User user = userDao.findById(id);
//			request.setAttribute("user", user);
			
			GymDao gymDao = new GymDao();
			Gym gym = gymDao.findById(event.getGymId());
			request.setAttribute("gym", gym);
			
			User authUser = (User) request.getSession().getAttribute("authUser");
			
			ParticipantDao participantDao = new ParticipantDao();
			List<Participant> participants = participantDao.findByEventId(id);
			request.setAttribute("participants", participants);
			List<String> userIds = new ArrayList<>();
			for (Participant one : participants) {
				userIds.add(one.getUserId());
			}
			if(authUser != null && userIds.contains(authUser.getId())) {
				request.setAttribute("flag", true);
			}else {
				request.setAttribute("flag", false);
			}
			
			
			request.getRequestDispatcher("/WEB-INF/view/events/view.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("/WEB-INF/view/events/error.jsp").forward(request, response);
		}

	}

}
