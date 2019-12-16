package AssignmentsCybertek;

import java.util.Scanner;

public class OnlineBookMerchants {

	public static void main(String[] args) {

		int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Are you a premium member?:(true-false) ");
	    boolean isPremiumCustomer = scan.nextBoolean();
	    System.out.println("How many books you have bought?: ");
	    int nbooksPurchased = scan.nextInt();  
	    
	    if (isPremiumCustomer == true && (nbooksPurchased > 5 && nbooksPurchased < 8))  {
	    freeBooks = 1;
		   System.out.println("You earned: " + freeBooks + " free books");
		   
	   } else if ( nbooksPurchased >= 8 ) { 
		   freeBooks = 2;
		   System.out.println("You earned: " + freeBooks + " free books");
	    
	} else if (isPremiumCustomer == false && (nbooksPurchased >= 7 && nbooksPurchased < 12)) {
		freeBooks = 1;
		System.out.println("You earned: " + freeBooks + " free books");
		
}  else if ( nbooksPurchased >= 12 ) {
	freeBooks = 2;
	System.out.println("You earned: " + freeBooks + " free books");
} else {
	System.out.println("No free book, sorry :(");
}
	
}
}
