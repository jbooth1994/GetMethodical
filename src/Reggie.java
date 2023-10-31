import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = getRegExString(scanner, "Enter your Social Security Number (XXX-XX-XXXX): ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN entered: " + ssn);

        String ucStudentID = getRegExString(scanner, "Enter your UC Student ID (MXXXXX): ", "^(M|m)\\d{5}$");
        System.out.println("UC Student ID entered: " + ucStudentID);

        String menuChoice = getRegExString(scanner, "Enter a menu choice (O, S, V, or Q): ", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + menuChoice);

        scanner.close();
    }

    public static String getRegExString(Scanner scanner, String prompt, String regexPattern) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.next();
        } while (!input.matches(regexPattern));
        return input;
    }
}
