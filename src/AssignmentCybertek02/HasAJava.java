package AssignmentCybertek02;

import java.util.Scanner;

public class HasAJava {

	public static void main(String[] args) {

		//boolean exists = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.next();

		
		
		for (int i = 0; i < 2; i++) {
			if ((word.substring(i, i + 4).equalsIgnoreCase("java")) 
					&& ((word.substring(word.length()-4).equalsIgnoreCase("java")))) { 
				
				System.out.println(true);
				break;
				
			} else {
				System.out.println(false);
				break;
			}

		}
	}
}
