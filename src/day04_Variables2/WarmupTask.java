package day04_Variables2;

public class WarmupTask {

		/*
		 1.Cucumber     => 2.5$  => float or double
		 2.Tomato       => 2$
		 3.Onion        => 1.5$  => float or double
		 4.Green pepper => 24
		 5.Carrots      => 4$
		 */
		public static void main(String[] args) {
			float Cucumber = 2.5f;   // float cannot contain double
			double Cucumber2 = 2.5f;   // double can contain float.
			double Cucumber3 = 2.5;
			
			float Onion = 1.5F;
			double Onion2 = 1.5;
			
			byte GreenPepper = 2;
			short GreenPepper2 = 2;
			int GreenPepper3 = 2;
			long GreenPepper4 = 2;
			float GreenPepper5 = 2L;  // If you are giving decimal number, you need to add F or f
			double GreenPepper6 = 2;
		
			System.out.println(GreenPepper);
			System.out.println(GreenPepper2);
			System.out.println(GreenPepper3);
			System.out.println(GreenPepper4);
			System.out.println(GreenPepper5);   // double and float converts the whole number to Decimal.
			System.out.println(GreenPepper6);

}
}