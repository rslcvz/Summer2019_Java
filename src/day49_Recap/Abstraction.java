package day49_Recap;

public abstract class Abstraction {
	
	public abstract void startTheCar();
		
	
	}
class Toyota extends Abstraction{
	
	public void startTheCar() {
		System.out.println("Brake");
		System.out.println("Push the start button");
		System.out.println("Release the break");
	}
	public static void main(String[] args) {
		
		//   Abstraction  obj  =  new Abstraction();
	}
}
class Tesla extends Abstraction () {
	
	public void startTheCar() {
		
	}
	
}


