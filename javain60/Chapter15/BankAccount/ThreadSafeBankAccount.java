public class ThreadSafeBankAccount
{
	private double balance;
	private int number;

	public ThreadSafeBankAccount(int number, double initialBalance)
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
		synchronized(this)
		{
			double prevBalance = balance;

			try
			{
				Thread.sleep(4000);
			}catch(InterruptedException e)
			{}

			balance = prevBalance + amount;

		}
	}

	public synchronized void withdraw(double amount)
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