package day26_ForEach;

public class ThreeDimensionalArray {

	public static void main(String[] args) {

		int [][] num2D = {{1,2}, {3,4} } ;
		int [][][] num3D = { { {1,2}, {3,4}}, {{5,6}, {7, 8}}};
		
		for (int [][] each2DArray : num3D) {
			
			for (int [] each1DArray : each2DArray) {
				for (int eachValues : each1DArray) {
					System.out.println(eachValues);
				}
			}
			
		}
	}

}
