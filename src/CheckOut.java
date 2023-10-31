import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            double itemPrice = getRangedDouble(scanner, "Enter the price of the item ($0.50 - $10.00): ", 0.50, 10.00);
            totalCost += itemPrice;

            moreItems = getYNConfirm(scanner, "Do you have more items to purchase? (yes/no): ");
        } while (moreItems);

        System.out.printf("Total cost of the item(s): $%.2f%n", totalCost);

        scanner.close();
    }

    public static double getRangedDouble(Scanner scanner, String prompt, double min, double max) {
        double input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid price.");
                scanner.next();
                System.out.print(prompt);
            }
            input = scanner.nextDouble();
        } while (input < min || input > max);
        return input;
    }

    public static boolean getYNConfirm(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.next().toLowerCase();
        } while (!input.equals("yes") && !input.equals("no"));
        return input.equals("yes");
    }
}
