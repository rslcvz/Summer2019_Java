package day17_StringClass;

import java.util.*;

public class StringMethod {

	public static void main(String[] args) {

        /*  String str1 = "Hello Javengers";
        String str2 = "Hello Javengers";
        boolean r1 = str1 == str2;     // true
        
        System.out.println(r1);
        
        String str3 = new String ("Hello Javengers");
        String str4 = new String ("Hello Javengers");
        boolean r2 = str3 == str4;
        System.out.println(r2);   // false  (Different memory location).
        
        boolean r3 = str1 == str3;
        System.out.println(r3);  // false (Different memory location).   
		
		String a = "Cybertek";
		a.concat("School");   // "Cybertek School"
		
		System.out.println(a);
		
		a = a.concat(" School");
		System.out.println(a);
		
		String A = "hello", B = "hello ";
		System.out.println(A == B);
		
		String C = "Hello",  D = "hello";   // java is case sensitive
		System.out.println(C == D);
		
		String longName = "hdiujbdjbdjbdojndokjndojndjnd";
		longName.length();
		System.out.println(longName.length());    
		
		String name2 = "cybertek";
		name2.toUpperCase();
		System.out.println(name2);   // "cybertek" because String is immutable
		name2 = name2.toUpperCase();
		System.out.println(name2);   // "CYBERTEK"
		
		String name3 = "CYBERTEK";
		name3.toLowerCase();
		System.out.println(name3);  // does not change
		name3 = name3.toLowerCase();
		System.out.println(name3);   // it does change   
		
		String s1 = "                      hello";
		s1.trim();
		System.out.println(s1);
		s1 = s1.trim();
		System.out.println(s1);
		
		String s2 = "Cybertek          School";
		s2 = s2.trim();
		System.out.println(s2);
		
		String s3 = "  ";
		s3 = s3.trim();
		System.out.println(s3);
		
		
		String s4 = "        Cybertek      School";   
		s4 = s4.trim();
		System.out.println(s4); //  "Cybertek      School"  only trims the first unused space    */
		
		String str = "Cybertek School";
		str = str.substring(2);
		System.out.println(str);
		
		String address = "Mclean VA 22000";
		String zipcode = address.substring(10);
		System.out.println(zipcode);   // 22000
		
		String name = "Hello Cybertek School";
		name = name.substring(6, 14);
		System.out.println(name);
		
		String fullName = "Cybertek School Batch12";
		String middleName = fullName.substring(9, 15);
		System.out.println(middleName);       // School
		
		
        
		
	}

}
