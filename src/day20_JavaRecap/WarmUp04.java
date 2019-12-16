package day20_JavaRecap;

import java.util.Scanner;

public class WarmUp04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int min = 9999999;
		
		for (int i = 1; i <=3; i++) {
		
		System.out.println("Enter a number: ");
		int inputNum = input.nextInt();
		if (inputNum < min) {
			min = inputNum;
		}
	}
	System.out.println("Min value is " + min);
	}

}
