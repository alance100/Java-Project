import java.util.Scanner;

// Custom exception class
class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class javalab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check age
            if (age < 18) {
                throw new UnderageException("Access Denied: " + name + ", you must be at least 18 years old.");
            } else {
                System.out.println("Welcome " + name + "! You are eligible.");
            }

        } catch (UnderageException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid age.");
        } finally {
            scanner.close();
        }
    }
}
