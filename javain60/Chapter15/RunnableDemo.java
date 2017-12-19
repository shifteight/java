public class RunnableDemo
{
	public static void main(String [] args)
	{
		/*
		 * Note: This program never terminates!
		 * To stop it, press CTRL+C.
		 *
		 */
		
		System.out.println("Creating the hello thread...");
		// instantiate a Runnable object: hello
		DisplayMessage hello = new DisplayMessage("Hello");
		// associate the Runnable object with a Thread object
		Thread thread1 = new Thread(hello);
		System.out.println("Starting the hello thread...");
		thread1.start();

		System.out.println("Creating the goodbye thread...");
		// instantiate a runnable object: bye
		DisplayMessage bye = new DisplayMessage("Goodbye");
		Thread thread2 = new Thread(bye);
		System.out.println("Starting the goodbye thread...");
		thread2.start();
	}
}