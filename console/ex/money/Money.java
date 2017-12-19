package money;
public class Money
{
	// Data fields
	public static final char SYMBOL = '$';
	private long dollars;
	private long cents;
	public Money()
		// Constructor: Sets dollars and cents to 0
	{
		dollars = 0;
		cents = 0;
	}
	public Money(long initDollars, long initCents)
		// Constructor: Sets dollars and cents to parameter values
	{
		dollars = initDollars;
		cents = initCents;
	}
	public void initialize(long newDollars, long newCents)
		// Initialize dollars and cents
	{
		dollars = newDollars;
		cents = newCents;
	}
	public long dollarsAre()
	{
		return dollars;
	}
	public long centsAre()
	{
		return cents;
	}
	public void print()
	{
		System.out.println("" + Money.SYMBOL + dollars + '.' + cents);
	}
	public Money add (Money value)
		// Returns sum of object plus value.
	{
		Money result = new Money();
		result.cents = cents + value.cents;
		result.dollars = dollars + value.dollars;
		return result;
	}
}

	
