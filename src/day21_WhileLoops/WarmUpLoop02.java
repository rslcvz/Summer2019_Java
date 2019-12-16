package day21_WhileLoops;

public class WarmUpLoop02 {

	public static void main(String[] args) {

		String words = "Cybertek is school, Cybertek is great, I love Cybertek Cybertek is school, Cybertek is great, I love Cybertek ";
		// always give a beginning index so that you can include any word like "Cybertek"
		
		int count = 0;
		for ( int i = 0; i < words.length() - 7; i ++) {
			if (words.substring(i, i+8).equals("Cybertek")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
