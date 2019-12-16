package day21_WhileLoops;

import java.util.Scanner;

public class StartinEndingNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Starting Number");
		int start =  scan.nextInt();
		
		System.out.println("Ending number");
		int end = scan.nextInt();
		
		for (int j = start;  j  <= end; j++) {
			if ( j %2 == 0)  {
				System.out.println(j + " ");
			}
			j++;
		}
		
	}

}
