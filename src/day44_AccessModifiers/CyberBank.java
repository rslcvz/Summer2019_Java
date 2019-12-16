package day44_AccessModifiers;

public class CyberBank {

	public static void main(String[] args) {

		BankAccount Sarah = new BankAccount();
		Sarah.setAccountHolder("Sarah Abdu");
		Sarah.setAccountNumber(123345667L);
		System.out.println("Name: " + getAccountHolder());
        System.out.println( "Account Number: " +getAccountNumber() );
        System.out.println("Available Balance: " +getAvailableBalance());
		
		System.out.println(Sarah.getAccountHolder());
		
		BankAccount Serkan = new BankAccount();
		
	}

}
