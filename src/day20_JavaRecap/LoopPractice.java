package day20_JavaRecap;

public class LoopPractice {

	public static void main(String[] args) {

		// sum of 1000
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {     // i : 1 - 1000
			sum += i;
			
	}
		System.out.println("sum of all nums: " + sum);   // 500500
		
		int sum2 = 0;
		for (int i = 1;  i <= 1000; i++) {
			if (i % 2 == 0)  {
				sum2 += i;
			}
			
		}
		System.out.println("sum of all even nums: " + sum2);   // 250500
		
		int sum3 = 0;
		for (int i = 2; i <= 1000; i+= 2) {
			sum3 += i;
			
}
		System.out.println("sum of all even nums: " + sum3);  //        250500
		
		int sum4 = 0;
		for (int i = 1; i <1000; i++) {
			if (i %2 == 1) {
				sum4 += i;
		}
}
		System.out.println("sum of all odd numbers: " + sum4);    //   250000
		
		int sum5 = 0;
		for (int i =1;  i <= 1000; i+=2)   {
			sum5 += i;
 }
		System.out.println("sum of all odd numbers: " +sum5);    //   250000
}
}