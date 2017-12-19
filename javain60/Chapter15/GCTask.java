import java.util.TimerTask;

public class GCTask extends TimerTask
{
	public void run()
	{
		System.out.println("Running the scheduled task...");
		System.gc();
	}
}