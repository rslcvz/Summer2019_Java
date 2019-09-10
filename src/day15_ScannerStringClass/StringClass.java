package day15_ScannerStringClass;

public class StringClass {

	public static void main(String[] args) {

		String str = "Cybertek";
		String A = "Cybertek";
		String B = "Cybertek";
		
		System.out.println(A == B);
		String str2 = new String("Cybertek");
		System.out.println(str == str2);
		
		String str3 = new String("Cybertek");
		System.out.println(str2 == str3);
		
		String s1 = "cat";
		String s2 = "cat";
		
		String s3 = new String("cat");
		String s4 = new String("cat");
		System.out.println(s3 == s4);     // different memory location.
		
		String a = "Batch12";
		String b = "batch12";
		System.out.println(a == b);   // different memory , (Java is case sensitive)
		
	}

}
