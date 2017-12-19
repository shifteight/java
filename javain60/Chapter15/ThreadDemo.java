public class ThreadDemo
{
	public static void main(String [] args)
	{
		System.out.println("Pick a number between 1 and 100...");

		GuessANumber player1 = new GuessANumber(20);
		GuessANumber player2 = new GuessANumber(20);

		player1.start();
		player2.start();
	}
}