package day20_JavaRecap;
import java.util.*;

public class StringMethods {

	public static void main(String[] args) {

	/* 	String str = "Cybertek School";
		String x = str.substring(0, 9);
		System.out.println(x);
		
		
		String s1 = "Java is a fun language, I love Java";
		System.out.println(s1.indexOf("ua"));
		
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.lastIndexOf("ava"));
		
		//replace:replaces old value with new one
		
		
		String name = "Cybertek School Batch 12";
		int length = name.length();
		System.out.println(length);
		
		name = name.replace(" ", "");
		System.out.println(name.length());
		
		name = name.replace("e", "a");
		System.out.println(" " + name);
		
		String R1 = "Cybertek";
		String R2 = new String ("Cybertek");
		String R3 = new String ("cybertek");
		
		System.out.println(R1 == R2);    // false,    different location
		System.out.println(R1.equals(R2));   // true,    visible text are same
		System.out.println(R1.equals(R3));   //  false, case sensitivity
		
		System.out.println(R1.compareToIgnoreCase(R2));
		
		String c2 = "Please do more and more java practices tomorrow";
		char ch2 = c2.charAt(c2.lastIndexOf("o") + 1);
		System.out.println(ch2);
		
		//first and last character
		String sentences = "Tomorrow, we do not have class";
		System.out.println(sentences.charAt(sentences.length() - 1));
		
		String result = "" + sentences.charAt(0) + sentences.charAt(sentences.length() - 1);
		System.out.println(result);
		
		//     startWith & endsWith: returns boolean, checks the starting and ending character
		
		Scanner input = new Scanner(System.in);
		
		String gmail = "cybertekSchool@gmail.com";
		boolean R = gmail.endsWith("@gmail.com");
				System.out.println(R);
				
				System.out.println("Enter a Web Address: ");
				String URL = input.nextLine();
				
				if (URL.startsWith("www.") && URL.endsWith(".com")) {
					System.out.println("its a valid web address");
				} else {
					System.out.println("its invalid ");
					
				}                                               
				
		        String salary = "1000$";
			    boolean result = salary.contains("$");     // true
				System.out.println(result);                           */
		
		// concat: Concates two String values:
		String schoolName = "Cybertek";
		schoolName = schoolName.concat(" School");
		System.out.println(schoolName);
		
		
				
	}

}
