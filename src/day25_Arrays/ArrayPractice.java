package day25_Arrays;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		int [][] resul = {{1, 10, 4, 17},  {8, 60, 13, 24}} ;
		Arrays.sort(resul);
	
           System.out.println(Arrays.toString(resul[0]));
           System.out.println(Arrays.deepToString(resul));
           
		
	}

}
