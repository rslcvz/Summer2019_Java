package day22_NestedLoop;
import java.util.*;

public class AsiyaStringManupilation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");

		String name = input.nextLine();
		
		
		System.out.println(name.substring(0, 2));
		
		String a = "abc";
		String bc = a.substring(1);
		System.out.println(bc);
		System.out.println(a.substring(0, 1).toUpperCase());
		
	}

}
