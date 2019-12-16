package AssignmentCybertek02;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //TODO: Type your code below
	    String[] array = sentence.split(" ");
	    Arrays.toString(array);
	    
	    for (int i = array.length-1; 0 <= i ; i--) {
	      System.out.println(array[i]);
	}

}
}