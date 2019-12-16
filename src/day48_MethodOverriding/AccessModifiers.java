package day48_MethodOverriding;
class Mahribana{
	
	public void methodA() {   // the method we are gonna override has to be inheritable
		System.out.println("Method A");
	}
}
public class AccessModifiers extends Mahribana {
	@Override
	public void methodA() {
		System.out.println("Method A");
	}

}
