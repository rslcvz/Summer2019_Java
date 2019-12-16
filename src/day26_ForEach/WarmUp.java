package day26_ForEach;

import java.util.Arrays;
import java.util.TreeSet;

public class WarmUp {

	public static void main(String[] args) {

		
		String a = "aabbbc", b = "cab";
		String a1 = "";
		for (int j = 0; j < a.length(); j++) {
			for (int i = 0; i < a.length(); i++) {
				if (!a1.contains(a.substring(j, j + 1))) {
					a1 += a.substring(j, j + 1);
				}
			}
			
		}
		
		System.out.println(a1);
		String b1 = "";
		for (int i =0; i < b.length(); i++) {
			if (!b1.contains(b.substring(i, i+1))) {
				b1 += b.substring(i, i+1);
			}
			
		}
		System.out.println(b1);
		
		char[] ch1 = a1.toCharArray();
		System.out.println(Arrays.toString(ch1));
		
		String str1 = "ccccccaaaaabbbbbcccc", str2 = "cccaaaabbbb";
		str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
		str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
		System.out.println(str1.equals(str2));

	}
}
