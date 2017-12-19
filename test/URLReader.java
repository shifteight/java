import java.net.*;
import java.io.*;

class URLReader
{
	public static void main(String[] args) throws Exception
	{
		URL myURL = new URL("http://www.shufe.edu.cn/");
		BufferedReader in = new BufferedReader(new InputStreamReader(myURL.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) 
			System.out.println(inputLine); //把读入的数据打印到屏幕上
		in.close(); //关闭输入流
	}
}
