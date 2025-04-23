public class UserRegistrationForm {
	 public boolean checkAge(int age) {
	        // Define the minimum age criterion (e.g., 18 years)
	        int minimumAge = 18;

	        // Check if the age is greater than or equal to the minimum age criterion
	        if (age >= minimumAge) {
	            // Age meets the criterion
	            System.out.println("Age meets the minimum requirement.");
	            return true;
	        } else {
	            // Age does not meet the criterion
	            System.out.println("Age does not meet the minimum requirement.");
	            return false;
	        }
	    }
}
