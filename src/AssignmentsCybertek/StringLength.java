package AssignmentsCybertek;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");

		String str = input.next();
		if (str.length() == 1 ) {
			System.out.println(str + str +str);
		}
	}

}
