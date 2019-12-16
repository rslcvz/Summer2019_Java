package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoop02 {

	public static void main(String[] args) {

		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Multiplication is: " + (a * b));
		System.out.println("Do you want to continue?: ");
		scan.nextLine();                     /// tampon-------------because nextLine is giving one more enter space
		String answer = scan.nextLine();
		while (( answer.equals("yes")  ||  answer.equals("no"))) {
		
			System.out.println("Please make up your mind");
			System.out.println("Do you want to continue?:");
			answer = scan.nextLine();
			
		}
			
		if (answer.equals("no")) {
			break;
		}
		
		
	}
		/*
		 * 
		 Create calculator program
		 Write a program that asks user if they want to *, / %, / , + , -
		 then ask user to enter two number
		 then return the result to the console
		 asd then asks the user if they wanna continiue , if yes
		 repeat previous
		 if no exit the system
		 otherwise ==> ask the user to re enter
		 */
}
}