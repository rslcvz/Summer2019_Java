package day38_Custom;

public class BankAccountObjects {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();
		account1.AccountHolder = "Erhan Dolapci";
		account1.AccountNumber=1234556654566L;
		
		account1.ShowBalance();
		
		account1.Deposit(2000);
		account1.Deposit(4000);
		
		account1.WithDraw(3000);
		account1.WithDraw(3001);
		account1.WithDraw(2000);
	}

}
