package day25_Arrays;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String  sentence = "Today is great day, Good day to learn java";
		String [] arr = sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String email = "FirstName_LastName";
		String [] arr2 = email.split("_");
		String str = Arrays.toString(arr2);
		System.out.println(str.replace("[", "").replace("]", ""));
		
		String fullName = "Cybertek School Batch12";
		String [] array1 = fullName.split(" ");
		System.out.println(Arrays.toString(array1));
		
		String java = "I love Java, Java is fun, I love Java, Java is life";
	String[] arr3 =	java.split("Java");
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3.length-1);
	}

}
