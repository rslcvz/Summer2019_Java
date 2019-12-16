package AssignmentCybertek03;

import java.util.*;

public class SplitEmail {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		
		int count = 0;

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				count++;
			}

		}

		if (count > 1 || !(email.contains("@"))) {
			System.out.println("Invalid email");
		} else {

			String[] arr = email.split("@");
			String domain = arr[1];
			String emailId = arr[0];

			System.out.println("Email id: " + emailId + "\n" + "Email domain: " + domain);
		}
	}
}
