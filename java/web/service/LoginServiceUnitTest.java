package web.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class LoginServiceUnitTest {

	@Test
    public void testValidLogin() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "1990-01-01";

        boolean result = LoginService.login(username, password, dob);
        assertTrue(result);
    }
	
	// Test case for invalid username
    @Test
    public void testInvalidUsername() {
        String username = "invalid";
        String password = "ahsan_pass";
        String dob = "1990-01-01";

        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }

    // Test case for invalid password
    @Test
    public void testInvalidPassword() {
        String username = "ahsan";
        String password = "wrongpassword";
        String dob = "1990-01-01";

        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    @Test
    public void testInvalidDateOfBirth() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "1990-01-00";

        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    
    @Test
    public void testNullDateOfBirth() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = null;
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    @Test
    public void testNullUsername() {
        String username = null;
        String password = "ahsan_pass";
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    

    // Test case for empty username
    @Test
    public void testEmptyUsername() {
        String username = "";
        String password = "ahsan_pass";
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    

    // Test case for empty password
    @Test
    public void testEmptyPassword() {
        String username = "ahsan";
        String password = "";
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    // Test case for empty dob
    @Test
    public void testEmptyDateofBirth() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    } 
    @Test
    public void testNullPassword() {
        String username = "ahsan";
        String password = null;
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    // New
    @Test
    public void testValidLogin1() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "1990-01-01";

        boolean result = LoginService.login(username, password, dob);
        assertTrue(result);
    }
	
	// Test case for invalid username
    @Test
    public void testInvalidUsername2() {
        String username = "invalid";
        String password = "ahsan_pass";
        String dob = "1990-01-01";

        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }

    // Test case for invalid password
    @Test
    public void testInvalidPassword3() {
        String username = "ahsan";
        String password = "wrongpassword";
        String dob = "1990-01-01";

        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    @Test
    public void testInvalidDateOfBirth3() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "1990-01-00";

        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    
    @Test
    public void testNullDateOfBirth3() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = null;
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    @Test
    public void testNullUsername4() {
        String username = null;
        String password = "ahsan_pass";
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    

    // Test case for empty username
    @Test
    public void testEmptyUsernam5() {
        String username = "";
        String password = "ahsan_pass";
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    

    // Test case for empty password
    @Test
    public void testEmptyPasswor6() {
        String username = "ahsan";
        String password = "";
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    // Test case for empty dob
    @Test
    public void testEmptyDateofBirth7() {
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    } 
    @Test
    public void testNullPassword8() {
        String username = "ahsan";
        String password = null;
        String dob = "1990-01-01";
        boolean result = LoginService.login(username, password, dob);
        assertFalse(result);
    }
    

    

    
}
