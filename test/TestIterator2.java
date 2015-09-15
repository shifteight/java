import java.util.Vector;
import java.util.Iterator;

public class TestIterator2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(new Person("张三", 18));
		v.addElement(new Person("李四", 26));
		v.addElement(new Person("王五", 34));
		v.addElement(new Person("赵六", 35));
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Person p = (Person)it.next();
			System.out.println(p);
			if(p.getName().equals("李四")) {
				p.setAge(p.getAge() + 40);
			} else if (p.getName().equals("王五")) {
				it.remove();
			}
		}
		System.out.println("--------------------");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
	}
}