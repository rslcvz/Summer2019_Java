package Day10_ifStatement;

public class Nested_If_Statements {

	public static void main(String[] args) {

	/*	if (true) {
				System.out.println("Hello Cybertek");
				if (false) {
					System.out.println("Hello world");
				} else {
					System.out.println("Hello team SDET");*/
		
		int grade = 60;
		if(grade >= 60) {
			System.out.println("Passed");
			if (grade >= 90 && grade <= 100) {
				System.out.println("\twith an A");
			} else if (grade >= 80 && grade < 90) {
				System.out.println("\t with a B");
			} else if (grade >= 70 && grade < 80) {
				System.out.println("\t with a C");
			} else {
				System.out.println("\t with a grade of D");
			}
		}   
				}
			
		}
	


