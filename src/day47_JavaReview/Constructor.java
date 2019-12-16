package day47_JavaReview;

class Mehmet {
	public Mehmet() {
		System.out.println("Mehmet");
		
	}
}
class Resul extends Mehmet {
	public Resul() {
		System.out.println("Resul");
	}
	
}
class Viktoria extends Resul {
	public Viktoria() {
		System.out.println("Viktoria");
	}
}

public class Constructor {
	public static void main(String[] args) {
		
		Resul obj = new Resul();
		
	}

}
