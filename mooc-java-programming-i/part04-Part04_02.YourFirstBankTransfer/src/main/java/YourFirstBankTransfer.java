
public class YourFirstBankTransfer {

	public static void main(String[] args) {
		// Do not touch the code in Account.java
		// write your program here
		Account firstAccount = new Account("Matthews account", 1000);
		Account secondAccount = new Account("My account", 0);

		firstAccount.withdrawal(100);
		secondAccount.deposit(100);

		System.out.println(firstAccount.toString());
		System.out.println(secondAccount.toString());
	}
}
