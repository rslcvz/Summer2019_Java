package day26_ForEach;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {

		/*
		 syntax
		      for (DataType each: ArrayName) {
		 */
		
		int [] arr = {1, 2, 3, 4, 5} ;
		for (int i=0;  i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("       /////////////////      ");
		for ( int each : arr) {   // each represents every character in the array
			System.out.print(each + " ");
		}
		String [] str1 = {"A", "B", "C"};
		for (String resul: str1) {
			System.out.print(resul);
		}
		System.out.println();
		
			char [] ch = {'z', 'x', 'y', 'c', 'a', 'b'} ;
			Arrays.sort(ch);
            for (char resul1 : ch) {
            	System.out.print(resul1);
            }
		}
	}



