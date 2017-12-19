import java.io.*;

public class ReadScores
{
	private BufferedReader scores;

	public ReadScores(Reader source) throws IOException
	{
		scores = new BufferedReader(source);
	}

	public void showScores() throws IOException
	{
		while(true)
		{

			String home = scores.readLine();
			if(home == null)
			{
				break;
			}
			int homeScore = Integer.parseInt(scores.readLine());
			String visit = scores.readLine();
			int visitScore = Integer.parseInt(scores.readLine());
			System.out.println("Home:\t" + home + "\t" + homeScore + (homeScore > visitScore ? "*" : ""));
			System.out.println("Visitor:\t" + visit + "\t" + visitScore + (visitScore > homeScore ? "*" : ""));
		}
	}

	public static void main(String [] args)
	{
		try
		{
			FileReader file = new FileReader(args[0]);
			ReadScores readScores = new ReadScores(file);
			readScores.showScores();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}