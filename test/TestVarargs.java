import java.util.*;

public class TestVarargs 
{
	public static void main(String[] args) 
	{
		TestVarargs tv = new TestVarargs();
		System.out.println("======Print variable arguments...");
		tv.myprint("china", 5000, new Integer(20), new Date(), 5, 8.92);
		System.out.println("======Print some doubles...");
		tv.myprint2(2,3.14,1000.233);
	}

	public void myprint(String s, int i, Object... objs)
	{
		System.out.println(s.toUpperCase());
		System.out.println(100*i);
		for(Object o: objs)
		{
			System.out.println(o);
		}
	}

	public void myprint2(double... d)
	{
		for(double i: d)
		{
			System.out.println(i);
		}
	}
}
