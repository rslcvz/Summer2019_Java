package AssignmentCybertek02;
import java.util.*;
public class ReverseSentence2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    
	    String[] array = sentence.split(" ");
		    Arrays.toString(array);
		    
		    
		    for (int i = array.length-1; 0 <= i ; i--) {
		      sentence = sentence.substring(0, sentence.length()-2);
	reversed = array[i] + " " ; 
	    //End your code here. do not modify below statement
	sentence = sentence.substring(0, sentence.length()-2);
	 System.out.print(reversed);
	}
		   
}
	
}
