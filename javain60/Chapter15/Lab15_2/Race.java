public class Race
{
	public static void main(String [] args)
	{
		Thread [] cars = new Thread[5];
		int laps = Integer.parseInt(args[5]);

		for(int i = 0; i < cars.length; i++)
		{
			cars[i] = new RaceCar(laps, args[i]);
		}

		for(int i = 0; i < cars.length; i++)
		{
			cars[i].start();
		}
	}
}