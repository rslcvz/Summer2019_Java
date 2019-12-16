package day31_JavaReview;

public class ArrayReviews {

	public static void main(String[] args) {

		int num = 10; 
		int [] arr = { 10}; // array has size of one
		
		int [] arr2 = new int[2];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		// System.out.println(arr2[2]);  // out of boundary
		
		String[] cars = new String[5];  // this array can contain 5 string values
		cars[4] = "Subaru ";
		cars[2] = " Toyota";
		cars[1] = " Audi ";
		cars[3] = " Jeep ";
		cars[0] = " Tesla ";
		for (int i = 0; i < cars.length-1; i++) {
			System.out.print(cars[i] + " ");
			
		}
	
	}

}
