package day21_WhileLoops;

public class WarmUp {

	public static void main(String[] args) {

		String sentence = "I like books, resul resul I have books, I need book book book";
		//                        i
		
		int count= 0;
		
		for (int i = 0;  i < sentence.length() - 4;  i++)  {
			
			if (sentence.substring(i, i+5).equals("resul")) {
				count++;
		}
	}
		System.out.println(count);

}
}
