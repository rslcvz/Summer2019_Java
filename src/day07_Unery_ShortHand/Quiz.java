package day07_Unery_ShortHand;

public class Quiz {

	public static void main(String[] args) {

		int a = 30;
		// int b =(long) a;
		int b =(byte) a;
		System.out.println(b); // 30
		
		System.out.print("Result A " + 0 + 1); // "Result A 01"
		
		System.out.print("; Result B" + (1) + (2) + "\n"); // "ResultB12"
		
		System.out.println("Result B" + (1 + 2));  // "Result B" + 3
		
		System.out.println("5 + 2 = " + 3 + 4);   // " 5 + 2 = 34 "
		
		float FloatNum = 100.98765432f;
		short ShortNum = (byte) FloatNum;
		
		System.out.println(ShortNum);
		
		int Numa = 200;
		int Numb = 2;
		System.out.println(Numa + Numb - Numa * Numb + Numa / Numb); // -98
		
		System.out.println((3 + 2) * 2 / 3 % 2); // remainder 1
		
		long lNum = 3_000L;
		double dNum = (float) lNum; // narrowing 
		System.out.println(dNum);
		
		int iNum = (byte) dNum; // compiles with byte, short, int.
		
		System.out.println(iNum % 1000);
		
		double result1 = 10 / 3;
		System.out.println(result1);    // 3.0
		
		String str = "10.5";
		
		// int num =(int) str;  // string is not a primitive (non-primitive)
		
		int I1 = 10,  I2 = 20, I3 = 30;
		
		I1 = I1 % 5;  // 0
		I1 = I2 % 5;  // 0
		
		I3 = I1 * I2;  // 0
		System.out.println(I1 + "\t" + I2 + "\t" + I3);
		
		System.out.println(10 / 3F);  // Float (F) Double (D) give you decimal results
		
		float yy = 10.7f;
		double uu = 10.9;
		
		
		
	}

}
