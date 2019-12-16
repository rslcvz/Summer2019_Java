package AssignmentsCybertek;

import java.util.Scanner;

public class HasAJava {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = input.nextLine();

			if(word.substring(0,5).contains("java")) {
				System.out.println("true");
			}else {System.out.println("false");}
			
			
			char a =  word.charAt(0); 
				
			
					
	}
}







//		for (int i = 0; i < 2; i++) {
//			if (word.substring(i, i + 5).contains("java") && word.substring(1,2) ) {
//				System.out.println("true");
//				break;
//			} 
//		}

//		if (word.substring(0, 1).equals("j") && word.substring(1, 4).equals("ava")
//				|| word.substring(1, 2).equals("j") && word.substring(2, 5).equals("ava")) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}