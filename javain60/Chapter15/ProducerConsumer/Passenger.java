public class Passenger extends Thread
{
	private Taxi taxi;

	public Passenger(Taxi t)
	{
		taxi = t;
	}

	public void run()
	{
		System.out.println("Passenger hails taxi...");
		while(!taxi.isAvailable())
		{
			synchronized(taxi)
			{
				try
				{
					taxi.wait();
				}catch(InterruptedException e)
				{}
			}
		}

		taxi.setAvailable(false);
		synchronized(taxi)
		{
			taxi.notifyAll();
		}


		System.out.println("Passenger rides in taxi...");
		try
		{
			Thread.sleep(4000);
		}catch(InterruptedException e)
		{}

		System.out.println("Passenger leaves taxi...");

	}
}