package day38_Custom;

public class BankAccount {

	String AccountHolder;
	long AccountNumber;
	double balance;

	public BankAccount() {

	}

	public void ShowBalance() {

		String acct = "" + AccountNumber;
		String xx = "************" + acct.substring(12);
		System.out.println("Account Holder: " + AccountHolder);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Available Balance: " + AccountHolder);
		System.out.println("Available Balance: $" + balance);
	}

	public void Deposit(double amount) {
		String acct = "" + AccountNumber;
		String xx = "************" + acct.substring(12);

		System.out.println("Depositing " + amount + " to account ");
		balance += amount;

	}

	public void WithDraw(double amount) {
		System.out.println("------------------------------------");
		if (balance <= 0) {
			System.out.println("There is no available balance");
			return;
		}
		String acct = "" + AccountNumber;
		String xx = "************" + acct.substring(12);

		System.out.println("Withdrawing " + amount + " from account" + AccountNumber);
		balance -= amount;
		if (balance < 0) {
			balance -= 35;
		}
		System.out.println("New Balance: $" + balance);

		System.out.println("--------------------------------------------------");
	}

	public void accountSetUp(String name, long acctNum) {
		AccountHolder = name;
		AccountNumber = acctNum;
	}
}
