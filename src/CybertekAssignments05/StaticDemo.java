package CybertekAssignments05;

class Emp{
	
	int id;
	int salary;
	static String ceo;
	char gender;
	String team;
	
	static {    // will be executed when you load a class
		
		ceo = "Bota";
		System.out.println("Thats Static");
	}
	
	public Emp() {    //  This constructor will be executed when you create an object.
		id = 1;
		salary = 3000;
		gender = 'M';
		team = " Galatasaray";
		
		System.out.println("Thats constructor");
		
	}
	public void show() {
		System.out.println(id + " : " + salary + " : " + ceo);
	}
	
}

public class StaticDemo {
	static int i = 10;
	
	
	public static void main(String[] args) {
		Emp navin = new Emp();
		
        i =0;
        System.out.println("Non static example:  " + i);
		
		
		Emp rahul = new Emp();
		Emp ali = new Emp();
		Emp aliye = new Emp();
		
		navin.show();
		rahul.show();
		System.out.println(Emp.ceo + " " + rahul.gender + " " + rahul.id + " "+ rahul.salary + " " + rahul.team + " ");
		}
	}

