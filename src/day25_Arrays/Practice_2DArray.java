package day25_Arrays;

import java.util.Arrays;

public class Practice_2DArray {

	public static void main(String[] args) {

		int [][] arr2D = { {1, 2}, {3, 4, 5, 6, 7}, {8,9} };
	    int length = arr2D.length;    //  2
	    
	    for (int i=0;  i < arr2D.length; i++ )  {
	    	System.out.println(Arrays.toString(arr2D[i]));
	    }
	    
	    for (int i=0;  i < arr2D.length; i++ )  {
	    	 for (int j=0;  j < arr2D[i].length; j++ )  {
	    		 System.out.print(arr2D[i][j] + " ");
	}
	    
}
	    System.out.println();
	    char [][] ch2D = { {'A', 'B', 'G'} , {'C', 'D', 'E', 'F'} } ;
	    for (int  i=0;  i  < ch2D.length; i++) {
	    	for (int j = 0;  j < ch2D[i].length; j++) {
	    		System.out.print(ch2D[i][j] + " ");
	    	
	    }
	}
}
}
