package AssignmentsCybertek;

import java.util.Scanner;

public class SMSMessage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
	    String message = scan.nextLine();
	    String sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
	    String phoneNumber= message.substring(message.indexOf("[") + 1, message.indexOf("]"));
	    String messageBody= message.substring(message.indexOf("{") + 1, message.indexOf("}"));
	   
	  
	    
	     System.out.println("Sender: " + sender + "\rPhone Number: " + phoneNumber + "\rMessage body: " + messageBody);
	}

}
