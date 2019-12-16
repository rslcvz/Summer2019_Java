package day32_JavaReview;

public class ParseMethod {

	public static void main(String[] args) {

		short s1 = Short.parseShort("1234");
		System.out.println(s1 + 1);
		
		double d1 = Double.parseDouble("78.5");
		Double d2 = Double.parseDouble("78.5");
		System.out.println(d1);
		System.out.println(d2);
		
		Integer num = Integer.valueOf("123");
		System.out.println(num);
		
		int num2 = Integer.valueOf("123");  // un-boxing
		byte num3 = Byte.valueOf("12");
		Boolean.valueOf("true");
		boolean R1 = Boolean.valueOf("123213");
		System.out.println(R1);
	}

}
