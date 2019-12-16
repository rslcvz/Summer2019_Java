package day48_MethodOverriding;

public class Bank {
	
	public void InterestRate() {
		System.out.println("9 Percent");
		
	}
	public static void main(String[] args) {
		BankOfAmerica  BOA  = new BankOfAmerica();
		BOA.InterestRate();
		
		Chase Chase = new Chase();
		CapitalOne  CO  = new CapitalOne();
		CO.InterestRate();
		           
	}

}
class BankOfAmerica extends Bank{
	public void InterestRate() {
		System.out.println("%5");
	}
	
}
class Chase extends Bank{
	@Override    //                     this annotation for verifying if there is overriding or not.
	public void InterestRate() {
		System.out.println("%6");
	}
	
}
class CapitalOne extends Bank{
	@Override
	public void InterestRate() {
		System.out.println("%4");
}
}

