package AssignmentsCybertek;

import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = input.next();

	if (word.length() < 2 ) {
		System.out.println( word  + word  + word);
	} else if (word.length() %2 == 1) {
         int mid = word.length() / 2;	
         char mid2 = word.charAt(mid);
	System.out.println(mid2);
		
		} else if (word.length() == 2) {
	System.out.println(word + word );
} else if (word.length() %2 == 0) {
	System.out.println((word.charAt(word.length() / 2 - 1)) + "" +((word.charAt(word.length() / 2 ))  ));
	

}
}
}