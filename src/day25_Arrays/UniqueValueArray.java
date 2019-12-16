package day25_Arrays;

public class UniqueValueArray {

	public static void main(String[] args) {

		int [] arr = {1, 1, 2, 2, 3, 4, 4, 2, 2, 2, 9 , 8, 7};  // print unique characters.

		for (int j=0; j < arr.length; j++) {
		
		int count = 0;
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == arr[j]) {
				count++;
			}
		}
		if (count == 1)  {
		System.out.println(arr[j]);
	}

}
}
}