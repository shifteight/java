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
import java.util.Scanner;

public class Interest2WithScanner {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		double principal;
		double rate;
		double interest;

		System.out.print("Enter the initial investment: ");
		principal = stdin.nextDouble();

		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = stdin.nextDouble();

		interest = principal * rate;
		principal = principal + interest;

		/* Output the results. */
		System.out.printf("The amount of interest is $%1.2f%n", interest);
		System.out.printf("The value after one year is $%1.2f%n", principal);
	}
}  // end of class HelloWorld