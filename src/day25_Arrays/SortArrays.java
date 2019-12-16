package day25_Arrays;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {

		int [] numbers = {9, 8, 100, 3000, 4, 5, 6} ;
		//System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("Makimum: " + numbers[numbers.length-1]);
		System.out.println("Minimum: " + numbers[0]);
		
		String [] nameList = {"Alma", "Enes", "Myra", "Smith", "Sarah", "Lexi"} ;
		Arrays.sort(nameList);  // alphabetical order. (From ASCII table)
		
		System.out.println(Arrays.toString(nameList));
		
		char [] ch = {'0', '9', '8', '5', '3', '2', '1' } ;
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		int [] nums = {2000, 90, 89, 78, 65, 5555, 444, -5} ;
		        Arrays.sort(nums);
		        System.out.println(Arrays.toString(nums));
		        System.out.println("Minumum number: " + nums[0]);
		        System.out.println("Maximum number: " + nums[nums.length-1]);
		        System.out.println("Second maximum number: " + nums[nums.length-2]);
		        System.out.println("Second minimum number: " + nums[1]);
		
		        int [] myNumbers = {99, 10, 200, 3000, 40, 50, 5000} ;
		        Arrays.sort(myNumbers);
		        System.out.println(Arrays.toString(myNumbers));
		        for(int i = myNumbers.length-1; i >= 0; i--) {
		        	System.out.print(myNumbers[i] + " ");
		        	
		        }
	}

}
