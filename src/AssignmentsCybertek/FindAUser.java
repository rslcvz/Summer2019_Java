package AssignmentsCybertek;

import java.util.Scanner;

public class FindAUser {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter full name:");
		
		String user1 = input.nextLine();
		
		String name1 = "Max Payne";
		String name2 = "Alan Wake";
		
		if (user1.equalsIgnoreCase(name1) || user1.equalsIgnoreCase(name2)) {
			System.out.println("User found!");
		
	} else {
		System.out.println("User not found!");
	}

}
}
