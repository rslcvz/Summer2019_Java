package Day13_Review;

import java.util.Scanner;

public class Assignments {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers");

		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is biggest number");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is the biggest number");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("n3 is the biggest number");

		} else if (n1 == n2 && n2 > n3) {
			System.out.println("n1 and n2 are bigger numbers");
		} else if (n2 == n3 && n2 > n1) {
			System.out.println("n2 and n3 are bigger numbers");
		} else if (n1 == n3 && n1 > n2) {
			System.out.println("n1 and n3 are bigger numbers");

		} else if (n2 == n1 && n1 == n3) {
			System.out.println("All numbers are same");

		}
	}
}
