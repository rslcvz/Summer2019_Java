package day08_ShorHandOperators;

public class ShortHand {

	public static void main(String[] args) {

		/*
		 += addition assignment 
		 -= subtraction 
		 
		 */
		
		int a = 9;
		
		// System.out.println(a); // 12
		
		a += 3;
		System.out.println(a);  // 12
		
		int b = a += 5;  // 17
		System.out.println(b);  // 17.0
		
		int c = a += b ;  // a: 34    c : 34     b: 17
		System.out.println(c);
		
		int d = a += c;  // 
		System.out.println(d);   // d : 68
		
		int e = (d += b) * 2;
		System.out.println(e);  // 170
		
		// d = 85   b= 17   e = 170  c = 34
		
		int f = b += d * 2;
		System.out.println(f);   // 187
		
		int g = 101;
		int h = g -= 1;
		System.out.println(h);  // g = 100   h = 100
		
		int i = g+=h+5;
		System.out.println(i);    // 205
		
		int j = h+= g % i;
		System.out.println(j);   // j= 100
		
		int k = j -= h * 2 % 5;
		System.out.println(j);  // 100
		
		int A = 100;
		A *= 200;
		
		System.out.println(A);  // 20.000
		
		int B = 100;
		B *= 100 / 10;
		System.out.println(B);  // 1000
		
		B *= B - 1000;
		System.out.println(B);   // 0
		
		int C = 1000;
		C /= 5;
		System.out.println(C); // 200
		
		int D = 10;
		System.out.println(C);  // 200
		
		C /= D + 10;
		System.out.println(C);  // 10
		
		int z = 10 % 3; 
		System.out.println(z);   // 1
		
		int E = 10;
		E %= 2;
		System.out.println(E);  // 0
		
		int F = 100;
		F %= 2;
		System.out.println(F);   // 0
		
		System.out.println(-100 % 3);  // -1
		System.out.println(10.0 % 3);  // -1.0
		
		int J = 300;
		int K = 10;
		
		System.out.println(J);  // 300
		
		
		
		
		
		
		
	}

}
