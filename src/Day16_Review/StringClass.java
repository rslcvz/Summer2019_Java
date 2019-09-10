package Day16_Review;

import java.util.Scanner;

public class StringClass {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first and last name:");
		
		String name = input.next();
		String lastName = input.next();
		String fullName = name.concat(" " + lastName);
		System.out.println("Your full name:" + fullName);
		System.out.println(fullName.length());
		
		
	}

}
