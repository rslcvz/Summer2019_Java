package day44_AccessModifiers;
import static day44_AccessModifiers.TestData.*;
//                   packageName - className  -StaticName

public class Test {
	
	public static String Name = "Resul";

	public static void main(String[] args) {
		
		System.out.println(Name);
		System.out.println(TestData.Name);
		System.out.println(ID);
		System.out.println(schoolName);
		
        printHello();
        DefaultAccessModifier obj = new DefaultAccessModifier();
        System.out.println(obj.namePublic);
        System.out.println(obj.namePrivate);
        

	}
}
