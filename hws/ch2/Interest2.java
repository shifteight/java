/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on an investment over a period of one
 * year. The initial amount of the investment
 * and the interest rate are input by the user.
 * The value of the investment at the end of the
 * year is output. The rate must be input as a
 * decimal, not a percentage (for example, 0.05
 * rather than 5).
 */
public class Interest2 {

	public static void main(String[] args) {

		double principal;
		double rate;
		double interest;

		System.out.print("Enter the initial investment: ");
		principal = TextIO.getlnDouble();

		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = TextIO.getlnDouble();

		interest = principal * rate;
		principal = principal + interest;

		/* Output the results. */
		System.out.printf("The amount of interest is $%1.2f%n", interest);
		System.out.printf("The value after one year is $%1.2f%n", principal);
	}
}  // end of class HelloWorld