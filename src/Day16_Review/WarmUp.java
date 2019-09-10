package Day16_Review;

import java.util.Scanner;   // imports one class

public class WarmUp {

	public static void main(String[] args) {

		   
		  /*  System.out.println("Enter your firs and last name");
		   
		   String firstName = input.nextLine().toUpperCase();
		   String lastName = input.nextLine().toUpperCase();
		   
		 //  System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
		   System.out.println(firstName + " " + lastName); */
		   
		   Scanner s = new Scanner(System.in);
		    System.out.println("Enter your grade:");
		    
		    
		    
		    
		    int grade = s.nextInt();
		    

		if (grade > 90 && grade < 100) {
		  System.out.println("excellent");
		}else if (grade > 70 && grade < 90) {
		  System.out.println("good");
		}else if (grade > 60 && grade < 70) {
		  System.out.println("pass");
		}else if (grade < 60) {
		  System.out.println("fail");
		}
		}
		

	}


