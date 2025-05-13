package Bai6;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OnlineTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Long startTime = (Long) session.getAttribute("startTime");
        if (startTime == null) {
            startTime = System.currentTimeMillis();
            session.setAttribute("startTime", startTime);
        }

        long currentTime = System.currentTimeMillis();
        long onlineTime = (currentTime - startTime) / 1000; // Giây

        session.setAttribute("onlineTime", onlineTime);
        request.getRequestDispatcher("online.jsp").forward(request, response);
    }
}
