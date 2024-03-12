package Com.RegistrationAap_Miniproject.Model;

import java.sql.*;

public class DAOServiceImpl implements DAOService {
	
	private Connection con;
	private Statement st;
	
	
	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			ResultSet result = st.executeQuery("select * from loginpageproject where email = '"+email+"' and password = '"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void saveRegistrations(String name, String city, String emailid, String phone) {
		try {
			st.executeUpdate("insert into registrationpage values('"+name+"','"+city+"','"+emailid+"','"+phone+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpageproject","root","dash");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResultSet getAllList() {
		try {
			ResultSet result = st.executeQuery("select * from registrationpage");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteByemailId(String email) {
		try {
			st.executeUpdate("delete from registrationpage where email = '"+email+"'");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateRegistration(String email,String phone) {
		try {
			st.executeUpdate("update registrationpage set phone = '"+phone+"'where email = '"+email+"'");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	

}
