/**
 * This program finds an integer between 1 and 10000 that has
 * the largest number of divisors. It prints out the maximum
 * number of divisors and an integer that has that many divisors.
 */

public class MostDivisors {

	public static void main(String[] args) {

		int N;
		int maxDivisors;	// Maximum number of divisors seen so far.
		int numWithMax;		// A value of N that had the given number of divisors.

		maxDivisors = 1;	// Start with the fact that 1 has 1 divisor.
		numWithMax = 1;

		/* Process all the remaining values of N from 2 to 10000, and
		   update the values of maxDivisors and numWithMax whenever we
		   find a value of N that has more divisors than the current value
		   of maxDivisors.
		*/

		for (N = 2; N <= 10000; N++) {

			int D;
			int divisorCount;

			divisorCount = 0;

			for (D = 1; D <= N; D++) {
				if (N % D == 0)
					divisorCount++;
			}

			if (divisorCount > maxDivisors) {
				maxDivisors = divisorCount;
				numWithMax = N;
			}
		}

		System.out.println("Among integers between 1 and 10000,");
		System.out.println("The maximum number of divisors is " + maxDivisors);
		System.out.println("A number with " + maxDivisors + " divisors is "
		                   + numWithMax);

	}
}