import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter next person's information:");

		System.out.print("height (in inches)? ");
		double height1 = console.nextDouble();

		System.out.print("weight (in pounds)? ");
		double weight1 = console.nextDouble();

		double bmi1 = weight1 / (height1 * height1) * 703;

		System.out.printf("Person #1 body mass index = %5.2f\n", bmi1);

		if (bmi1 < 18.5) {
            System.out.println("underweight");

		} else if (bmi1 < 25) {
			System.out.println("normal");

		} else if (bmi1 < 30) {
			System.out.println("overweight");

		} else { //bmi1>=30
			System.out.println("obese");
		}
	}
}