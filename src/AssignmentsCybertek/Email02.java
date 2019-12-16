package AssignmentsCybertek;

import java.util.Scanner;

public class Email02 {

	public static void main(String[] args) {

		/*
		 * Example: Input: craig_federighi@apple.com Output: First name: Craig Last
		 * name: Federighi Domain: apple Top-Level Domain: com
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = scan.next();
		
		String firstName = (email.substring(0, email.indexOf("_")));
		firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		
		String lastName = email.substring(email.indexOf("_") +1 , email.indexOf("@"));
		lastName.substring(0, 1).toUpperCase();
		String domain = email.substring(email.indexOf("@") + 1, email.length() - 4);
		String topLevelDomain = email.substring(email.length() - 3);
		
		int idxof_ = email.indexOf("_");
		email = email.substring(0, 1).toUpperCase() + email.substring(1, idxof_ + 1)
				+ email.substring(idxof_+1, idxof_+2).toUpperCase() + email.substring(idxof_+2);

		System.out.println("Input: " + email + "\rFirst name: " + firstName + "\rLast name: " + lastName
				+ "\rDomain: " + domain + "\rTop-Level Domain: " + topLevelDomain);

	}

}
