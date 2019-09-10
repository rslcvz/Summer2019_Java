package day05_Recap;

public class Primitives_Review {

	public static void main(String[] args) {

		/*
 Primitives:
		
		 byte: only takes whole numbers
		 short:only takes whole numbers
		 int:only takes whole numbers
		 long:only takes whole numbers
		 
		 float: can take decimals (Must have F or f at the end)
		 double: can take decimals
		 
		 boolean: true/false
		 char: special character
		 
		 */
		
		byte bNum = 127; // byte ranges -128 <= byte <= 127 (byte takes whole numbers)
		// short sNum = 126.5; short only takes whole numbers
		
		short sNum2 = 1000;
		sNum2 = bNum;
		System.out.println(sNum2);
		
		long longNum = 100l;
		long longNum2 = 100L;
		
		// byte byteNum3 = longNum;
		// short shortNum4 = 100l;
		// int  intNum3 = 100L;   long > int > byte > short
		
		byte a = 10;
		int b = 30;
		short c = 40;
		
		long longNumber = a;
		long longNumber2 = b;
		long longNumber3 = c;
		
		float floatNumber = 10.5F;  // you must indicate its a float by adding f or F at the end
		float floatNumber2 = 20.5f;
		
		short a1 = 10; byte b1 = 20;       long c1 = 30;      int d1 = 40;
		
		float Floats = a1;
		float Floats2 = b1;
		float Floats3 = c1;
		float Floats4 = d1;
		
		System.out.println(Floats); // 10.0
		
		double doubleNum1 = 10L; // long is smaller than double 
		double doubleNum2 = 10.5F;
		
		boolean result = true;
		boolean result2 = false;
		
		char character1 = 'A';
		System.out.println(character1);
		
		// char character2 = A; // char values must be declared within single quote
		char charvalue = 98;
		System.out.println(charvalue); // character
		
		int num3 = 'B';
		System.out.println(num3); // 66
		
		float fnum = 'B';
		System.out.println(fnum); // 66.0
		
		byte bValue = 'B';
		System.out.println(bValue); // 66
		
		float fnum2 = 5.5F;
		float fnum3 = 5; // if its not decimal, you do not have to add F or f.
		
		char specialCharacter = 55000;
		System.out.println(specialCharacter ); // If you see ' ? ' it means you do not have language pack
		
		char character = '8';
		System.out.println(character);
		
		
		char character2 = '#';
		System.out.println(character2);
		
		char character3 = '@';
		System.out.println(character3);
		
		int resul = '%';
		System.out.println(resul);
		
		float resul1 = 3.6f;
		System.out.println(resul1);
		
		double seeYou = 10;
		float seeYouSoon = 30;
		System.out.println(seeYou + "\n" + seeYouSoon);
		
    
		
		
		
		
		
		
		
	}

}
