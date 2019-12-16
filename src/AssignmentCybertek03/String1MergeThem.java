package AssignmentCybertek03;

import java.util.*;

public class String1MergeThem {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "12345";

		System.out.println(mergeStrings(a, b));
	}

	public static String mergeStrings(String one, String two) {
		String result = "";
		int max = Math.max(one.length(), two.length());
		for (int i = 0; i < max; i++) {
			
			if (i < one.length()) {
				result += one.charAt(i);

			}
			if (i < two.length()) {
				result += two.charAt(i);
			}
		}
		return result;
	}
}