package day28_JavaRecap;

import java.util.*;

public class WarmUp02 {

	public static void main(String[] args) {

		
		
		
		
	}	
		
		public static void calculate (int a, int b, String Ope) {
			String result = "";
			if (Ope.equals("-")) {
				result += (a - b);
			} else if(Ope.equals("+")) {
				result += (a + b) ;
				
			}else if(Ope.equals("*")) {
				result += (a * b) ;
			
	}else if(Ope.equals("/")) {
		result += (a / b) ;
		
		}else if(Ope.equals("%")) {
			result += (a % b) ;
			
} else {
	System.out.println("Invalid operator");
}
}
}