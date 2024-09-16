import java.util.Scanner;

public class Nested_if_Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter the Three numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the greatest number using nested if statements
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("The greatest number is: " + num1);
            } else {
                System.out.println("The greatest number is: " + num3);
            }
        } 
        
        else {
            if (num2 >= num3) {
                System.out.println("The greatest number is: " + num2);
            } else {
                System.out.println("The greatest number is: " + num3);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
