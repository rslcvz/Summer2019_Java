package day60_ExceptionsReview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WarmUp {

	public static void main(String[] args) {

		try {
			// FileInputStream file = new FileInputStream("path of file");
			Thread.sleep(3000);
			System.out.println("Try block");
		} catch (InterruptedException e) {
			System.out.println("catch block");

		}
		System.out.println("===================================================================");

		try {
			System.out.println(9 / 0);
			System.out.println("Next test step");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);

		}
		System.out.println("Oldu mu");
		System.out.println("********************************************************************");
		
		int [] arr = {1, 2, 3};
		try {
		System.out.println(arr[200]);
	}catch(NullPointerException  e) {
		System.out.println(1);
		
	}catch(ArrayIndexOutOfBoundsException  e) {
		System.out.println(2);
		
	}catch(Exception e) {
		System.out.println(3);
		
	}
}
	
	public static void method() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void method2() {
		try {
	}finally {
		
	}
}
}
