package day08_ShorHandOperators;

public class RelationalOperators {

	public static void main(String[] args) {

		System.out.println(10 > 9);  // true
		boolean resultA = 10 > 9;
		System.out.println(resultA);  // true
		
		System.out.println(10 >= 9);  // true
		
		boolean resultC = 10 <= 9;
		System.out.println(resultC);  // false
		
		boolean resultD = 1100 < 1200;
		System.out.println(resultD);  // false
		
		boolean resultE = 1000 < 1000;
		System.out.println(resultE);  // false
		
		boolean resultF = 1000 <= 1000;
		System.out.println(resultF);  // false
		
		boolean resultG = 19== 19;
		System.out.println(resultG);  // true
		
		boolean resultH = 20 != 20;
		System.out.println(resultH);  // false
		
		boolean A = true == !false;
		System.out.println(A);  // true
		
		boolean B = !true;
		System.out.println(B);  // false
		
		boolean C = !false != !true;
		System.out.println(C);   // true
		
		boolean D = true == !false;
		System.out.println(D); // true
		
	System.out.println((int)10.0 / 3);
	
	boolean E = 10 > 9 == 9 < 10;
	System.out.println(E);  // true
	
	String str3 = "Result A" + 14 % 2;
	System.out.println(str3);
	
	boolean resul = "Resul10" == "resul10";
	System.out.println(resul);
	
	
		
		
	}

}
