import java.util.List;
import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		Integer[] a = {2, 35, 23, 15, 28};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int idx = Arrays.binarySearch(a, 23);
		System.out.println(idx);
		
		List list = Arrays.asList(3, 4, 5);
		System.out.println(list);
		list.set(2, 99);
		System.out.println(list);
	}
}