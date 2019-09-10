package Day16_Review ;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your phone number");
		
		int phoneNumber = input.nextInt();
		
         input.nextLine();	
         
		System.out.println("Enter your name: ");
		
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name");
		
		String lastName = input.nextLine();
		
		String concate = firstName + " " + lastName;
		
		System.out.println(concate);
	}
	
	}

