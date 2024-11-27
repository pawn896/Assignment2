import java.util.InputMismatchException;
import java.util.Scanner;
public class Utility {
    public static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                ExceptionHandler.handleInputMismatchException(e);
                scanner.next(); // Clear the invalid input
            }
        }
    }
    public static double getDoubleInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                ExceptionHandler.handleInputMismatchException(e);
                scanner.next(); // Clear the invalid input
            }
        }
    }
}

