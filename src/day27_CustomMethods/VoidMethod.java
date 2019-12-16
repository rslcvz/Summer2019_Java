package day27_CustomMethods;

public class VoidMethod {

		/*
		 Declaration of method:
		 access-modifier specifier return-type  methodname()  {}
		 */
	public static void main(String[] args) {
		myFirstMethod();
		even1To100();
		
		
	}
	public static void even1To100() {
		for (int i=0; i < 100; i++) {
			if ( i %2 != 0)  {
				continue;
				
			}
		}
			
		
	}
	
	
		public static void myFirstMethod() {
			
			System.out.println("Hello World");
			System.out.println("Hello Cybertek");
			System.out.println("Hello Bota");
		}
	}


