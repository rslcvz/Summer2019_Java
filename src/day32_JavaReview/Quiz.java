package day32_JavaReview;
import java.util.*;
public class Quiz {

	public static void main(String[] args) {

		int [] arr = {30, 20, 10, 5, 0};
		Arrays.sort(arr);
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 30) {
				continue;
			}
			
			System.out.print(arr[i] + " ");
			
		}
	}

}
