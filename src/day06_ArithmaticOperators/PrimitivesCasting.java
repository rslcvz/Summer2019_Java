package day06_ArithmaticOperators;

public class PrimitivesCasting {

	public static void main(String[] args) {

		/*
		 * Casting: Converting larger primitive to smaller size Primitives: byte, short,
		 * int, long, float, double
		 * 
		 * Castings: Explicit & implicit
		 */

		int a = 128;
		byte b = (byte) a;
		System.out.println(b);

		double DecimalNumber = 10.5;
		float FloatNumber = (int) DecimalNumber; // double > float
		// FloatNumber = 10;

		System.out.println(FloatNumber);

		long LongNum = 300L;

		// int IntNum = (int)LongNum;
		int IntNum = (byte) LongNum;

		System.out.println(IntNum);

		// implicit casting:

		byte ByteNum = 100;
		int IntNum2 = ByteNum;

		int IntNum3 = (int) ByteNum;

		short shortNum = 100;
		long longNum2 = shortNum;
		// same with:

		long longNum3 = (long) shortNum; // implicit casting

		// Explicit casting practices:

		double largestNumber = 100.8765;
		byte ByteValue = (byte) largestNumber;
		// 100
		float floatValue = (int) largestNumber;

		float floatValue2 = (int) largestNumber;
		float floatValue3 = (byte) largestNumber;
		float floatValue4 = (short) largestNumber;
		float floatValue5 = (long) largestNumber;

		System.out.println(ByteValue);
		System.out.println(floatValue); // 100.0
		System.out.println(floatValue2);
		System.out.println(floatValue3);
		System.out.println(floatValue4);
		System.out.println(floatValue5);

		float floatNum2 = 500.67F;
		int myNumber = (byte) floatNum2;
		// 500
		System.out.println(myNumber);

		/*
		 * int num1 = 100; int num2 = 200; int num3 = 300;
		 */

		int num1 = 100, num2 = 200, num3 = 300;

		int Num1 = 100, Num2 = 200, Num3 = 300;

		boolean result = true;
		System.out.println(result); // local variables must be initialized

		char Character1 = (byte) 12;
		System.out.println(Character1);

		boolean result1, result2, result3;

		float resul = 100;
		int resul2 = (char) resul;
		System.out.println(resul2);

	}

}
