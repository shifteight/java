import java.util.*;

public class TestDeprecation 
{
	public static void main(String[] args) 
	{
		Date now = new Date();
		int h = now.getHours();
		int m = now.getMinutes();
		int s = now.getSeconds();
		System.out.println("current time: "+h+":"+m+":"+s);
	}
}
