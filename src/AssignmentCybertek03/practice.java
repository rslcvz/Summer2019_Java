package AssignmentCybertek03;

public class practice {
	public static void main(String[] args) {

		int x = 5;
		int y = 6;

		System.out.println(test(x, y));

	}

	public static int test(int a, int b) {

		if (a == b) {
			System.out.println("equals");
			return b + 2;
		} else {
			
			System.out.println("not equals");
		
		return -100;}
			
		System.out.println("after equals method");

		return b-5;
	}

}
