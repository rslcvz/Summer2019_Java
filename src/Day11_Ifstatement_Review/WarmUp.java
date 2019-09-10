package Day11_Ifstatement_Review;

public class WarmUp {

	public static void main(String[] args) {

	/*	int year = 2000;
		boolean LeapYear = year % 4 == 0;
		if (LeapYear) {
	System.out.println("Year " + year + " is a leap year");
		} else {
			System.out.println("Year" + year + " is not leap year"); 
			
			int grade = 55;
			boolean A = grade >= 90 && grade <= 100;
			boolean B = grade >= 80 && grade <= 89;
			boolean C = grade >= 70 && grade <= 79;
			boolean D = grade >= 60 && grade <= 69;

			if (A) {
				System.out.println("Thats A");
			} else if (B) {
				System.out.println("Thats B");
			} else if (C) {
				System.out.println("Thats C");

			} else if (D) {
				System.out.println("Thats D");

			} else {
				System.out.println("Thats F"); 
				
				int age = 18;
				boolean GoodPerson = false;
				if (age >= 18) {
					if (GoodPerson) {
					System.out.println("Alcohol is bad for your health");
				} else {
					System.out.println("You can buy cigarattes");
					if (age >= 21 ) {
						System.out.println("You can buy hookah");
					} else if (age >= 25) {
						System.out.println("You can buy alcohol");
					} else {
						System.out.println("Buy milk");*/
		
		int month = 5;
		if (month == 2) {
			System.out.println("28 days");
		} else if (month == 4 || month == 6) {
			System.out.println("30 days");
		}else if (month == 9 || month == 11) {
			System.out.println("30 days");
		}else {
			System.out.println("31 days");
		}
		} else {
			System.out.println("invalid entry");
		
	}
}
}
