import java.util.Date;
import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList h = new ArrayList();
		h.add("1st");
		h.add("2nd");
		h.add(new Integer(3));
		h.add(new Double(4.0));
		h.add("2nd");
		h.add(new Integer(3));
		System.out.println(h);
		System.out.println("size=" + h.size());
		System.out.println("---替换指定元素---");
		h.set(3, "replace");
		System.out.println("---for循环遍历---");
		for(int i=0; i<h.size(); i++) {
			System.out.println(h.get(i));
		}
		System.out.println("---取用特定元素---");
		Integer it = (Integer)h.get(2);
		System.out.println(it.intValue());
		System.out.println("---插入元素---");
		h.add(3, new Date());
		System.out.println("current size=" + h.size());
		System.out.println("---转换为数组---");
		Object[] os = h.toArray();
		for(Object o: os) {
			System.out.println(o);
		}
	}
}