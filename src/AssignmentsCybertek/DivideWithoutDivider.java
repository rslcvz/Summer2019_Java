package AssignmentsCybertek;

public class DivideWithoutDivider {

	public static void main(String[] args) {

		int divident = 999; // bolunen
		int divisor = 5; // bolen

		int quotinent = 0; // bolum
		int remainder = 0; // kalan

		while (divident >= divisor) {

			divident = divident - divisor; // divident = 0

			quotinent++; // quotinent = 2
			remainder = divident; // remainder = 0

		}
	
		System.out.println("divident= " + divident + " divisor= " + divisor + " quotinent= " + quotinent
				+ " remainder= " + remainder);
	}
}