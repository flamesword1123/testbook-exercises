import java.util.*;

public class NumberGuess {
	public static void main(String[] args) {
		System.out.println("Try to guess my two-digit");
		System.out.println("number, and I'll tell you how");
		System.out.println("many digits from your guess");
		System.out.println("appear in my number.");
		System.out.println();

		Scanner console = new Scanner(System.in);

		//picks a random number from 0 to 99 inclusive
		Random rand = new Random();
		int number = rand.nextInt(100);

		//gets first guess
		System.out.print("Your guess? ");
		int guess = getGuess(console);
		int numGuesses = 1;

		//gives hints until correct answer is reached
		while (guess != number) {
			int numMatches = matches(number, guess);
			System.out.println("Incorrect (hint: " + numMatches + " digits match)");
			System.out.print("Your guess? ");
			guess = console.nextInt();
			numGuesses++;
		}

		System.out.println("You got it right in " + numGuesses + " tries.");
	}

	//returns number of matching digits between the two numbers
	public static int matches(int number, int guess) {
		int numMatches = 0;

		if (guess / 10 == number / 10 ||
			guess / 10 == number % 10) {
			numMatches++;
		}

		if (guess / 10 != guess % 10 &&
			(guess % 10 == number / 10 ||
			guess % 10 == number % 10)) {
			numMatches++;

		}

		return numMatches;
	}
	//prompts until a number in proper range is entered
	public static int getGuess(Scanner console) {
		int guess = getInt(console, "Your guess? ");
		while (guess < 0 || guess >=100) {
			System.out.println("Out of range; try again.");
			guess = getInt(console, "Your guess? ");
		}

		return guess;
	}
	//prompts until a valid number is entered
	public static int getInt(Scanner console, String prompt) {
		System.out.print(prompt);
		while (!console.hasNextInt()) {
			console.next();
			System.out.println("Not an integer; try again.");
			System.out.print(prompt);
		}
		return console.nextInt();

	}
}