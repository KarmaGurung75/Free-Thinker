package login_registration;

public class test_register {
	String first_name = "";
	String Last_name= "";
	String user_name ="";
	String pass= "karmagrg";
    String Sector="";	
	public boolean userRegister(String Fname,String Lname,String username, String password,String Sector) {
		boolean result = false;
		
		if(Fname == first_name || Lname== Last_name || username == user_name || password == pass || Sector == Sector ) {
			result = true;			
		}
		
		
		return result;
	}
	

}
