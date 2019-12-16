package day21_WhileLoops;

public class do_While {

	public static void main(String[] args) {

		boolean A = false;
		while(A) {
			System.out.println("Hello World");
		}
		do {
			System.out.println("Hello");
		} while (A);
	
	int x = 1;
	do {
		if (x %2 == 0) {
		System.out.println(x + " ");
		}  x++;
	} while (x <= 100);
	System.out.println();
	
	do {
		System.out.println("Hello World");
		break;
	} while(true);
}

}

