package day17_StringClass;

public class StringMethod_02 {

	public static void main(String[] args) {

		String str1 = "Java is Fun Programming Language";
		str1 = str1.replace('a' , 'e');
		
		System.out.println(str1);
		
		String str2 = "Today is gonna be a great day to learn Java";
		str2 = str2.replace("Today", "Tomorrow");
		System.out.println(str2);
		
		String s1 = "Java is fun, Java is good";
		s1 = s1.replaceFirst("Java", "Python");
		System.out.println(s1);
		
		s1 = s1.replace('s', 'S');
		s1 = s1.replace('g', 'G');
		System.out.println(s1);
		
		String s2 = "Java is programming language, Java is Java";
		
		s2 = s2.replaceFirst("Java", "C#");
		System.out.println(s2);
	}

}
