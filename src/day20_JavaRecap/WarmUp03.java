package day20_JavaRecap;

import java.util.*;

public class WarmUp03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int max = 0;
		
		for (int i = 1; i <=5; i++) {
		
		System.out.println("Enter a number: ");
		int inputNum = input.nextInt();
		if (inputNum > max) {
			max = inputNum;
		}
	}
	System.out.println("Max value is " + max);
}
}






