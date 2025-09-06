package murach.survey;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String firstName   = request.getParameter("firstName");
        String lastName    = request.getParameter("lastName");
        String email       = request.getParameter("email");
        String dob         = request.getParameter("dob");
        String hearAbout   = request.getParameter("hearAbout");
        String updatesParam = request.getParameter("updates");
        String emailParam   = request.getParameter("emailAnnouncements");
        String contact = request.getParameter("contact");
        
        String wantsUpdates = (updatesParam != null) ? "Yes" : "No";
        String emailAnnouncements = (emailParam != null) ? "Yes" : "No";
        
        // Tạo model
        Survey survey = new Survey(firstName, lastName, email, dob, hearAbout, wantsUpdates, emailAnnouncements, contact);

        // Gắn vào request để JSP đọc bằng getter
        request.setAttribute("survey", survey);

        // Chuyển hướng nội bộ (forward) sang thanks.jsp
        RequestDispatcher rd = request.getRequestDispatcher("/thanks.jsp");
        rd.forward(request, response);
    }
}
