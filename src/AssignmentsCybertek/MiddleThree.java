package AssignmentsCybertek;

import java.util.Scanner;

public class MiddleThree {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
	    String word = scan.next();
	    //YOUR CODE HERE
	    
	 
	    if (word.length() % 2 == 1 && word.length() >= 5 ) {
	  
	    int half1 = word.length() / 2 -1 ;
	    int half2 = word.length() / 2  ;
	    int half3 = word.length() / 2 +1 ;
	    char sub = word.charAt(half1);
	    char sub1 = word.charAt(half2);
	    char sub2 = word.charAt(half3);

	 
   System.out.println(sub + "" + sub1 + "" + sub2);
	    
	
		
	
	    } else {
	    	System.out.println("invalid");
	    }
	}
		

}
