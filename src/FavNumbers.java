import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite integer: ");
        int favoriteInt = getInt(scanner);

        System.out.print("Enter your favorite double: ");
        double favoriteDouble = getDouble(scanner);

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }

    public static int getInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    public static double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid double.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextDouble();
    }
}