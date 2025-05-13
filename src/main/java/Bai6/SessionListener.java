package Bai6;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    private static int activeSessions = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        activeSessions++;
        se.getSession().getServletContext().setAttribute("activeSessions", activeSessions);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        activeSessions--;
        se.getSession().getServletContext().setAttribute("activeSessions", activeSessions);
    }
}
