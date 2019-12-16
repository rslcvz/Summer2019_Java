package day43_JavaRecap;

public class Test {


	static int a;
	int b;
	public static void main(String[] args) {
		Test obj1 = new Test();
		obj1.b = 10;
		
		Test obj2 = new Test();
		obj2.b = 30;
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		System.out.println(obj1.a);
		System.out.println(a);
		System.out.println(obj2.a);
	}
	}


