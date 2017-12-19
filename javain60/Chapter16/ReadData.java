import java.io.*;

public class ReadData
{
	public static void main(String [] args)
	{
		try
		{
			FileInputStream fileIn = new FileInputStream("data.txt");
			DataInputStream dataIn = new DataInputStream(fileIn);

			System.out.println(dataIn.readUTF());

			int counter = dataIn.readInt();
			double sum = 0.0;

			for(int i = 0; i < counter; i++)
			{
				double current = dataIn.readDouble();
				System.out.println("Just read " + current);
				sum += current;
			}

			System.out.println("\nAverage = " + sum/counter);

			dataIn.close();
			fileIn.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}