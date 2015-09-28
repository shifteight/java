public class GuessingGame2 {

	static int gamesPlayed;
	static int gamesWon;

	public static void main(String[] args) {

		gamesPlayed = 0;
		gamesWon = 0;

		System.out.println("Let's paly a game. I'll pick a number");
		System.out.println("between 1 and 100, and you try to guess it.");
		boolean playAgain;
		do {
			playGame();
			System.out.print("Would you like to play again? ");
			playAgain = TextIO.getlnBoolean();
		} while (playAgain);

		System.out.println();
		System.out.println("You played " + gamesPlayed + " games,");
		System.out.println("and you won " + gamesWon + " of those games.");
		System.out.println("Thanks for playing. Goodbye.");
	} // end of main()

	static void playGame() {
		int computerNumber;
		int userGuess;
		int guessCount;
		gamesPlayed++;
		computerNumber = (int)(100 * Math.random()) + 1;
		guessCount = 0;
		System.out.println();
		System.out.print("What is your first guess? ");
		while (true) {
			userGuess = TextIO.getInt();
			guessCount++;
			if (userGuess == computerNumber) {
				System.out.println("You got it in " + guessCount
					+ " guesses! My number was " + computerNumber);
				gamesWon++;
				break;
			}
			if (guessCount == 6) {
				System.out.println("You didn't get it in 6 guesses.");
				System.out.println("You lose. My number was "
					+ computerNumber);
				break;
			}
			if (userGuess < computerNumber) {
				System.out.println("That's too low. Try again: ");
			} else if (userGuess > computerNumber) {
				System.out.println("That's too high. Try again: ");
			}
		}
		System.out.println();
	} // end of playGame()
} // end of class GuessingGame2