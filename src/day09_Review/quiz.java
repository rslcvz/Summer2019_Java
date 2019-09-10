package day09_Review;

public class quiz {

	public static void main(String[] args) {

		boolean a = !!!!!false;
		System.out.println(a); //  ! ! ! ! !false
		//                         T F T F T
		
		boolean result = !false != ("Batch12" != "Best Batch Ever ");
		System.out.println(result);    // false
		
		int x = 100;
		int y = x += 100/20;
		System.out.println(y);  // 105
		System.out.println(x);  // 105
		
		boolean A = 128 > '9' || 128 == 127;
		System.out.println(A);
		
		boolean StupidOperators = 10 >= 20 && 'a' > 'b';
		//                         false &&  false
		System.out.println(StupidOperators);   // false
		
		int X = 9999999;
		int Y = 10;
		System.out.println(X * Y / 10 % X);  // 0
		
		System.out.println("8" +5 + 7 );  // 128
		
		System.out.println(5 + 7 + "8" + 5 + 7);  // 12857
		
		System.out.println(1 + 11 + "3" == "123"); // true
		//                   12 + "3"
		//                    "123"     == "123"
		

		int numberA = 100;
		numberA += 300;    // 400
		
		System.out.println(numberA++ + "\r" + numberA);   // 400   401
		
        System.out.println((10 * 2) / (5 * 4) * 1000 / 10 % 100);
        //                   20     / 20 *  1000 / 10 % 100
        
		
		
	}

}
