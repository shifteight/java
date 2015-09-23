/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on an investment over a period of 5
 * years. The initial amount of the investment
 * and the interest rate are input by the user.
 * The value of the investment at the end of each
 * year is output.
 */
public class Interest3 {

	public static void main(String[] args) {

		double principal;
		double rate;

		System.out.print("Enter the initial investment: ");
		principal = TextIO.getlnDouble();

		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = TextIO.getlnDouble();

		int years = 0;  // counts the number of years that have passed.

		/* Simulate the investment for 5 years. */
		while (years < 5) {
			double interest;
			interest = principal * rate;
			principal = principal + interest;
			years += 1;
			System.out.print("The value of the investment after ");
			System.out.print(years);
			System.out.print(" year is $");
			System.out.printf("%1.2f", principal);
			System.out.println();

		}
	}
}  // end of class HelloWorld
