package AssignmentsCybertek;

import java.util.Scanner;

public class WithoutX_x {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
	  
		String word = scan.next();
	    
	    String firstX = word.substring(0, 1);
	    String lastX = word.substring(word.length() - 1);
	

	    if (firstX.contains("x")) {
	    	firstX.equalsIgnoreCase(lastX);
	    	System.out.println(word.substring(1, word.length()));
	} else if (lastX.contains("x")) {
		System.out.println(word.substring(0, word.length() - 1));
	}else if (firstX.contains("x") &&  lastX.contains("x")) {
		System.out.println(word.substring(1, word.length() - 1));
		
	} else {
		System.out.println(word);
	}

}
}

