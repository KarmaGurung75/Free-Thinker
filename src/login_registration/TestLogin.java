package login_registration;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

// Login test
class TestLogin {

	@Test
	// login test pass
	void test() {
		String username ="karma123";
		String pass = "karmagrg";
		
		login_test l = new login_test();
		boolean result = l.userLogin(username, pass);
		
		assertEquals(true,result);

	}
	

	@Test
	// login test fail
	void test1() {
		String username ="karma123";
		String pass = "sonam";
		
		login_test l = new login_test();
		boolean result = l.userLogin(username, pass);
		
		assertEquals(true,result);

	}

}
