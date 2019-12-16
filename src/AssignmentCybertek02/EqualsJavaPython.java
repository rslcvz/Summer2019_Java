package AssignmentCybertek02;

import java.util.Scanner;

public class EqualsJavaPython {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int countJava =0;
	    int countPython = 0;
	    for (int i=0; i < sentence.length() - 3; i++ ) {
	      if (sentence.substring(i, i+4).equals("java")) {
	    	  countJava++;
	    	  System.out.println();
	      }
	    for(int j=0; j < sentence.length() -5; j++) {
	       if	(sentence.substring(i, i+6).equals("python")) {
	    	countPython++;
	    	if (countJava == countPython) {
	    		System.out.println(true);
	    		break;
	    	}else {
	    	  System.out.println(false);
	    	  break;
	    	
	    	
	      }
	    
	       
	    	
	    } 
	    	
	    }
	    
	       
	         
	    }
	    	
	    
	
} 

	}


	    
	  
	
	
	


