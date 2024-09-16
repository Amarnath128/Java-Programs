import java.util.Scanner;

    public class Simple_interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount (p)
        System.out.println("Enter the principal amount (P > 10,000):");
        double p = scanner.nextDouble();

        // Input rate of interest (r)
        System.out.println("Enter the rate of interest (R > 25):");
        double r = scanner.nextDouble();

        // Input number of years (n)
        System.out.println("Enter the number of years (2 <= n <= 5):");
        int n = scanner.nextInt();

        // Validate input values
        if (p > 10000 && r > 25 && n >= 2 && n <= 5) {
            // Calculate simple interest
            double simpleInterest = (p * r * n) / 100;

            // Display the result
            System.out.println("Principal Amount (P): " + p);
            System.out.println("Rate of Interest (R): " + r);
            System.out.println("Number of Years (n): " + n);
            System.out.println("Simple Interest: " + simpleInterest);
        } else {
            System.out.println("Invalid input. Please make sure P > 10,000, R > 25, and 2 <= n <= 5.");
        }

        // Close the scanner
        scanner.close();
    }
}
