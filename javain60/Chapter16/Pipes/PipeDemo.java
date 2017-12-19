import java.io.*;
import java.util.*;

public class PipeDemo
{
	public static void main(String [] args)
	{
		try
		{
			PipedInputStream pipeIn = new PipedInputStream();
			PipedOutputStream pipeOut = new PipedOutputStream(pipeIn);

			TimerTask task = new RandomWeather(pipeOut);
			Thread viewer = new WeatherViewer(pipeIn);

			Timer timer = new Timer();
			timer.schedule(task, 0, 4000);
			viewer.start();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}