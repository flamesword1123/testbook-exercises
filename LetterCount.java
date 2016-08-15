import java.util.Scanner;
public class LetterCount {

	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter a phrase");
		String text = console.nextLine();
		System.out.println("Enter a character");
		String c = console.nextLine();

		System.out.println(count(text, c));
	}

	public static int count(String text, String c) {
		int found = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.substring(i, i+1).equals(c)) {
				found++;
			}
		}
		return found;
	}
}