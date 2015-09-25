/**
 * Simulate choosing people at random and checking the day of the year they
 * were born on.  If the birthday is the same as one that was seen previously,
 * stop, and output the number of people who were checked.
 */
public class BirthdayProblem {

	public static void main(String[] args) {

		boolean[] used;	// For recording the possible birthdays
		//   that have been seen so far.  A value
		//   of true in used[i] means that a person
		//   whose birthday is the i-th day of the
		//   year has been found.

		int count;		// The number of people who have been checked.

		used = new boolean[365];	// Initially, all entries are false.

		count = 0;

		while (true) {

			int birthday;	// The selected birthday
			birthday = (int)(Math.random() * 365);
			count++;

			System.out.printf("Person %d has birthday number %d", count, birthday);
			System.out.println();

			if (used[birthday]) {
				break;
			}

			used[birthday] = true;
		}

		System.out.println();
		System.out.println("A duplicate birthday was found after " +
		                   count + " tries.");
	}
}