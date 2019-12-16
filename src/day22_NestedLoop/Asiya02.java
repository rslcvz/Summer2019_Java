package day22_NestedLoop;

import java.util.Scanner;

public class Asiya02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String mail = input.nextLine();
		/* System.out.println("Email id: " + mail.substring(0, mail.indexOf("@")) + " " 
		+ "\rdomain is: " + mail.substring(mail.indexOf("@") +1));  */
		
		System.out.println(mail.replace("a", "b"));
		
	}

}
