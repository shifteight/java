public class ArrayTools {
	
    public static void print(int[] a) {
		System.out.printf("{%d", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %d", a[i]);
		}
		System.out.println("}");
	}
	
	public static void print(Object[] a) {
		System.out.printf("{%s", a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(", %s", a[i]);
		}
		System.out.println("}");
	}
}
