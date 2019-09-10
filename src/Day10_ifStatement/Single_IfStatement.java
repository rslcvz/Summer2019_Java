package Day10_ifStatement;

public class Single_IfStatement {

	public static void main(String[] args) {

		if(9 > 8) {
			System.out.println("9 is greater than 8");
		
		if (9 < 8) {
			System.out.println("9 is greater than 8 p");
	}
		System.out.println("test is completed");
		
		int n1 = 100, n2 = 500, n3 = 5000;
		int max = 0;
		
		
		if (n1 > n2 && n1 > n3) {
			max = n1;
		}
		if (n2 > n1 && n2 > n3) {
			max = n2;
		}
		if (n3 > n1 && n3 > n2) {
			max = n3;
			System.out.println(max);
			
			/* double B;
			  if (false) {
			  B = 100;
			  System.out.println(B); 
			
			int num = 100;
			String str = "negative";
			if (num > 0) {
				str = "positive";
			}    if (0 < num) {  */
			
			int number2 =5000;
			
			if (number2 > 0) {
			System.out.println("Positive");
			
			} if (number2 < 0) {
				System.out.println("Negative");
				
			} if (number2 == 0) {
				System.out.println("zero");
			}
		    	
		    }
			
			
		
			
		
}
}

}
