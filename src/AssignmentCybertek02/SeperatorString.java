package AssignmentCybertek02;

import java.util.Scanner;

public class SeperatorString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();

		for (int i = 0; i < count; i++) {
			if (i < count - 1) {
				System.out.print(word + separator);
			} else {
				System.out.println(word);
			}
	}
	}
}
