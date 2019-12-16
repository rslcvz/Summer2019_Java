package day50_Abstraction;

public abstract class Animal {
	
	public char Gender;
	public byte Age;
	public String color;
	public String Nickname;
	public double weight;
	
	public Animal (char Gender, byte Age, String color, String Nickname, double weight) {
		this.Gender= Gender;
		this.Age = Age;
		this.color = color;
		this.Nickname = Nickname;
	}
	
	public abstract void Speak();
	public abstract void eat();
	public abstract void Sleep();
}
	
	   
	    

//}
//public  getInfo() {
//	System.out.println("Name is " + Cleo.Nickname);
//	System.out.println("Gender is " + Cleo.Gender);
//	System.out.println("Color is " + Cleo.color);
//	System.out.println("Age is " + Cleo.Age);
//}
