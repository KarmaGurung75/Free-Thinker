package login_registration;

import static org.junit.jupiter.api.Assertions.assertNotNull;


// Login Testing class
public class login_test {
	String user_name ="karma123";
	String pass= "karmagrg";
	
	public boolean userLogin(String username, String password) {
		boolean result = false;
		
		if(username == user_name && password == pass) {
			result = true;			
		}
		
		
		return result;
	}

}
