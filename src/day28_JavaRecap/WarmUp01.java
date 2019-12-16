package day28_JavaRecap;

import java.util.Arrays;

public class WarmUp01 {

public static void main(String[] args) {
	
	//KmToMiles();     not enough info 
	
	KmToMiles(1000);    // 1000.0-because its double
	GallonToLitter(85.5);
	int[] arr = {0, -1, 1000, 2000, 5000};
SortDes(arr);
}
public static void SortDes(int[] array) {
	
	Arrays.sort(array);
	for (int i=array.length-1; i >=0;  i--) {
		System.out.println(array[i] + " ");
}
}
public static void GallonToLitter(double gallons) {
	double liters = gallons * 3.75;
	System.out.println(gallons + " gallons equal to " + liters + "liters");
	
}
	public static void KmToMiles(double KM) {
		double Miles = KM * 0.612;
		System.out.println(KM + "km equals to miles");

	
	}	
	}


