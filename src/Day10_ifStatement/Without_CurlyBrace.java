package Day10_ifStatement;

public class Without_CurlyBrace {

	public static void main(String[] args) {

		/* 
		 if (false) {
		 
			System.out.println(" Today is Friday ");
			System.out.println("Tomorrow is day off ");
			System.out.println("No Java class tomorrow ");
		}
		
		 if (false) 
			 System.out.println("Today is Friday");
		     System.out.println("No Java class tomorrow ");  */
		
		if (true)
			System.out.println("Hello");
		// System.out.println("Good morning");  // another print statement will give you compile error
		    
		else
			System.out.println("Hola");
		
		if(false)
			System.out.println("this is if");
		else 
			System.out.println("this is else");
		
		int bak = 5;
		if (10 * 100 / 12 % 2 >= bak || 6/2 < 5) {
			System.out.println("Himmmm");
		} else { 
			System.out.println("What the hell!");
		}
	}

}
