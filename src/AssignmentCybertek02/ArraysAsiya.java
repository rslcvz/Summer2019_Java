package AssignmentCybertek02;

import java.util.*;

public class ArraysAsiya {

	public static void main(String[] args) {

		String car = "bmw";
		String[] cars = {"bmw", "wv", "audi" };
		System.out.println(Arrays.toString(cars));
		System.out.println(cars[1]);
		
		int[] arr = {100, 45, 97, 33};
        for (int i=0;  i <=arr.length-1;  i++) {
        	System.out.print(arr[3] + " ");
       }
        System.out.println();
        for (int num: arr) {
        	System.out.println(num);
        }
	}

}
