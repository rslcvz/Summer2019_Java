package day22_NestedLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word or a sentence: ");
		String oroginal = scan.nextLine();
		String reverse = "";
		
	    for (int i = oroginal.length() - 1;  i >= 0; i--) {
			reverse += oroginal.substring(i, i+1);   
			
		}
		boolean result = oroginal.equals(reverse) ? true : false;
		System.out.println(reverse);
		System.out.println(result);
	}

}
