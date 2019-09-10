package Day16_Review;

public class Kahoot {

	public static void main(String[] args) {

	/*	byte batch = 12;
		switch (batch) {
		case 10:
			System.out.println("Cybertek");
			
		case 12:
			System.out.println("Best");
			break;
			default:
				System.out.println("Batch"); 
				
				int x = 5, y = 19;
				int num = (y-x > x - y) ? y - x : x - y;
				System.out.println(num);     
		
		int sum = 2, price = 100;
		sum *= (price >= 100) ? (price *= 2) : price;
		// sum *=  200
		
		System.out.println(sum + " " + price);        */
		
		
		float f1 = (12_345.1 > 123_45.0) ? 12456 : 12456.02f;
		//          12345.1   > 12345.0 ? 12456 : 12456 
		
		float f2 = f1 + 1024;
		System.out.println(f2);
		
		int money = 1_000_000;
		System.out.println(money);
		
		int i = 10;
		int j = 20;
		int k = j += i/5;
		System.out.println(i + " " + j + " " + k);
		
		String num = "1";
		switch (num) {
		case "1":
			System.out.println("One");
			break;
		}
		
		
				
		}
	}


