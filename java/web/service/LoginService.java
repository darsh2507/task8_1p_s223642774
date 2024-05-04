package web.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {
		// Match a fixed user name and password.
		//
		
		 // Check if any parameter is null or empty
        if (username == null || username.trim().isEmpty() ||
            password == null || password.trim().isEmpty() ||
            dob == null || dob.trim().isEmpty()) {
            return false;
        }

        // Check if the date of birth is valid
        LocalDate dateOfBirth;
        try {
            dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            return false; // Invalid date format
        }
        
		if ("ahsan".equals(username) && "ahsan_pass".equals(password)) {
			return true;
		}
		return false;
	}
	
	
	
}
