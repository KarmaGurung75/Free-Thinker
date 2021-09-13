package login_registration;

public class register_test_class {
	
	private String firstName, lastName, userName,password;
	
	public register_test_class() {
		
	}
	
	
	public register_test_class(String firstName,String lastName,String userName,String password) {
		this.firstName =firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password =password;
		
	}
	
	public void setfirstName (String firstName) {
		 this.firstName = firstName;
	}
	public String getfirstName () {
		return this.firstName;
		
	}
	public void setlastName (String lastName) {
		this.lastName = lastName;
	}
	public String getlastName() {
		return this.lastName;
	}
	public void setuserName (String userName) {
		this.userName = userName;
	}
	public String getuserName () {
		return this.userName;
	}
	
	public void setpassword (String password) {
		this.password = password;
	}
	public String getpassword() {
		return this.password;
	}
	

	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		new register_test_class();

	}*/

}
