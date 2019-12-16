package day44_AccessModifiers;

public class BankAccount {
	private String AccountHolder;
	private long AccountNumber;
	private double AccountBalanace;
	private double AvailableBalance;
	// getter (read only): instance return method
	
	public String getAccountHolder() {
		return AccountHolder;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	// setter (Modify): Instance void method, passes a parameter 
	public void setAccountHolder(String AccountHolder) {
		this.AccountHolder = AccountHolder;
		//you can not go to instance with static !!! -In static there is no Object
		
	}
	public void setAccountNumber(long AccountNumber) {
		//     this.AccountNumber;
		this.AccountNumber=AccountNumber;
	}
		public void deposit(double amount) {
			AvailableBalance += amount;
			
		}
		public void WithDraw(double amount) {
		if (AvailableBalance <= 0) {
			System.out.println("Your account balance is less than or equal to 0");
			return;
		}
		if (amount > AccountBalanace) {
			AvailableBalance -= 35;
		}
		AvailableBalance -= amount;	
		}
		// checking balance: 
		public void ShowBalance() {
			System.out.println("Available balance: " + AvailableBalance);
			
		}
		//get account info:
        public void getAccountInfo() {
            System.out.println("Name: " + getAccountHolder());
            System.out.println( "Account Number: " +getAccountNumber() );
            System.out.println("Available Balance: " +getAvailableBalance());
        }
	}


