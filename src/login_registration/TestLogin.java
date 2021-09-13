package login_registration;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

// Login test
class TestLogin {

	@Test
	void test() {
		String username ="karma123";
		String pass = "karmagrg";
		
		login_test l = new login_test();
		boolean result = l.userLogin(username, pass);
		
		assertEquals(true,result);

	}
}
