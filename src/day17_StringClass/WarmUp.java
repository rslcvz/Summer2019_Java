package day17_StringClass;

import java.util.Scanner;

public class WarmUp {

		public static void main(String[] args) {
			
			/* Scanner input = new Scanner(System.in);
			
			System.out.println("Enter first and last name:");
			
			String name = input.nextLine();
			String lastName = input.nextLine();
		
			String fullName = name.concat(" " + lastName);
			int num = fullName.length();
			
			System.out.println("Your full name:" + fullName);
			System.out.println(fullName.charAt(fullName.length() - 1));   */
			
			    Scanner scan = new Scanner(System.in);
			   
			System.out.println("Enter Item1 and its price:"); 
			String item1 = scan.next();
			double price1 = scan.nextDouble();

			System.out.println("Enter Item2 and its price:");
			String item2 = scan.next();
			double price2 = scan.nextDouble();

			System.out.println("Enter Item3 and its price:");
			String item3 = scan.next();
			double price3 = scan.nextDouble();

			String report = (item1 + " " + price1 + " " + item2);
			System.out.println(report);
			
	}

}
