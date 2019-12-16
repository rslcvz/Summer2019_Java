package day21_WhileLoops;

public class WhileLoop {

	public static void main(String[] args) {

		int a = 9;     // a=8
		while (a > 8) {
			
			System.out.println("Hello " + a);
			a--;
			
			String sentence = "I like book, I read book";
			int count = 0;
			if (sentence.contains("book")) {
				count++;
				sentence = sentence.replace("book", "");
				
		}
			System.out.println(count);
			System.out.println(sentence);
			
			
			while (!false) {
				System.out.println("Hello");
				break;    // forcefully exits the loop
			}
			
			int i = 0;
			while (true) {
				
				i++;
				System.out.println("Hello: " + i);
				if (i == 5) {
					break;
				}
			}
			for (int z=1;   z<=100; z++ ) {
				if(z%2 == 0)  {
					System.out.println(z );
				}
			}
			int x = 1;
			while (x <= 100) {
				if (x %2 == 0) {
				System.out.println(x + " ");
			}
	}
}
}
}
