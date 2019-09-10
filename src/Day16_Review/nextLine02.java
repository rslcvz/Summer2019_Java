package Day16_Review;

import java.util.Scanner;

public class nextLine02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your zip code");
		
		int zipCode = input.nextInt();
		input.nextLine();
		
		System.out.println("Please enter your city name");
		String cityName = input.nextLine();
		
		System.out.println("zip code is" + zipCode);
		System.out.println("city name is" + cityName);
		
		System.out.println("Enter your phone number");
		int pn = input.nextInt();
		
		input.hasNextLine();
		System.out.println("Enter state name");
		String stateName = input.nextLine();
		
		
		
		
	}

}
