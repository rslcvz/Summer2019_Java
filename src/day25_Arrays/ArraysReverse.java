package day25_Arrays;

import java.util.Arrays;

public class ArraysReverse {

	public static void main(String[] args) {

		int [] myNumbers = {99, 10, 200, 3000, 40, 50, 5000} ;
        Arrays.sort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
        for(int i = myNumbers.length-1; i >= 0; i--) {
        	System.out.print(myNumbers[i] + ", ");
       
	}
	}
}
