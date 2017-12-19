public class Print
{
	public static void main(String [] args)
	{
		PrintNumbers printNumbers = new PrintNumbers();
		Thread t1 = new Thread(printNumbers);
		t1.start();

		int time = Integer.parseInt(args[0]);
		try
		{
			Thread.sleep(time);
		}catch(InterruptedException m)
		{}
		printNumbers.stopPrinting();
		System.out.println("main() is ending");
	}
}