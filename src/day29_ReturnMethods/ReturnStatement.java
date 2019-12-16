package day29_ReturnMethods;

public class ReturnStatement {

	public static void main(String[] args) {
        
		System.out.println("Hello");
		for (int i=0; i < 5; i++) {
			if(i == 3)  {
				break;
			}
			System.out.println(i);
		}
		if (true) {
			return;
		}
		System.out.println("Hello");
	}

}
