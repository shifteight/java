public class BankTeller extends Thread
{
	private BankAccount account;

	public BankTeller(BankAccount a)
	{
		account = a;
	}

	public void run()
	{
		System.out.println(this.getName() + " depositing $100...");
		account.deposit(100.00);
	}
}