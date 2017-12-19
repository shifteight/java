public class BankAccount
{
	private double balance;
	private int number;

	public BankAccount(int number, double initialBalance)
	{
		this.number = number;
		balance = initialBalance;
	}

	public int getNumber()
	{
		return number;
	}

	public double getBalance()
	{
		return balance;
	}

	public void deposit(double amount)
	{
		double prevBalance = balance;

		try
		{
			Thread.sleep(4000);
		}catch(InterruptedException e)
		{}
	
		balance = prevBalance + amount;
	}

	public void withdraw(double amount)
	{
		double prevBalance = balance;

		try
		{
			Thread.sleep(4000);
		}catch(InterruptedException e)
		{}
	
		balance = prevBalance - amount;
	}
}