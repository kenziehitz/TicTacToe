import java.util.Scanner;

public class SafeInput {

    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int userInput;
        while (true) {
            System.out.print(prompt);
            userInput = console.nextInt();
            console.nextLine();

            if (userInput >= low && userInput <= high) {
                return userInput;
            } else {
                System.out.println("Please enter a number between " + low + " and " + high + ".");
            }
        }
    }

    public static boolean getYNConfirm(Scanner console, String prompt) {
        String userInput;
        while (true) {
            System.out.print(prompt);
            userInput = console.nextLine();

            if (userInput.equalsIgnoreCase("y")) {
                return true;
            } else if (userInput.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Please enter 'y' for yes or 'n' for no.");
            }
        }
    }
}
