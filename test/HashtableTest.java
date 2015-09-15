import java.util.*;
// Not use Generic!
public class HashtableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("one", new Integer(1));
		ht.put("two", new Double(2));
		ht.put("three", new String("3"));
		
		System.out.println("Get values by keys: ");
		System.out.println("one => " + ht.get("one"));		
		System.out.println("two => " + ht.get("two"));
		System.out.println("three => " + ht.get("three"));
		// using a non-existent key: will return "null"
		System.out.println("four => " + ht.get("four")); // four => null
		
		System.out.println("Using Enumeration to get all values: ");
		for(Enumeration e = ht.elements(); e.hasMoreElements();) {
			System.out.println(e.nextElement().toString());
		}
	}
}