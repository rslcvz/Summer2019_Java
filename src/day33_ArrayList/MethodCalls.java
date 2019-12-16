package day33_ArrayList;

import java.util.ArrayList;

public class MethodCalls {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Resul");
		names.add("Mehmet");
		names.add("Ugur");
		names.add(2, "Fatih");
		names.set(1, "l");
		
		System.out.println(names);
	}

}
