package AssignmentsCybertek;

import java.util.Scanner;

public class BuildRoadString {

	public static void main(String[] args) {

		
	    Scanner scan = new Scanner(System.in);
	    String start = scan.next().toUpperCase();
	    String end = scan.next().toUpperCase();
	    
	    String path = "ABCDABCD";
	    
	    String result = "";
	    String str = path.substring(path.indexOf(start.charAt(0)), path.indexOf(start.charAt(0))+4);
	    System.out.println(str);
	    
	    for(int i = start.indexOf(start.charAt(0)); i < path.length(); i++) {
	    	
	    	  
	        char temp = path.charAt(i);
	        
	        
	        if(temp == 'A'){
	          result +="right >";
	        } else if  (temp == 'B'){
	          result +="down >";
	        }else if(temp == 'C'){
	          result +="left >";
	        }else if(temp == 'D'){
	          result +="up >";
	        }
	    	
	    }
	    System.out.println(result);
	}

}
