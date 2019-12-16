package day40_StaticKeyword;

public class StaticKeyword {
	
	int b = 109;
	
	// You can access any static through the class name.
public static int Resul(int a) {
	
	return a;
	
}
static class A extends StaticKeyword{
	
}
public static void main(String[] args) {
	StaticKeyword obj = new StaticKeyword();
	obj.b = obj.b;
	StaticKeyword.Resul(10);
	System.out.println(obj.b);

}
}

