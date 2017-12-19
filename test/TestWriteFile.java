import java.io.*;

public class TestWriteFile 
{
	public static void main(String[] args) 
	{
		File file = new File("tt.txt");
		try
		{
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(is);
			PrintWriter out = new PrintWriter(new FileWriter(file));
			String s = in.readLine();
			while (!s.equals(""))
			{
				out.println(s);
				s = in.readLine();
			}
			in.close();
			out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
