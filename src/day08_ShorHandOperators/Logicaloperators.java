 package day08_ShorHandOperators;

public class Logicaloperators {

	public static void main(String[] args) {

		boolean ResultA = 9 == 0 && "Muhtar" == "good"; // false
		System.out.println(ResultA);
		
		boolean ResultB = 8 > 5 && 7 == (8 - 2 + 1);  // true
		System.out.println(ResultB);
		
		boolean ResultC = !false != true && ! false == !(!true);
		System.out.println(ResultC);  // false
		
		boolean A = "Monday" == "Funday" || 6 == 6;
		System.out.println(A);  // true
		
		boolean B = true || false ; 
		System.out.println(B); // true
		
		boolean C = !(8 > 5) ||  !("Today"  !=  "friday");
		System.out.println(C);    // false
		
		boolean D = true && true || false ;
		System.out.println(D);    // true
		
		int x = 9999999;
		
		boolean E = !(7 > 5 && 6 !=5) && (9 > 5 || 10 > 4);
		System.out.println(E);    // false
		
		boolean F = !(19<8) || !(12 > 8);  // one of them is true, thats true.
		System.out.println(F);
		
		
		
	}

}
