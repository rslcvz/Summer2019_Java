package day53InterfaceContiniue;

public interface Interface_Vs_AbstractClass {
	
	static int num = 300;
	
	
	 public abstract void method1();
	 public abstract void method2();
	 
	 public void method3();
	 
	 public void method4();
	 
	 public default void mm() {
		 
	 }
	 
	 int a = 10;
	 public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Interface_Vs_AbstractClass.a);
	}
	 
	abstract void method5();
	 
}
abstract class Test implements Interface_Vs_AbstractClass{

	@Override
	public void method1() {
		
		
	}

	@Override
	public void method2() {
		
		
	}

	@Override
	public void method3() {
		
		
	}

	@Override
	public void method4() {
		
		
	}
	
	
}
