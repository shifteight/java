import java.io.*;
import java.util.*;

public class RandomWeather extends TimerTask
{
	private DataOutputStream out;

	public RandomWeather(OutputStream dest)
	{
		out = new DataOutputStream(dest);
	}

	public void run()
	{
		try
		{
			int temp = (int) (Math.random() * 110);
			out.writeInt(temp);

			int random = (int) (Math.random() * 4);
			String conditions;
			switch(random)
			{
				case 0:
					conditions = "sunny";
					break;
				case 1:
					conditions = "rainy";
					break;
				case 2:
					conditions = "windy";
					break;
				default:
					conditions = "snowy";
			}
			out.writeUTF(conditions);

		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}