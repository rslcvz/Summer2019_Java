package day23_Arrays;

public class ArraysClass {

	public static void main(String[] args) {

	
		      int  []  arr  =  {1, 2};
		// data type  variable
		      String[] names = {"Nigar", "Sumeyya", "Madina", "Juline"};
		      //                   0          1        2          3
		      
		      System.out.println(names[3]  + " " + names[1] );
		      
		      String str1 = names[2];
		      String str2 = names[2];
		      System.out.println(str1 + " " + str2);
		      System.out.println(names[3]);
		      
		      double [] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
		      //                   0  1  2  3  4  5  6  7
		      
		      for (int i=0;   i < 8; i++) {
		    	  System.out.print(myArray[i] + " ");
		
	}
		      System.out.println();
		      // length of Array
		      
		      String str = "ABC";
		        int A =  str.length();
		        System.out.println(A);
		           int [] numbers = {12, 24, 38, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		           int B = str.length();
		           System.out.println(B);
		           int highestIndexNum = numbers.length -1;      // 13
		           System.out.println(highestIndexNum);    
		           
		           for (int i =0;  i  < numbers.length; i++)  {
		        	   int s1 = numbers[i];
		        	   System.out.print(s1 + " ");
		        	   
		           }
		           System.out.println();
		           
		           char []   myChars = {'A', 'B', 'C', 'D'};
		           int highestIndexNum2 = myChars.length - 1;
		           System.out.println(highestIndexNum2);
}
}
