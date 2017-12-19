import java.util.Timer;

public class Phone
{
	private boolean ringing;
	private PhoneRinger task;
	private Timer timer;

	public Phone()
	{
		timer = new Timer(true);
	}

	public boolean isRinging()
	{
		return ringing;
	}

	public void startRinging()
	{
		ringing = true;
		task = new PhoneRinger();
		timer.scheduleAtFixedRate(task, 0, 3000);
	}

	public void answer()
	{
		ringing = false;
		System.out.println("Phone rang " + task.getRingCount() + " times");
		task.cancel();
	}

	public static void main(String [] args)
	{
		Phone phone = new Phone();
		phone.startRinging();

		try
		{
			System.out.println("Phone started ringing...");
			Thread.sleep(20000);
		}catch(InterruptedException e)
		{}

		System.out.println("Answering the phone...");
		phone.answer();
	}
}