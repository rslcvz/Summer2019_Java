package AssignmentCybertek03;

import java.util.*;

public class FindMaxLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String longest="";

		String[] words = new String[5];
		
		for (int i = 0; i < words.length; i++) {
			words[i] = input.nextLine();
			

		}
		
		for (int j = 0; j < words.length-1; j++) {
			if (words[j].length() > words[j + 1].length()) {
				longest = words[j];
			}else {
				longest =  words[j + 1];
			}

		}
		System.out.println(longest);
	}
}
