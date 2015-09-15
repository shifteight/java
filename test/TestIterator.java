import java.util.Date;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("China");
		a.add("USA");
		a.add("Korea");
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			String country = (String)it.next();
			System.out.println(country);
		}
		
		Vector v = new Vector();
		v.addElement(new Date());
		v.addElement(new Date(200008755554L));
		it = v.iterator();
		while(it.hasNext()) {
			Date time = (Date)it.next();
			System.out.println(time);
		}
	}
}