package day20_JavaRecap;
import java.util.*;

public class WarmUp02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 1;  i <= 5;  i++) {
		
		System.out.println("Enter your number:");
		int inputNum = input.nextInt();
		sum += inputNum;

		
	}
System.out.println("Sum is: " + sum);   // sum is 55
} 
}
