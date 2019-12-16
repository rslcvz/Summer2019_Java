package AssignmentCybertek03;
import java.util.*;
public class ReverseArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 7 numbers");
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    for (int i = 0; i < nums.length/2; i++) {
			int temp = nums[i];
			 nums[i] = nums[nums.length-(i+1)];
			 nums[nums.length-(i+1)] = temp;
		}
	    
	    System.out.println(Arrays.toString(nums));
	    
	    
	}

}
