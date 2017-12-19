public class TestOverride
{
	public static void main(String args[])
	{
		D200_Card my200 = new D200_Card(12345678,1234,50.0,"200");
		if (my200.performDial(12345678,1234))
			System.out.println("拨打电话后剩余金额为："+my200.getBalance());
		if (my200.performDial())
			System.out.println("拨打电话后剩余金额为："+my200.getBalance());
	}
}
abstract class PhoneCard
{
	double balance;

	abstract boolean performDial();
	double getBalance()
	{
		return balance;
	}
}
abstract class Number_PhoneCard extends PhoneCard
{
	long cardNumber;
	int password;
	String connectNumber;
	boolean connected;

	boolean performConnection(long cn, int pw)
	{
		if (cn==cardNumber && pw==password)
		{
			connected = true;
			return true;
		}
		else
			return false;
	}
}
class D200_Card extends Number_PhoneCard
{
	double additoryFee;

	D200_Card(long cn, int pw, double b, String c)
	{
		cardNumber = cn;
		password = pw;
		balance = b;
		connectNumber = c;
	}
	boolean performDial()
	{
		if (!connected)
			return false;
		if (balance > (0.5+additoryFee))
		{
			balance -= (0.5+additoryFee);
			return true;
		}
		else
			return false;
	}
	boolean performDial(long cn, int pass)
	{
		if (performConnection(cn, pass))
			return performDial();
		else
			return false;
	}
	double getBalance()
	{
		if (connected)
			return balance;
		else
		       	return -1;
	}
}

