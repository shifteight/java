import java.util.*;

public class Test
{
	public static void main(String[] args) {
		Test t = new Test();
		Vector<String> vs = new Vector<String>();
		vs.add("Tom");
		vs.add("Billy");
		vs.add("Kessey");
		t.overview(vs);

		Vector<Integer> vi = new Vector<Integer>();
		vi.add(300);
		vi.add(500);
		t.overview(vi);
	}

	public void overview(Vector<?> v) {
		for(Object o : v) {
			System.out.println(o);
		}
		v.remove(new Integer(300));
		v.clear();
	}

}