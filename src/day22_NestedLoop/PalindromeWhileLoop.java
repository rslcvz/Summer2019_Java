package day22_NestedLoop;

import java.util.Scanner;

public class PalindromeWhileLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a word or a sentence: ");
			String oroginal = scan.nextLine();
			String reverse = "";
			
			int i = oroginal.length() - 1;
			while  (i >= 0) {
				reverse += oroginal;   // eksik
			}
	}

}
