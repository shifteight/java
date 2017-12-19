import java.io.*;

public class CreateFileDemo
{
	public static void main(String [] args)
	{
		try
		{
			FileWriter file = new FileWriter("scores.html");
			BufferedWriter buffer = new BufferedWriter(file);
			PrintWriter out = new PrintWriter(buffer);

			out.println("<html>\n\t<body>");
			out.println("\t<table border=\"1\">\n\t\t<tr>");
			out.println("\t\t<td>Home:</td>\n\t\t<td>Denver Broncos</td>\n\t\t<td>27</td>");
			out.println("\t\t</tr>\n\t\t<tr>");
			out.println("\t\t<td>Visitor:</td>\n\t\t<td>Oakland Raiders</td>\n\t\t<td>24</td>");
			out.println("\t\t</tr>\n\t</table>");
			out.println("\t</body>\n</html>");

			out.close();
			buffer.close();
			file.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}