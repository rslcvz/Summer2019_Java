package AssignmentsCybertek;

import java.util.Scanner;

public class AssginmentPersonalInfo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	     System.out.println("Welcome to the patient portal!");
	     System.out.println("Please enter your personal information");
	     System.out.println("Enter your first name");
	     String firstName = scan.nextLine();
	    
	     System.out.println("Enter your last name");
	     String lastName = scan.nextLine();
	     
	     System.out.println("Enter your email");
	     String email = scan.nextLine();
	     
	     System.out.println("Enter your street");
	     String street = scan.nextLine();
	     
	     System.out.println("Enter your city");
	     String city = scan.nextLine();
	     
	     System.out.println("Enter your state");
	     String state = scan.nextLine();
	     
	     System.out.println("Enter your zipcode");
	     int zipcode = scan.nextInt();
	     
	     System.out.println("Enter your work phone number");
	    long workPhoneNumber = scan.nextLong();
	    
	    System.out.println("Enter your personal phone number");
	     long personalPhoneNumber = scan.nextLong();
	     
	     System.out.println("Enter your age");
	     int age = scan.nextInt();
	     
	     System.out.println("Enter your height");
	     double height = scan.nextDouble();
	     
	     System.out.println("Enter your weight");
	     double weight = scan.nextDouble();
	     
	     System.out.println("Are you married?");
	     boolean isMarried = scan.nextBoolean();
	     
	     String contacts = "Contacts: work phone number - " + workPhoneNumber + ", personal phone number -\n " + personalPhoneNumber + ", email: " + email;
	     String fullName = firstName + ", " + lastName;
	     String address = "Adress: " + street + ", " + city + ", " + state + " " + zipcode;
	     
	     System.out.println("Patient personal information\n" + "Full name: " 
	     + fullName + "\n" + address + "\n"  
	          + contacts + "\nAge: " + age + "\nHeight: " + height 
	          + "\nWeight: " + weight + " pounds " + "\nMarried?: " 
	          + isMarried);
	     
	}

}
