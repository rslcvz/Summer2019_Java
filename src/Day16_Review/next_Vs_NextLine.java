package Day16_Review;

import java.util.Scanner;

public class next_Vs_NextLine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		
		String f = input.next();
		
		System.out.println(" Enter the last name ");
		String L = input.next();
		
		System.out.println("Your first name: " + f);
		System.out.println("Your last name: " + L);
		
		
	}

}
