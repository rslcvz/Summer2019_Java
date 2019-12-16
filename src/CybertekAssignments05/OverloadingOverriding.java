package CybertekAssignments05;

public class OverloadingOverriding {
	
	public void load() {
		final int b= 10;
		System.out.println("Override example");
		
	}
	public void load(int a){
		a=10;
		
	}

}
 class B extends OverloadingOverriding{
	 @Override
	 public void load() {
		 System.out.println("Doldur");
		 
		
		 
	 }
	 public static void main(String[] args) {
		
	}
	
}
