package Day10_ifStatement;

public class Practice_01 {

	public static void main(String[] args) {

int grade= 90;
		
		if (grade >= 90) {
			System.out.println("You made A");
		} else if (grade < 90 && grade >= 80) {
			System.out.println("You made B");
		} else if (grade < 80 && grade >= 70) {
			System.out.println("You made C");
		} else if (grade < 70 && grade >=60) {
			System.out.println("You made D");
		} else 
			System.out.println("You made F");
	}

}
