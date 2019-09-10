package day06_ArithmaticOperators;

public class ArithmaticOperators {

	public static void main(String[] args) {

		int a = 100;
		int b = a - 400;  // -300
		
		System.out.println(b);
		
		int c = a + b;
		System.out.println(c); // -200
		
		int x = 3, y = 5, z = x * y;
		System.out.println(z);   // 15
		
		double length = 100, Width = 10, Area = length/Width;
		System.out.println(Area);
		
		System.out.println(3 + 5 + 4 - 2);  // 10
		
		double resultNum = 9 / 2;
		System.out.println(resultNum);  // divisor(bolen) cannot be 0
		
		double Number1 = 10.0 / 3.0;
		System.out.println(Number1); // 3.3333333333333335
		
		double Number2 = 10 / 3; // 3.0
		
		int output = 12 + 6 / 3;
		System.out.println(output);   // 14 ( Because division and multiplication come first
		
		System.out.println(5 + 2 * 4); // 13
		System.out.println(10 / 2 - 3); // 2

		int result1 = 10 % 3;  // 1
		System.out.println(result1);
		
		System.out.println(12 % 5);
		
		int Number20 = 20 % 2;
		System.out.println(Number20); // even
		
		int Number45 = 45 % 2;
		System.out.println(Number45); // odd
		
		int Number65 = 65 % 2;
		System.out.println(Number65); // odd
		
		System.out.println(4 + 17 % 2 - 1 );
		
		System.out.println(6 - 3 * 2 + 7 - 1); // 6
		System.out.println(3 + 4 * 4 + 5 * (4 + 3));  // 54
		System.out.println(10 % 4);
		
		
        		
	}

}
