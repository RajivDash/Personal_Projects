package Com.RegistrationAap_Miniproject.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.RegistrationAap_Miniproject.Model.DAOService;
import Com.RegistrationAap_Miniproject.Model.DAOServiceImpl;



@WebServlet("/save")
public class NewRegistrationController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public NewRegistrationController() {
		super();
	}

	
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/New_Registration.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email") != null) {
		session.setMaxInactiveInterval(10);
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String emailid = request.getParameter("emailid");
		String phone = request.getParameter("phone");
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		
		service.saveRegistrations(name, city, emailid, phone);
		
		
		request.setAttribute("msg", "Your Record Has been Saved!!!");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/New_Registration.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
			
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
	}
}
