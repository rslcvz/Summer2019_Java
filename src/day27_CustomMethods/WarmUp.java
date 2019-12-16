package day27_CustomMethods;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {

		int []  numbers;
		numbers = new int [100];
		numbers [0] = 1;
		
		for (int i= 0; i < 100; i++) {
			numbers [i] =i+1;
		}
		System.out.println(Arrays.toString(numbers));
		for (int each : numbers) {   // if its 2 dimensional array you give [][] between "int" and "each"
			if (each % 2 == 0) {
				continue;
				
				
			}
			System.out.println(each + " ");
			if (each %2 !=0) {
				continue;
			}
		}
	}

}
