package day30_WrapperClass_Arraylist;

import java.util.ArrayList;

public class WrapperClassMethods {

	public static void main(String[] args) {

		boolean A = Boolean.parseBoolean("CybertekBatch12");
		System.out.println(A);
	    
		boolean B= Boolean.parseBoolean("TruE");
		System.out.println(B);         // anything other than TRUE you will get false
		
		boolean C= Boolean.parseBoolean("10 > 9");
		System.out.println(C);
		
		Boolean D = Boolean.parseBoolean("TrUe");  // Auto-boxing
		System.out.println(D);
		
		int a = 10;
		double b = a;  // double wrapper is for double primitive
		
		int A1 = Byte.parseByte("19");
		Integer A2 =(int) Byte.parseByte("19");
		
		Short A3 = (short)Double.parseDouble("10.9");
		int A5 = 100;
		Float A6 = (float)A5;  // float wrapper for float primitive
		
		// ValueOf: converts string value to wrapper class values
		int z = Integer.valueOf("1234");
		Integer z1 = Integer.valueOf("1234");
		Integer z2 = (int)Integer.valueOf("1234"); // assigning primitive to wrapper===>  Auto-Boxing
		System.out.println(z2);
		
		boolean result1 = !Boolean.valueOf("TRUE");
		System.out.println(result1);
		
		int totalNumber = 100;
		String str3 = "" + totalNumber;
		
		
		
	}

}
