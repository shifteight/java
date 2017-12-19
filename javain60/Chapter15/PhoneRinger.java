import java.util.TimerTask;

public class PhoneRinger extends TimerTask
{
	int counter;

	public PhoneRinger()
	{
		counter = 0;
	}

	public void run()
	{
		counter++;
		System.out.println("Ring " + counter);
	}

	public int getRingCount()
	{
		return counter;
	}
}