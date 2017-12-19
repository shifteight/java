public class BankTeller2 extends Thread
{
	private ThreadSafeBankAccount account;

	public BankTeller2(ThreadSafeBankAccount a)
	{
		account = a;
	}

	public void run()
	{
		System.out.println(this.getName() + " depositing $100...");
		account.deposit(100.00);
	}
}