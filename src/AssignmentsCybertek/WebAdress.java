package AssignmentsCybertek;

import java.util.*;

public class WebAdress {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a URL: ");
		String url = input.nextLine();
		String dot = url.charAt(url.length() - 4) + "";
		String extension = url.substring(url.length() - 3);
		String domain = url.substring(4, url.length() - 4);

		if ((url.contains("com") || (url.contains("net") || url.contains("edu"))) && (url.startsWith("www.") && dot.equals("."))) {
			
				System.out.println("Congratulations! You have entered a valid URL");
				System.out.println("Extension: " + extension);
				System.out.println("Domain: " + domain);
			
		} else {

			System.out.println("You have entered an invalid URL. Please enter a valid URL");
		}
	}
}
