package murach.email;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) action = "join";

        String url = "/index.jsp";

        if ("join".equals(action)) {
            // KHÔNG set currentYear ở trang đầu → đúng yêu cầu bước 8
            url = "/index.jsp";

        } else if ("add".equals(action)) {
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            // giả sử bạn có lớp User
            murach.business.User user = new murach.business.User(firstName, lastName, email);
            request.setAttribute("user", user);

            // *** PHẦN THEO ĐỀ: tính năm & đặt vào request ***
            GregorianCalendar currentDate = new GregorianCalendar();
            int currentYear = currentDate.get(Calendar.YEAR);
            request.setAttribute("currentYear", currentYear);

            url = "/thanks.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
}
