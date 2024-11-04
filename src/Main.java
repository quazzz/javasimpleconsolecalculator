import java.util.Scanner;

public class Main {

    static void add(Integer a, Integer b){
        System.out.println("Result: " + (a + b));
    }

    static void subtract(Integer a, Integer b){
        System.out.println("Result: " + (a - b));
    }

    static void multiply(Integer a, Integer b){
        System.out.println("Result: " + (a * b));
    }

    static void divide(Integer a, Integer b){
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            try {
                System.out.print("Enter first number: ");
                Integer a = scanner.nextInt();

                System.out.print("Enter second number: ");
                Integer b = scanner.nextInt();

                System.out.println("Choose an operation:");
                System.out.println("1 - Add");
                System.out.println("2 - Subtract");
                System.out.println("3 - Multiply");
                System.out.println("4 - Divide");
                System.out.print("Enter your choice: ");
                Integer choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> add(a, b);
                    case 2 -> subtract(a, b);
                    case 3 -> multiply(a, b);
                    case 4 -> divide(a, b);
                    default -> System.out.println("Invalid choice. Please select a number between 1 and 4.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.nextLine(); // Clear invalid input
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalculating = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Calculator program ended.");
    }
}
