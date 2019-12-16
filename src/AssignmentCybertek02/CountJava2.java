package AssignmentCybertek02;

import java.util.Scanner;

public class CountJava2 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
	    String word = scan.next().toLowerCase();
	    int count = 0;
	    for (int i=0; i < word.length() -3; i++) {
	      if(word.substring(i, i+4).equals("java")) {
	        count++;
	        
	      }
	    }
	    System.out.println(count);
	    
	    
	  }
	
	

}
