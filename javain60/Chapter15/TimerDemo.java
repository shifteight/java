import java.util.Timer;

public class TimerDemo
{
	public static void main(String [] args)
	{
		Timer timer = new Timer();
		GCTask task = new GCTask();
		timer.schedule(task, 5000, 5000);

		int counter = 1;
		while(true)
		{
			new SimpleObject("Object" + counter++);
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException e)
			{}
		}
	}
}