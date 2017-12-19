import java.util.*;

public class TestGenericFunction
{
	public static void main(String[] args) {
		TestGenericFunction t = new TestGenericFunction();
		String valid = t.evaluate("tiger", "fox");
		Integer i = t.evaluate(new Integer(300), new Integer(350));
		System.out.println(valid);
		System.out.println(i);
	}

	public <T> T evaluate(T a, T b) {
		if(a.equals(b))
			return a;
		else
			return null;
	}

}