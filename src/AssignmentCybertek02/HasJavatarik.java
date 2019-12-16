package AssignmentCybertek02;

import java.util.Scanner;

public class HasJavatarik {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();

		if(word.length()>=4) {
	           for(int i = 0 ; i<=word.length()-4 ;i++) {
	                if(i<2 && word.substring(i,i+4).equalsIgnoreCase("java")) {
	                    System.out.println("true");
	                    break;
	                    }else if(i>=2) {
	                        System.out.println("false");
	                break;
	                    }
	           }
	           }else
	               System.out.println("false");
	    
	}
	}




