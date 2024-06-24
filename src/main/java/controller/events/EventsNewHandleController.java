package controller.events;

import java.io.IOException;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.EventDao;
import model.dao.ParticipantDao;
import model.vo.Event;
import model.vo.Participant;
import model.vo.User;

@WebServlet("/events/new-handle")
public class EventsNewHandleController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			EventDao eventDao = new EventDao();

			User authUser = (User) request.getSession().getAttribute("authUser");

			String tag = request.getParameter("tag");
			String title = request.getParameter("title");
			int capacity = Integer.parseInt(request.getParameter("capacity"));
			String description = request.getParameter("description");
			Date openAt = Date.valueOf(request.getParameter("openAt"));
			int gymId = Integer.parseInt(request.getParameter("gymId"));

			Date registerAt = new Date(System.currentTimeMillis());
			String hostId = authUser.getId();
			int attendee = 1;
			int id = eventDao.generateKey();

			Event event = new Event(id, title, description, tag, gymId, hostId, openAt, capacity, attendee, registerAt);

			boolean r = eventDao.save(event);

			if (r) {
				Participant participant = new Participant();
				participant.setUserId(hostId);
				participant.setJoinAt(registerAt);
				participant.setEventId(id);

				ParticipantDao participantDao = new ParticipantDao();
				participantDao.save(participant);
			}

			// response.sendRedirect(request.getContextPath()+"/events/view?id=111111");
			// response.sendRedirect(request.getContextPath()+"/events/view?id="+id);
			// response.sendRedirect(request.getContextPath()+"/events/1111111");
			response.sendRedirect(request.getContextPath()+"/events/"+id);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
