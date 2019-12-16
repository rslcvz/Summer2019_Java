package AssignmentsCybertek;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = scan.nextLine();
		String reverse = "";
		
		if (str.length() == 5) {
		
		for (int i = str.length() - 1; i >= 0 ; i--) {
		
			
			reverse = reverse + str.charAt(i);
			
	}
	System.out.println(reverse);	
	
} else if (str.length() < 5) {
	System.out.println("Too short!");
} else if (str.length() > 5) {
	System.out.println("Too long!");
}
}
}

