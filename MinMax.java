import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers would you like to enter: ");
		int length = console.nextInt();

		double max = 0;
		double min = 0;

		for (int i = 1; i <= length; i++) {
			System.out.print("   #" + i + "? ");
			double number = console.nextDouble();

			if (i == 1) {
				max = number;
				min = number;
			} else {
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
			}
		}

		System.out.println("The largest number in the set is " + max);
		System.out.println("The smallest number in the set is " + min);
	}
}