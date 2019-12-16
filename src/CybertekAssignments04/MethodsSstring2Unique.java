package CybertekAssignments04;

import java.util.*;

public class MethodsSstring2Unique {

	public static void main(String[] args) {

		System.out.println(uniqueChars("spoon"));
	}

	public static String uniqueChars(String str) {
		String word = "";
		
		for (int i = 0; i < str.length(); i++) {
				if (!word.contains(String.valueOf(str.charAt(i)))) {
					word += str.charAt(i);
			}
			
		}
		return word;
	}
}
