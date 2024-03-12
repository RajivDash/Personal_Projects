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


@WebServlet("/VerifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		
		boolean status = service.verifyCredentials(email, password);
		if(status==true) {
			
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			session.setMaxInactiveInterval(10);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/New_Registration.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("Error", "invalid UserName/Password");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}	

}
