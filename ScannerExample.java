import java.util.Scanner;
public class ScannerExample {

    public static void main (String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("Input a number: ");
        double n = console.nextDouble();

        System.out.println("You inputed " + n);
    }
}
