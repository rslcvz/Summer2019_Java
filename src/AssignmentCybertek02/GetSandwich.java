package AssignmentCybertek02;
import java.util.*;

public class GetSandwich {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int count=0;
	     for (int i=0; i < str.length()-4; i++){
	       if (str.substring(i, i+5).equals("bread")){
	    	   count++;
	}

}
	     if (count >= 2) {
	    	 System.out.println(str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")));
	    	 
	     }else {
	    	 System.out.println("Nothing");
	     }
}
}