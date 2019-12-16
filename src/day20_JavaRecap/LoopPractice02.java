package day20_JavaRecap;
import java.util.*;

public class LoopPractice02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int sum = 0;
		for (int i = 1; i <= 5; i++)  {
			
			System.out.println("Enter your number 5 times: ");
			int imputNum = input.nextInt();
			sum += imputNum;
		}
		System.out.println(sum);
	}

}
