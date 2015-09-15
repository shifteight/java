class DetermineInteger {
    public static void main(String[] args) {
		double r = 0;
        for (int b = 1; b < 1000; b++) {
            for (int a = 1; a < b; a++) {
                r = 1.0 * (a * a + b * b + 1) / (a * b);
                if ((int)r == r) {
                    System.out.println(a + "," + b);
                }
            }
        }
    }
}
