package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {

		String student1 = "Ibrahim";
		String student2 = "Zuleyha";
		String student3 = "Elina";
		String [] allStudents = {"Ibrahim", "Zuleyha", "Elina"};
		//                           0          1         2
		
		allStudents[0] = "Marufjon"; 
		//  allStudents[3] = "Muhtar";                // Array's size is fixed
		System.out.println(allStudents.length);
		
		// initialize the size only without giving value:
		int [] array = new int [4];  //                  this array can contain 4 values, length is 4
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		
		// give values to the array
		array [1] = 100;
		System.out.println(array[1]);
		array[0] = 200;
		System.out.println(array[0]);
		
		array[5] = 500;
		System.out.println(array[5]);
		
		int [] array2;
	//  	System.out.println(array2[0]);
		
		
	}

}
