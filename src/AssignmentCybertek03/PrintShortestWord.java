package AssignmentCybertek03;
import java.util.*;
public class PrintShortestWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(),scan.next(), scan.next(), scan.next()};
	    String shortest = "";
	    int min= 999999;
	    
	    for (int i = 0; i < str.length-1; i++) {
	    	if(str[i].length() < min) {
	    		min = str[i].length();
	    		shortest = str[i];
	    	}
			
		}
	    System.out.println(shortest);
	}

}
