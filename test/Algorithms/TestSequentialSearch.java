// Sequential Search (Linear Search)
public class TestSequentialSearch {
	public static void main(String[] args) {
		int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		System.out.println("search(a, 44): " + search(a, 44));
		System.out.println("search(a, 50): " + search(a, 50));
		System.out.println("search(a, 77): " + search(a, 77));
		System.out.println("search(a, 100): " + search(a, 100));
	}
	
	public static int search(int[] a, int x) {
		// Postconditions: 
		// returns an integer i; if i>=0, then a[i]==x; otherwise x is not in a[]
		for (int i=0; i<a.length; i++) {
			// Invariant: x is not among a[0]...a[i-1]
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
