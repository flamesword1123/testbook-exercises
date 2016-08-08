import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("Pick a number: ");
		double number = console.nextDouble();

		if (number > 0) {
		    System.out.println("Number is positive.");
		}
		if (number == 0) {
		    System.out.println("Number is zero.");
		}
		if (number < 0) {
		    System.out.println("Number is negative.");
		}
	}
}
