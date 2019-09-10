package AssignmentsCybertek;

public class SwipeTwoVariables {

	public static void main(String[] args) {
		/*
		 * declare two variables:
		 * 
		 * int a= 10; int b= 15; swipe those two variables value without using a
		 * temporary variable Ex:
		 * 
		 * System.out.println(a); ===> 15 System.out.println(b); ===> 10
		 */

		// int a = 10; // +5;
		// int b = 15; //-5;

		int a = 10;
		int b = 15;

		a = a + b; // a: 25
		b = a - b; // b : 10
		a = a - b; // a : 15

		System.out.println(" a is " + a + "\r" + " b is " + b);

		int c = 15;
		int d = 20;

		int temp;

		temp = c;
		c = d;
		d = temp;

		System.out.println("C is " + c + " D is " + d);

		// System.out.println("a is " + (a + 5) + "\n" + "b is " + ( b - 5));
		// System.out.println(" a is " + (b - a + a) + "\r" + " b is " + ((b + b) - (a +
		// a)));
		// System.out.println(" a is " + b + "\n" + " b is " + a);
		// System.out.println(" a is " + a + "\r" + " b is " + b);

	}

}
