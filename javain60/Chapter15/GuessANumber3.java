public class GuessANumber3 extends Thread
{
	private int number;

	public GuessANumber3(int number)
	{
		this.number = number;
	}

	public void run()
	{
		int counter = 0;
		int guess = 0;
		do
		{
			try
			{
				Thread.sleep(1);
			}catch(InterruptedException e)
			{}

			guess = (int) (Math.random() * 100 + 1);
			System.out.println(this.getName() + " guesses " + guess);
			counter++;
		}while(guess != number);

		System.out.println("** Correct! " + this.getName() + " in " + counter + " guesses.**");
	}
}