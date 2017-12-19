import money.*;
public class UseMoney
{
	public static void main(String[] args)
	{
		Money money1;
		Money money2;
		Money money3;
		money1 = new Money(10, 59);
		money2 = new Money(20, 70);
		money3 = money1.add(money2);
		System.out.println("" + Money.SYMBOL + money3.dollarsAre() + '.' + money3.centsAre());
	}
}

