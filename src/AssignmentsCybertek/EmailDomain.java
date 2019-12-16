package AssignmentsCybertek;

import java.util.Scanner;

public class EmailDomain {

	public static void main(String[] args) {

		email("feyyaz_cimen@gmail.com");

	}
	
	
	public static String email(String email) {
		Scanner scan = new Scanner(System.in);
	     email = scan.next();
	    
		
			
			String firstName = (email.substring(0, email.indexOf("_")));
			firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1,firstName.length());
			
			String lastName = email.substring(email.indexOf("_") +1 , email.indexOf("@"));
			lastName = lastName.substring(0, 1).toUpperCase() +lastName.substring(1,lastName.length()); ;
			String domain = email.substring(email.indexOf("@") + 1, email.length()-4);
			String topLevelDomain = email.substring(email.length()-3);
			
			/*int idxof_ = email.indexOf("_");
			email = email.substring(0, 1).toUpperCase() + email.substring(1, idxof_ + 1)
					+ email.substring(idxof_+1, idxof_+2).toUpperCase() + email.substring(idxof_+2);*/

			System.out.println("First name: " + firstName + "\rLast name: " + lastName
					+ "\rDomain: " + domain + "\rTop-Level Domain: " + topLevelDomain);

		
		return email;
	}

}
