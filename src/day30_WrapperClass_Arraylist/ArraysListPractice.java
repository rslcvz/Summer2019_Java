package day30_WrapperClass_Arraylist;

import java.util.*;

public class ArraysListPractice {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("Homayra");
		nameList.add("Apple");
		System.out.println(nameList);
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> studentsNames = new ArrayList<>();
		
		while(true) {
		System.out.println("Enter a name");
		String name = scan.nextLine();
		studentsNames.add(name);
		
		System.out.println("Do you want to add another name");
		String answer = scan.nextLine().toLowerCase();
		if(!(answer.equals("yes") || answer.equals("no"))) {
			System.out.println("Invalid!");
			break;
		}
		if (answer.equals("no")) {
			break;
		}
		
	}
		System.out.println(studentsNames);

}
}

