import java.io.*;

public class ChainDemo
{
	public static void main(String [] args)
	{
		try
		{
			FileOutputStream fileOut = new FileOutputStream("data.txt");
			BufferedOutputStream buffer = new BufferedOutputStream(fileOut);
			DataOutputStream dataOut = new DataOutputStream(buffer);

			dataOut.writeUTF("Hello!");
			dataOut.writeInt(4);
			dataOut.writeDouble(100.0);
			dataOut.writeDouble(72.0);
			dataOut.writeDouble(89.0);
			dataOut.writeDouble(91.0);

			dataOut.close();
			buffer.close();
			fileOut.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}