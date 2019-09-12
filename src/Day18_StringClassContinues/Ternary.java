package Day18_StringClassContinues;
import java.util.*;

public class Ternary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x value");
 
		 int x = input.nextInt();
		 int y = (x >=5 ? x : x < 5 ? -x : 5);
		 System.out.println(y);
		 
	}

}
