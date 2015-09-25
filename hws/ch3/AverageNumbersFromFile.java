/**
 * This program reads numbers from a file.  It computes the sum and
 * the average of the numbers that it reads.  The file should contain
 * nothing but numbers of type double; if this is not the case, the
 * output will be the sum and average of however many numbers were
 * successfully read from the file.  The name of the file will be
 * input by the user.
 */

public class AverageNumbersFromFile {

	public static void main(String[] args) {

		while (true) {
			String fileName;
			System.out.print("Enter the name of the file: ");
			fileName = TextIO.getln();
			try {
				TextIO.readFile(fileName);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Can't read from the file \"" +
				                   fileName + "\".");
				System.out.println("Please try again.\n");
			}
		}

		/* At this point, TextIO is reading from the file. */

		double number;	// The input converted into a number.
		double sum;	// The total of all numbers entered.
		int count;		// The number of numbers entered.

		sum = 0;
		count = 0;

		try {
			while (true) {
				number = TextIO.getDouble();
				count++;
				sum += number;
			}
		} catch (IllegalArgumentException e) {
			// We expect this to occur when the end-of-file is encountered.
			// We don't consider this to be an error, so there is nothing to do
			// in this catch clause.  Just proceed with the rest of the program.

		}

		/* At this point, we've read the entire file. */

		System.out.println();
		System.out.println("Number of data values read: " + count);
		System.out.println("The sum of the data values: " + sum);
		if ( count == 0 )
			System.out.println("Can't compute an average of 0 values.");
		else
			System.out.println("The average of the values:  " + (sum / count));

	}
}