package day05_Recap;

public class Quizes_Java {

	public static void main(String[] args) {
		
		/*
		 * THERE ARE MULTIPLE WAYS TO DECLARE MAIN METHOD
		 
		 1. public static void main(String[] args)
		 2. static public  void main(String[] args)
		 3. public static void main(String... args)
	
		 */

		double num = 10L;
		
		double b = 5.5F;
		float num2= 10;
		
		float num4 = 5.5f;
		
		double num5 = 10l;
		System.out.println(num5); // float and double are decimals.
		
		int iNum = 10;
		long LNum = iNum;
		
		long LNum2 = 10L;  // You cannot print the L.
		
		System.out.println(LNum2);
		
		float FNum = 5.5F;
		System.out.println(FNum); // 5.5
		
		int myNum = '9';
		System.out.println(myNum);
		
		boolean result = 'C' > 'G';
		
		int i = 100;
		double d = 300L;
		float f = 200f;
		// i = f; // int is smaller than float
		f =i;
		d = f;
		// f = d; double . float
		d = i;
		// i = d; double > int
		double nums1 =10F;
	    
		System.out.print(" Batch12 ");
		System.out.println(" Cybertek ");
		System.out.println(" \t School "); // (Second line prints the next line)
		
	}
	

}
