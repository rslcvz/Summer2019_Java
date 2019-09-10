package day09_Review;

public class If_Statement {

	public static void main(String[] args) {

		if (9 < 10) {
			
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("Class starts on Monday");
			
			int a = 1000;
			if (a++ == 1001) {
				a = 2000;
				System.out.println("a is increased");
		}
			System.out.println(a);
			
			int X = 987654320;
			if (X % 2 == 0) {
				// true
				System.out.println(X);
				System.out.println("Its an even number");
			}
			if (X%2 != 0) {
				// false
				System.out.println(X);
				System.out.println("Its an odd number");
			}
			int Y = 2345678;
			if (Y % 5 == 0) {
				System.out.println(Y + " can be divided by 5");
			}
			if (Y % 5 != 0) {
				System.out.println(Y + "cant be divided by 5");
			}
			String CEO = "Main Boss";
			String Kuzzat = "Main Boss";
			
			System.out.println(CEO == Kuzzat );
			
			if (Kuzzat == CEO) {
				System.out.println("Great person in the world");
				System.out.println("First if block");
				
			}
			if (Kuzzat != CEO) {
				System.out.println("Great person in the world");
				System.out.println("Second if block");
			}
			
			int TotalNumber = 100;
			boolean Cybertek = true;
			boolean BestSchool = true;
			{
			
			if (Cybertek == BestSchool) {
				TotalNumber += 500;
			}
			if (Cybertek != BestSchool) {
				TotalNumber -= 50;
				System.out.println(TotalNumber);
			}
			
			byte PersonAge = 18;
			byte voteAge = 18;
			if (PersonAge > voteAge) {
				System.out.println("Yes you are eligible to vote");
				System.out.println("Have fun with building the wall");
				System.out.println("MAGA");
			}
			if (PersonAge < voteAge) {
				System.out.println("You are not eligible to vote yet, grow up");
				
			} else if (PersonAge == voteAge)
				System.out.println("Bi s..tir git");
			
			}
			
			String a1 = "Fatih ne yapiyorsun?";
			System.out.println(a1.charAt(9));
			
			
		
	}


		}
	}



