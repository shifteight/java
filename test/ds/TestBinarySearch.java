public class TestBinarySearch {
    public static void main(String[] args) {
        int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("seach(a, 44): " + search(a, 44));
        System.out.println("seach(a, 50): " + search(a, 50));
        System.out.println("seach(a, 77): " + search(a, 77));
        System.out.println("seach(a, 100): " + search(a, 100));
    }

    public static int search(int[] a, int x) {
        // Postconditions: return i;
        //                 i >= 0, then a[i] == x; otherwise i == -1;
        int lo = 0;
        int hi = a.length;
        while(lo < hi) {
            // Invariant: if a[j] == x then lo <= j < hi;
            int i = (lo + hi) / 2;
            if(a[i] == x) {
                return i;
            } else if (a[i] < x) {
                lo = i + 1;
            } else {
                hi = i;
            }
        }
        return -1;
    }
}
