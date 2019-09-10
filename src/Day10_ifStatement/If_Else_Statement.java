package Day10_ifStatement;

public class If_Else_Statement {

	public static void main(String[] args) {

	/*	if (9 > 8) {
			System.out.println(" is greater than 8");
			
		} if (9 < 8) {
			System.out.println("9 is less than 8");
	} if (9 == 8) {
		System.out.println("9 is equal to 8");
	}
	if (9 >= 8) {
		System.out.println("9 is greater or equal to 8");
	}
	else {
		System.out.println("9 is less than 8"); 
		
		int grade= 110;
		
		if (grade >= 90 && grade < 100) {
			System.out.println("You made A");
		} else if (grade < 90 && grade >= 80) {
			System.out.println("You made B");
		} else if (grade < 80 && grade >= 70) {
			System.out.println("You made C");
		} else if (grade < 70 && grade >=60) {
			System.out.println("You made D");
		} else if (grade < 100 || 0 < grade) {
			System.out.println("invalid entry");
		} else 
			System.out.println("You made F");
		
	int hour  = 11;
	  
	    if (hour >= 0 && hour < 12) {
	    	System.out.println("Good morning");
	    } else if (hour > 12 && hour <= 15) {
	    	System.out.println("Good afternoon");
	    } else if (hour > 15 && hour <= 23) {
	    	System.out.println("Good night");
	    } else {
	    	System.out.println("noon"); */
	    	
	    	int num1 = 200, num2 = 200, num3 = 200;
	    	
	    	if (num1 > num2 && num1 > num3) {
	    		System.out.println(num1 + " is the bigger number ");
	    	} else if (num2 > num1 && num2 > num3) {
	    	System.out.println(num2 + "is bigger number");
	    } else if (num3 > num2 && num3 > num1) {
	    	System.out.println(num3 + " is the bigger number ");
	    } else if (num3 == num2 && num3 > num1) {
	    	System.out.println(num3 + " and " + num1 + " are bigger numbers");
	    } else if (num3 == num1 && num2 > num3) {
	    	System.out.println(num3 + " and " + num1 + " are bigger numbers");
	    } else if (num2 == num1 && num2 > num3) {
	    	System.out.println(num2 + " and " + num1 + " are bigger numbers");
	} else if (num2 == num1 && num2 == num3) {
    	System.out.println("all numbers are same");
	}
		
		
	}
}



