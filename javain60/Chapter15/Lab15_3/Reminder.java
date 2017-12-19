import java.util.*;

public class Reminder extends TimerTask
{
	String message;

	public Reminder(String message)
	{
		this.message = message;
	}

	public void run()
	{
		System.out.println(message);
	}
}