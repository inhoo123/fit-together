package listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		se.getSession().setAttribute("role", "guest");
		
		ServletContext application  = se.getSession().getServletContext();
		int currentVisit = (int)application.getAttribute("visit");
		application.setAttribute("visit",currentVisit+1);
	}
}
