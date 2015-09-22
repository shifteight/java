/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on $17,000 invested at an interest
 * rate of 0.027 for one year. The interest and
 * the value of the investment after on year are
 * printed to standard output.
 */
public class Interest {

	public static void main(String[] args) {

		/* Declare the variables. */

		double principal;
		double rate;
		double interest;

		/* Do the computations. */

		principal = 17000;
		rate = 0.027;
		interest = principal * rate;

		principal = principal + interest;

		/* Output the results. */
		System.out.println("The interest earned is $");
		System.out.println(interest);
		System.out.println("The value of the " +
		                   "investment after one year is $");
		System.out.println(principal);
	}
}  // end of class HelloWorld