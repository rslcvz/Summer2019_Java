package Day24Java_Recap;

public class ArrayFindMinimum {

	public static void main(String[] args) {

		int [] arr = {100, 2, 2, 3, 4, 5, 6}  ;  // highest index num=8      length = 9
		
		int min = 999999999;
		for (int i=0;  i < arr.length;  i++) {
			if (arr[i]  < min)  {
				min = arr[i];
			}
		}
		System.out.println("minimum number is: " + min);
		
		int secondMinimum = 999999999;
		for (int j=0;  j < arr.length;  j++)  {
			if (arr[j]  <  secondMinimum  && arr[j] != min) {
				secondMinimum = arr[j];
			}
		}
		System.out.println("Second minimum number is: " + secondMinimum);
	}

}
