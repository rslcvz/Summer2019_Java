package AssignmentsCybertek;

import java.util.Scanner;

public class BuildARoute {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	  /*   String l = "left";
	    String r = "right";
	    String u = "up";
	    String d = "down";
	    String f = "found";
	    
	    
	    if (start.contains("A") && end.contains("B")) {
	    	System.out.println(r + end + f);
	    } else if (start.contains("A") && end.contains("C")) {
	    	System.out.println(r + " > " + d + " > " + end + f);
	    }else if (start.contains("A") && end.contains("D")) {
	    	System.out.println(r + " > " + d + " > " + l + " > " + end + f);
	} else if (start.contains("A") && end.contains("C")) {
    	System.out.println(r + " > " + d + " > " + end + f);   */
	    String route = "";
        for (int i = 0; i< 4; i++){
            
            if (start.charAt(0) + i > 'D') {        // if the target passed 'd' turns to 'a'and save
                route += (char)(start.charAt(0)-4 + i);
            }else {
                route += (char)(start.charAt(0) + i);// save the char on the route
            }
            if (route.charAt(route.length()-1) == end.charAt(0)) {  // if reached the target finish loop
                break;
            }
        }
        String routeL = "";            // we will save here the directions of the route
        if (route.length() > 1) {   // if the route isn't so long we may don't need direction
            for (int i = 0 ; i <= route.length()-2 ; i++ ) { // it will follows the route characters
                
                switch(route.charAt(i)) {
                case 'A':
                    routeL+="right";
                    break;
                case 'B':
                    routeL+="down" ;
                    break;
                case 'C':
                    routeL+="left";
                    break;
                default :
                    routeL+="up";
                }
                if (i != route.length()-2) {//if  it is not the last direction we will need ">" sign
                    routeL+= " > ";
                }else {
                    routeL += (": ");}
            }
        }
       // if there is only one char we should not need ">" and ":"
        routeL += route.charAt(route.length()-1)+" found";
        System.out.println(routeL);

}
}
