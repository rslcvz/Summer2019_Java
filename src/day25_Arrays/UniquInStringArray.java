package day25_Arrays;

public class UniquInStringArray {

	public static void main(String[] args) {

		String [] arr = {"A", "B", "C", "C","A", "Z"} ;
		for (int j=0;  j < arr.length;  j++) {
		
		int count = 0;
		for (int i =0; i < arr.length;  i++) {
			if (arr[i].equals(arr[j])) {
				count++;
		}
	}
		if (count == 1) {
		System.out.println(arr[j]);

}
}
}
}