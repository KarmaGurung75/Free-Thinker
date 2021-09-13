package login_registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class register_Test extends register_test_class {

	@Test
	/*public void testConstructor() {
		register_test_class rtc = new register_test_class();
		assertNotNull(rtc);
	}
	*/
	public void testGetters() {
		register_test_class rtc = new register_test_class("karma","gurung","karma123","karmagrg");
		String expected = "karma";
		String actual = rtc.getuserName();
		
		assertEquals(expected,actual);
	}
	
	
}
