package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice {
public static void main(String[] args) {
	sum(10, 20);
	//   int max = sum(10, 20);  // the method does not return any value.
	addition(10, 20);
	System.out.println(addition(10, 20));
	int num = addition(10, 20);
	System.out.println(num);
	int max = (int)greaterNumber(90, 200, 30);
	System.out.println(max);
}

	public static void sum(int a, int b) {
		System.out.println(a+b);

}
	public static int addition(int a, int b) {
		return a+b;
	}
	public static double greaterNumber(int a, int b, int c) {
         int [] arr = {a, b, c };
         Arrays.sort(arr);
         return arr [arr.length-1];
	}
}