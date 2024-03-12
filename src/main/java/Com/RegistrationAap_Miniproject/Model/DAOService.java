package Com.RegistrationAap_Miniproject.Model;

import java.sql.ResultSet;

// Here DAO- means DATA ACCESS OBJECT

//Credential- a qualification, achievement, quality, or aspect of a person's background



public interface DAOService {
	public boolean verifyCredentials(String email,String password);
	
	public void saveRegistrations(String name,String city,String emailid,String phone );
	
	public void connectDB();

	public ResultSet getAllList();

	public void deleteByemailId(String email);

	public void updateRegistration(String email,String phone);

}






