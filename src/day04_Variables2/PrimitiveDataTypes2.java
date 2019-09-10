package day04_Variables2;

public class PrimitiveDataTypes2 {

	

		/*
		 Primitives: byte, short, int, long, float, double, boolean, char
		  
		  boolean: true - false
		  char: declared within the single quote ' '
		 */
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3;
		boolean result4 = 3 <= 3;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		char character1 = 'a';
		char character2 = '$';
		char character3 = '#';
		char char1 = 67;  // prints the character in the ASCII table.
		
		System.out.println(character1 * character2);
		System.out.println(character3);
		System.out.println(char1);
		
		char char5 = 'C'; // prints characters as it is
		
		char char6 = '{';
		char char7 = 123;
		System.out.println(char7); // prints the char that has the number of 123 in the ASCII table
		
		// initializing char to other primitives.
		
		char MyChar1 = 'b';
		int MyInt = 'b';  // the number that represent b is initialized to the int.
		System.out.println(MyInt);
		 byte MyByte2 = 'b';
		 System.out.println(MyByte2);
		 
		 short ShortNum2 = 'b';
		 System.out.println(ShortNum2);
		 
		 long LongNum = MyChar1; // long has 8 bytes
		 long LongNum2 = 'b'; // 98
		 System.out.println(LongNum);
		 
		 float floatNum = MyChar1;
		 float floatNum2 = 'b';
		 
		 System.out.println(floatNum2);
		 
		 double doubleNum = MyChar1;
		 double doubleNum2 = 'b';
		 System.out.println(doubleNum2);  // 98
		 
		 char myCharValue = 1453;
		 System.out.println(myCharValue);
		
		 double d = 300L;
	  
		 char resul = '$';
		 
	
		
		 
	}

}
