package day22_NestedLoop;

public class WhileLoopo2 {

	public static void main(String[] args) {

		/* int z = 5;
		while ( z > 0 )  {
		
		int i = 1;
		while (i <= 5)  {
			System.out.print("*");
			i++;
		}
		System.out.println();
		z--;    */
		
		for (int i=1;    i <= 5;  i++) {
			for (int j = 1;  j <= i;  j++) {
				System.out.print("*");
	}
			System.out.println();
}
		int A = 1;
		while (A <= 7) {
			int B = 1;
			while (B <= A) {
				System.out.println("$");
				B++;
			}
			System.out.println();
			A++;
		}
}
}
