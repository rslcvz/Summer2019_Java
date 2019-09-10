package day09_Review;

public class Review {

	public static void main(String[] args) {

		/*
		 > :
		 >=:
		 <=:
		 ==:
		 !=
		 
		 logical operators:
		 &&:
		 ||:
		 */
		System.out.println('Z' > 'A');  // true
		System.out.println('Z' >= 'A');  // true
		System.out.println('a' > 'A');  // true
		
		char ch1 = 123;
		System.out.println(ch1);
		
		System.out.println('A' <= 'A');
		System.out.println('A' <= 'a');
		//                  65 <=  97
		
		byte X = 10;  int Y = 10;
		System.out.println(X == Y);  // true
		
		System.out.println(false == false); // true
		System.out.println(!(false != true));  // false
		
		System.out.println(true == true && false != true);  // true
		
		System.out.println(true != true || false == true);  // false
		//                     false          false
		
		System.out.println("Monday" == "Funday" || true != false);  // true
		//                      false               true
		
		
	}

}
