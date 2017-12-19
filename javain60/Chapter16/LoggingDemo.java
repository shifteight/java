import java.util.logging.*;
import java.io.IOException;

public class LoggingDemo
{
	public static void main(String [] args)
	{
		Logger logger = Logger.getLogger("my.log");

		Handler handler = null;

		try
		{
			handler = new FileHandler("messages.log");
		}catch(IOException e)
		{
			System.out.println("Could not create file. Using the console handler");
			handler = new ConsoleHandler();
		}

		logger.addHandler(handler);

		handler.setFormatter(new XMLFormatter());

		logger.info("Our first logging message");
		logger.severe("Something terrible happened");
	}
}