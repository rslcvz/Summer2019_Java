package AssignmentCybertek03;
import java.util.*;
public class PrintFirstLastChar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    String[] arr = new String[5];
	    for (int i = 0; i < words.length; i++) {
	    	arr[i] = (words[i].charAt(0)+""+ words[i].charAt(words[i].length()-1));
			
		}
	    System.out.println(Arrays.toString(arr));
	}

}
