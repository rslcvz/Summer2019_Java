package day07_Unery_ShortHand;

public class UnaryOperators {

	public static void main(String[] args) {


		/*
		 +:  positive
		 -:  negative
		 ++: increment
		 --: decrement
		 
		 */
		
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c = +b;
		System.out.println(c);  // c is - 10

		int d = -c;
		System.out.println(d);  // - - : +  // 10
		
		int num1 = 100;
	// 	++num1;
		System.out.println(num1);  // 101
		
		System.out.println(num1++); // 100
		System.out.println(num1);
		
		int intNum2 = num1++;  // intNum2 is 101
		System.out.println(num1); // 102
		
		int x = 100;
		int y = x++ -1;
		System.out.println(y);   // 99
		
		int Z = 100;
		System.out.println(--Z);  // 99
		
		int a1 = 25;
		System.out.println(++a1);  // 26
		System.out.println(--a1);  // 25  // I did not understand that part????
		
		int P = 50;
		P = --P + P++ + P-- + P++;
		//  pre   post   post   post
		// 49   + 49 +   50   +  49
		
		System.out.println(P);
		
		short S = 4;  
		int R = S * 4 - S--;
		System.out.println(S);
		System.out.println(R);
		
		int W = 1;
		W = - W-- + W++ / -W-- * --W;
		//    post  post  post   pre
		//     -1 +  0  /  -1  * -1
		//
		System.out.println(W);
		
		int H = 10;
		--H;
		System.out.println(H++);
		 W = H;
		 System.out.println(W);
		
		
		
	}

}
