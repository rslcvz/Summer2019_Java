package day40_StaticKeyword;

public class StaticVariables {

	 static String name;
	 
	public static void main(String[] args) {
		StaticVariables obj1 = new StaticVariables();
		obj1.name = "Resul";
		StaticVariables.name = "R";

	
	}

}
