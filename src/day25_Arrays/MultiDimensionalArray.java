package day25_Arrays;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int [] arr1D = {1, 2, 3};
		
		int [] [] arr2D = { {1, 2, 3}, {4, 5, 6}};
		
		String [] arr = {"A", "B"} ;
		
	/*	//    index              0    1       0    1    2
		String [] [] str2D = System.out.println(Arrays.toString(str2D[1])); ; 
		//    represents    index =  0           1
		
		System.out.println(str2D[0][0]);   // to reach "A" declare the first dimension and then second :) easyyyy
		
		System.out.println(str2D[1][1]);   // B
		System.out.println(str2D[1][2]);   // E
		System.out.println(Arrays.toString(str2D[1]));   // [C, D, E]
		// deepToString(variableName)
		System.out.println(Arrays.deepToString((str2D))); */
		
		int [][][] array3d = {   { {1, 2}, {3, 4}} , { {5, 6}, {7, 8}} };
		System.out.println(array3d [1][1][1]);
		
		System.out.println(array3d [1][0]);
		System.out.println(Arrays.toString(array3d [1][0]));
		
		System.out.println(array3d[1]);
		System.out.println(Arrays.toString(array3d [1]));
		System.out.println(Arrays.deepToString(array3d[1]));

		System.out.println(Arrays.deepToString(array3d));
	}

}
