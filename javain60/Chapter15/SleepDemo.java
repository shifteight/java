public class SleepDemo
{
	public static void main(String [] args)
	{
		System.out.println("Pick a number between 1 and 100...");

		Thread player1 = new GuessANumber3(47);
		Thread player2 = new GuessANumber3(47);
		Thread player3 = new GuessANumber3(47);

		player3.setPriority(Thread.MAX_PRIORITY);

		player1.start();
		player2.start();
		player3.start();
	}
}