package AssignmentsCybertek;

import java.util.Scanner;

public class BuildRoad {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String start = scan.next().toUpperCase();
    String end = scan.next().toUpperCase();
    
    String result = "";
    
    for(int i = start.charAt(0); i < end.charAt(0); i++){
      
      char temp =(char) i;
      
      
      if(temp == 'A'){
        result +="right >";
      } else if  (temp == 'B'){
        result +="down >";
      }else if(temp == 'C'){
        result +="left >";
      }else if(temp == 'D'){
        result +="up >";
      }
      
      result +=" ";
    }
    
    result += " found " +end;
    
    System.out.println(result);
    
  
}
}
