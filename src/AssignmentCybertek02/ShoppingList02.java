package AssignmentCybertek02;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import day26_ForEach.ContinueStatement;

public class ShoppingList02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 0;
		double totalPrice = 0;
		String item1[] = new String[10];
		double price1[] = new double[10];
		double total = 0;

		do {
			System.out.println("Enter Item" + (count+1) + " and its price: ");
			item = scan.nextLine();
			item1[count] = item;
			price = scan.nextDouble();
			price1[count] = price;
			total += price;
			count++;
			System.out.println(item + price);
			System.out.println("add one more item?");
			countinue = scan.nextLine();

		} while (scan.nextLine().equalsIgnoreCase("Yes"));

		for(int i = 0; i < item1.length; i++) {
			if(item1[i]==null) {
				break;
			}
			System.out.print(" Item"+ (i+1)+" " + item1[i] +" " + price1[i]  );
		}
		System.out.print("\n" +"Total price: " +total);
	}

}
