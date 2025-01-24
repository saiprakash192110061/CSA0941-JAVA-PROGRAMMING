import java.util.Scanner;
public class ExitOnZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.print("Enter a number (enter 0 to exit): ");
            userInput = scanner.nextInt();
            if (userInput == 0) {
                break; 
            }
            System.out.println("You entered: " + userInput);
        }
        System.out.println("Exited the loop.");
        scanner.close();
    }
}
