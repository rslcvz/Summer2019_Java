package AssignmentsCybertek;

import java.util.Scanner;

public class MergeThem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    
	    if (word1.length() == word2.length() && word2.length() ==  3) {
	    	
	    	char x = word1.charAt(0);
	    	char y = word1.charAt(1);
	    	char z = word1.charAt(2);
	    	
	    	char a = word2.charAt(0);
	    	char b = word2.charAt(1);
	    	char c = word2.charAt(2);
	    	
	    	System.out.println(x + "" + a + "" + y + "" + b + "" + z + "" + c);
	} else {
		System.out.println("cannot merge");
	}

}
}
