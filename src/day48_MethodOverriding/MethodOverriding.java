package day48_MethodOverriding;

class student {
	public void printName() {
		System.out.println("Nadire");
	}
	
}

public class MethodOverriding extends student{
	//        sub class             super class
	
	public void print(String str)   {
		
	}
	
	public void print(double a ) {
		
		
	}
	public void printName() {
		System.out.println("Shukran");
	}
	public static void main(String[] args) {
		student obj2 = new student();
		obj2.printName(); // Hakan
		
		MethodOverriding obj = new MethodOverriding();
		obj.printName();   // shukran
	}
	
	
	

}
