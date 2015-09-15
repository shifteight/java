import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] a = {44, 77, 55, 22, 99, 88, 33, 66};
        ArrayTools.print(a);
        Arrays.sort(a);
        ArrayTools.print(a);
		
        int k = Arrays.binarySearch(a, 44);
        System.out.printf("Arrays.binarySearch(a, 44): %d%n", k);
        System.out.printf("a[%d]: %d%n", k, a[k]);
		
        k = Arrays.binarySearch(a, 45);
        System.out.printf("Arrays.binarySearch(a, 45): %d%n", k);
		// k should be -4, then 45 should be inserted at a[-k-1]
        
		int[] b = new int[8];
        ArrayTools.print(b);
        Arrays.fill(b, 55);
        ArrayTools.print(b);
        System.out.println("Arrays.equals(a,b): " + Arrays.equals(a,b));
    }
}
