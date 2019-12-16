package day29_ReturnMethods;

public class ReturnMethod {
public static void main(String[] args) {
	

	name();
	System.out.println(name());
	String str = name();
	System.out.println(str);
	
}
public static boolean result() {
	return 8 > 9;

}
	
	
	
	public static void method1() {
      System.out.println("Hello");
      return;
		
	}
		
	
	
	public static String name() {
		return "batch12";
	}

}
