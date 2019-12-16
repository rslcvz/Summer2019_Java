package day20_JavaRecap;

public class WarmUp01 {

	public static void main(String[] args) {
		int sum1 = 0;

		for (int i = 1;  i <= 1000; i++  )  {
			sum1 += i;
	}
		System.out.println("sum of all nums: " + sum1);   // 500500
		
		int sum2 = 0;
		
		for (int i = 1;   i <= 1000; i++)  {
			if (i%2 == 0)  {
				sum2 +=  i;
			}
		}
		System.out.println("Sum of all even number: " + sum2);   // 250500
		
		int sum3 = 0;
		for ( int i = 2;  i <= 1000; i+=2) {
			sum3 += i;

}
		System.out.println("Sum of all even nums: " + sum3);    // 250500
		
		
		int sum4 = 0;
		for (int i = 1 ; i <= 1000;  i++) {
			if (i %2 == 1) {
			sum4 += i;
			
}
}
		System.out.println("Sum of all odd nums: " + sum4);   // 250000
	}
}