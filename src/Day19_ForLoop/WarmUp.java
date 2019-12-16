package Day19_ForLoop;

import java.util.*;

public class WarmUp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
   System.out.println("Enter your user name");
   String user = input.nextLine().toLowerCase();
   
   System.out.println("Enter your password:");
   String pass = input.nextLine();
   
   String username = "cybertek.batch12@gmail.com";
   String password = "Javengers";
   
   if (user.endsWith("@gmail.com") || user.endsWith("@GMAIL.COM")) {
	   if(user.equalsIgnoreCase(username) && pass.equals(password)) {
		   System.out.println("Logged in successfully");
	   } else {
		   System.out.println("Invalid username or password");
	   }
   }else {
	   System.out.println("Its not a valid e mail address");
	   
	}
	}
}
