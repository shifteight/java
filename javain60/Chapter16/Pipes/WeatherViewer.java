import java.io.*;

public class WeatherViewer extends Thread
{
	private DataInputStream in;

	public WeatherViewer(InputStream src)
	{
		in = new DataInputStream(src);
	}

	public void run()
	{
		while(true)
		{
			try
			{
				int currentTemp = in.readInt();
				System.out.println("\nThe current temp is " + currentTemp);

				String conditions = in.readUTF();
				System.out.println("Conditions are " + conditions);
			}catch(IOException e)
			{
				e.printStackTrace();
				break;
			}
		}
	}
}