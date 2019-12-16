package CybertekAssignments05;

abstract class quiz13 {
	
	abstract void methodA() {
		
	}
	
	abstract class B extends quiz13;
	
	public void methodA() {
		System.out.println("Resul ");
	}
	public abstract void methodB();
	
	
}
public final class C extends B {
	@Override
	public void methodB(){
		System.out.println("Mehmet");
		
	}
}
