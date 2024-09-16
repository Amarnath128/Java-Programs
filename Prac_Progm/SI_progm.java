import java.util.Scanner;
    public class SI_progm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principle amount (P)
        System.out.print("Enter the principle amount greater than 10,000 : ");
        double p = sc.nextDouble();

        // Input rate of interest (R)
        System.out.print("\n Enter the rate of interest greater than 25 :");
        double r = sc.nextDouble();

        // Input number of years (n) in the range of 2 to 5
        System.out.print("\n Enter the number of years in the range of 2 to 5 :");
        int n = sc.nextInt();

        // Validate input conditions
        if (p > 10000 && r > 25 && n >= 2 && n <= 5) {
            // Calculate simple interest
            double SI = (p * r * n) / 100;

            // Display the result
            System.out.println("\n-------------- The Simple Intrest --------------\n");
            System.out.println("Principle amount : " + p);
            System.out.println("Rate of interest : " + r);
            System.out.println("Number of years  : " + n);
            System.out.println("\n Simple Interest : " + SI);
        } else {
            System.out.println("Invalid input. Please ensure P > 10,000, R > 25, and n is in the range of 2 to 5.");
        }

        // Close the scanner
        sc.close();
    }
}

