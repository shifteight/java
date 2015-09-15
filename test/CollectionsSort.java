import java.util.*;
// Use Generic for JDK 5.0
public class CollectionsSort {
	public static void main(String[] args) {
		List<String> l = new LinkedList<String>();
		l.add("Vincent Tuan");
		l.add("Anita Wu");
		l.add("Howard Tuan");
		
		System.out.println("Before sorted: ");
		System.out.println(l);
		Collections.sort(l); // call static method "sort" of Collections
		System.out.println("After sorted: ");
		System.out.println(l);
	}
}