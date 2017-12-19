public class SomethingsFixed
{
	public static void main(String [] args)
	{
		ThreadSafeBankAccount account = new ThreadSafeBankAccount(101, 1000.00);
		System.out.println("Initial balance: $" + account.getBalance());

		Thread teller1 = new BankTeller2(account);
		Thread teller2 = new BankTeller2(account);

		teller1.start();
		teller2.start();

		Thread.yield();

		System.out.println("Withdrawing $200...");
		account.withdraw(200);
		System.out.println("\nFinal balance: $" + account.getBalance());
	}
}