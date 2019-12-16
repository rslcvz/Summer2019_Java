package day34_Cunstuctors;
 class Calc {
	
	public int a ;
	public int b ;
	public String c ;
	
	Calc(int a, int b, String c){
		a=10;
		b= 20;
		c="Resul";
		
	}

	public static void A() {
		System.out.println("hele sen ne diysen");
		
	}
	public static void B() {
		System.out.println("Diiiiiseeeennnn");
	}
}
 class Deli{
	 public static void main(String[] args) {
		Calc obj = new Calc(10, 20, "Resul");
		System.out.println(obj.c);
				
	}
	 
	 
 }