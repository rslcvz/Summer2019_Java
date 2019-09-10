package day03_Variables;

public class PrimitiveDataTypes {

	
		
		/*
		 byte;  
		 
		
		 */
		
    public static void main(String[] args) {
    	byte length = 3;
    	System.out.println(length);
    	byte WidthAndLength = 4;
    	System.out.println(WidthAndLength);
    	// Variable names cannot be Java reserved words.
    	
    	//byte public = 4; you cannot use Java based words
    	byte Public = 3;
    	//byte myNum1 = -129; // out of the range
    	byte myNum2 = 127;
    	
    	short _num2 = 100;
    	int num4 = -100_000_000;
    	
    	long longNumber = 10;
    	int intNumber = 10;
    	
    	byte byteNumber = 10;
    	short shortNumber = 10;
    	
    	//byte byteNumber1 = shortNumber; //bigger data types cannot be given to the smaller ones
    	
    	short shortNumber1 = byteNumber;  //smaller data types can be given to bigger data types
    	
    	float exampleNum2 = 10.5F; 
    			
        double doubleNumber = 10.5;
        
       // float floatNumebr = doubleNumber;  // You cannot assign it because double is bigger than float.
        
        byte bNum = 10;
        short sNum = 20;
        int iNum = 30;
        long lNum = 40;
        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);
        
        
        float fNum = bNum;
        float fNum2 = sNum;
        float fNum3 = iNum;
        float fNum4 = lNum;
        
        System.out.println("=====================================");
       
        System.out.println( fNum);
        System.out.println( fNum2);
        System.out.println( fNum3);
        System.out.println(fNum4);
        
        System.out.println("======================================");
        
        double dNum = bNum;
        double dNum2 = sNum;
        double dNum3 = iNum;
        double dNum4 = lNum;
        
        System.out.println(dNum);
        System.out.println(dNum2);
        System.out.println(dNum3);
        System.out.println(dNum4);
    	
    	
		
	}

}
