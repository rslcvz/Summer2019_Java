package AssignmentsCybertek;

public class UnaryShortHanded {

	public static void main(String[] args) {

		/*
		 * int x = 2; int y = x++;
		 * 
		 * System.out.println(y); // 2
		 * 
		 * System.out.println(x++); // 3
		 * 
		 * System.out.println(--x); // 3
		 */

		/*
		 * int x = 8; int y = x--;
		 * 
		 * System.out.println(y); // 8*/
		 

		int a = 10;
		a = -a-- + a++ / -a-- * --a;
		System.out.println(a); 
		
		/*int a = 10;
		a = --a + a++ + a-- + a++;
	//       50  49     50    49	
		
		System.out.println(a);*/

	}

}
