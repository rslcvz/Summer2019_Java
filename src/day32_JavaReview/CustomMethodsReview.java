package day32_JavaReview;

public class CustomMethodsReview {

	//public static void main(String[] args) {

		/*
		 Declaration of methods:
		 Access-modifiers specifier return type methodName (parameter){
		 method body
		 Access modifier: public
		 Specifier: static
		 return-type: void, all primitives and non primitives
		 */
		public static void main(String[] args) {
			for (int i = 0; i < 5; i++) {
				
			
			method1();
			}
			oneTo100Even();
		}
		public static void method1() {
			System.out.println("Hello WoRld");
			System.out.println("Hello cybertek");
			System.out.println("Hello Batch12");
			
		}
		public static void oneTo100Even() {
			for (int i = 1; i <= 100; i++) {
				if(i % 2 == 1) {
					continue;
				}
				
				System.out.print(i + " ");
				
			}
		}
	}



