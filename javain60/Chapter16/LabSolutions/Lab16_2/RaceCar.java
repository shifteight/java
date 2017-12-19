public class RaceCar extends Thread
{
	private int finish;
	private String name;

	public RaceCar(int finish, String name)
	{
		this.finish = finish;
		this.name = name;
	}

	public void run()
	{
		for(int i = 1; i <= finish; i++)
		{
			int time = (int) (Math.random() * 6000);
			try
			{
				Thread.sleep(time);
			}catch(InterruptedException m)
			{}
			System.out.println(name + " " + i);
		}
		System.out.println(name + " finished!");
	}
}