public class DuplicatingArrays {
	public static void main(String[] args) {
		int[] a = {22, 44, 66, 88};
		ArrayTools.print(a);
		int[] b = (int[])a.clone();
		ArrayTools.print(b);
		String[] c = {"AB", "CD", "EF"};
		ArrayTools.print(c);
		String[] d = (String[])c.clone();
		ArrayTools.print(d);
		c[1] = "XYZ";
		ArrayTools.print(c);
		ArrayTools.print(d);
	}
/*	
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
*/
}