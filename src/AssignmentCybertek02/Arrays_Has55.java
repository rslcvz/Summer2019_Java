package AssignmentCybertek02;
import java.util.*;
public class Arrays_Has55 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	 boolean ans = false;
	for (int i = 0; i < nums.length-1; i++) {
		if((nums[i] == 5) && (nums[i + 1]  ==5)) {
				
		ans = true;
	
	}
	
	}
	System.out.println(ans);
}
}
	
	
	



