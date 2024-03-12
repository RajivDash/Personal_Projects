package Com.RegistrationAap_Miniproject.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.RegistrationAap_Miniproject.Model.DAOService;
import Com.RegistrationAap_Miniproject.Model.DAOServiceImpl;


@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	
	request.setAttribute("email", email);
	request.setAttribute("phone", phone);
	
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Update_Registration.jsp");
	rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession(false);
		if(session.getAttribute("email") != null) {
		session.setMaxInactiveInterval(10);
		
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		
		service.updateRegistration(email,phone);
		
		ResultSet result = service.getAllList();
		
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/ListofRegistrations.jsp");
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
