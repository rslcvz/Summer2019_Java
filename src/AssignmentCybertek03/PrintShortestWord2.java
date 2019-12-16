package AssignmentCybertek03;
import java.util.*;
public class PrintShortestWord2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    String [] arr = str.split(", ");
	    int min = 9999999;
	    String shortest="";
	   Arrays.sort(arr);
	   String a="";
	   System.out.println(Arrays.toString(arr));
	    for (int i = 0; i < arr.length; i++) {
	    	if (arr[i].length() < min) {
	    		min = arr[i].length();
	    		shortest = arr[i];
	    		
	    		
	    	}
			
		}
	    System.out.println(shortest);
	   for (int i = 0; i < arr.length; i++) {
		if(shortest.length()==arr[i].length()) {
			a+=arr[i]+" ";
		}
	}
	   System.out.println(a);
	   
	   String [] arr1=a.split(" ");
	   System.out.println(Arrays.toString(arr1));
	}

}
