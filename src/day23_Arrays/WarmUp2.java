package day23_Arrays;

public class WarmUp2 {

	public static void main(String[] args) {

		// find unique characters    AAABCDEEFF   --> output  --> BCD
		
		String str = "AAARBBCCDDEFFYSYUL";
		String unique = "";
		
	for(int j =0; j < str.length(); j++) {	
		
		int count = 0;
		for (int i =0;   i < str.length(); i++) {
			if (str.substring(i, i+1).equals("" + str.charAt(j))) {
		     count++;
	}
	
}
		if (count == 1) {
			unique +="" + str.charAt(j);
		}
	}
	System.out.println(unique);
}
}

