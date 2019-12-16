package day50_Abstraction;

public class Zoo {
	
	public static void main(String[] args) {
		Cat Cleo =  new Cat('F', (byte)5,  "White & black", "Cleo", 4.6);
		System.out.println("Name is " + Cleo.Nickname);
		System.out.println("Gender is " + Cleo.Gender);
		System.out.println("Color is " + Cleo.color);
		System.out.println("Age is " + Cleo.Age);
		
		System.out.println("************************************************");
		
		Cat ben = new Cat('Z', (byte)12, "Zuzu", "White", 4.6);
		System.out.println(Cleo.color);
		System.out.println(ben.Nickname + " " + ben.weight);
		
		
	}

}
