import java.net.*;
import java.io.*;

class ParseURL 
{
	public static void main(String[] args) throws Exception
	{
		URL aURL = new URL("http://java.sun.com:80/docs/books/");
		URL tuto = new URL(aURL, "tutorial.intro.html#DOWNLOADING");
		System.out.println("protocol="+ tuto.getProtocol());
		System.out.println("host ="+ tuto.getHost());
		System.out.println("filename="+ tuto.getFile());
		System.out.println("port="+ tuto.getPort());
		System.out.println("ref="+tuto.getRef());
		System.out.println("query="+tuto.getQuery());
		System.out.println("path="+tuto.getPath());
		System.out.println("UserInfo="+tuto.getUserInfo());
		System.out.println("Authority="+tuto.getAuthority());
	}
}
