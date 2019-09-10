package day15_ScannerStringClass;
import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		System.out.println(" Enter your last name");
		
		String lastName = input.next();
		System.out.print(firstName+ " ");
		System.out.print(lastName);
		
		String name = "Donald J Trump";
		System.out.println(name.length());
	}
}
