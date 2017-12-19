import java.io.*;

public class RandomAccessDemo
{
	public static void main(String [] args)
	{
		try
		{
			RandomAccessFile file = new RandomAccessFile("scores.html", "rw");

			for(int i = 1; i <= 6; i++)
			{
				System.out.println(file.readLine());
			}

			long current = file.getFilePointer();
			file.seek(current + 6);

			file.write("34".getBytes());

			for(int i = 1; i <= 5; i++)
			{
				System.out.println(file.readLine());
			}

			current = file.getFilePointer();
			file.seek(current + 6);

			file.write("27".getBytes());

			file.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}