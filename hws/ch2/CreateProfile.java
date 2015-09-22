public class CreateProfile {

	public static void main(String[] args) {

		String name;		// the user's name
		String email;		// the user's email address
		double salary;		// the user's yearly salary
		String favColor;	// the user's favorite color

		TextIO.putln("Good afternoon! This program will create");
		TextIO.putln("your profile file, if you will just answer");
		TextIO.putln("a few simple questions.");
		TextIO.putln();

		/* Gather response from the user. */

		TextIO.put("What is your name? ");
		name = TextIO.getln();
		TextIO.put("What is your email address? ");
		email = TextIO.getln();
		TextIO.put("What is your yearly income? ");
		salary = TextIO.getlnDouble();
		TextIO.put("What is your favorite color? ");
		favColor = TextIO.getln();

		/* Write the user's information to the file name profile.txt. */
		TextIO.writeFile("profile.txt");  // subsequent output goes to file
		TextIO.putln("Name:           " + name);
		TextIO.putln("Email:          " + email);
		TextIO.putln("Favorite Color: " + favColor);
		TextIO.putf("Yearly Income:  %,1.2f%n", salary);

		/* Print a final message to standard output. */

		TextIO.writeStandardOutput();
		TextIO.putln("Thank you. Your profile has been written to profile.txt.");
	}
}