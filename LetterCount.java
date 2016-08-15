public class LetterCount {

	public static void main (String[] args) {
		System.out.println(count("hello", 'l'));
	}

	public static int count(String text, char c) {
		int found = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				found++;
			}
		}
		return found;
	}
}