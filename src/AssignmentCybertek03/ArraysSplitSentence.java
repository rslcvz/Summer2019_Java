package AssignmentCybertek03;
import java.util.*;
public class ArraysSplitSentence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
     	    String [] arr = sentence.split(" ");
     	    for(String each : arr) {
     	    	System.out.println(each);
		}
	}

}
