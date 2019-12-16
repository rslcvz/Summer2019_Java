package AssignmentsCybertek;

import java.util.Scanner;

public class MakeSandwich {

	public static void main(String[] args) {
      
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two word: ");
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		if (word1.length() % 2 == 1) {
			
			int firstHalf = (word1.length() / 2);
			String str = word1.substring(0, firstHalf);
			String str2 = word1.substring(firstHalf, word1.length());
		
			System.out.println(str + word2 + str2);
			
		}
	}
}

