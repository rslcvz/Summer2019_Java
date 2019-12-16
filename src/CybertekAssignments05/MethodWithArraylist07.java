package CybertekAssignments05;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodWithArraylist07 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Resul");
		words.add("Hocam");
		words.add("Boow");
		test(words);
		
	}

	public static void test(ArrayList<String> words) {
		words.add(0, "Hey");
		words.add(3, "Yo");
		System.out.println(words);
	}

}
