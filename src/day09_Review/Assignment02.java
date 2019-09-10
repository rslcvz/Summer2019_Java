package day09_Review;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println(" Enter a status code: ");
			
			int statusCode = input.nextInt();
			
			if (statusCode == 200) {
				System.out.println("OK");
			}else if (statusCode == 201) {
				System.out.println("Created");
			}else if (statusCode == 202) {
				System.out.println("Accepted");
			}else if (statusCode == 301) {
				System.out.println("Moved"); 
			}else if (statusCode == 303) {
				System.out.println("See Other");
			}else if (statusCode == 304) {
				System.out.println("Not Modified");
			} else if (statusCode == 307) {
				System.out.println("Temporary");
			}else if (statusCode == 400) {
				System.out.println("Bad Request");
			}else if (statusCode == 401) {
				System.out.println("Unauthorized");
			}else if (statusCode == 403) {
				System.out.println("Forbidden");
			}else if (statusCode == 404) {
				System.out.println("Not Found");
			}else if (statusCode == 410) {
				System.out.println("Gone");
			}else if (statusCode == 500) {
				System.out.println("Internal Server");
			}else if (statusCode == 503) {
				System.out.println("Service");
			} else  
			System.out.println("Unavailable");
	}

}
