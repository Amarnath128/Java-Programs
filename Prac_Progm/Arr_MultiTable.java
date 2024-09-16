import java.util.Scanner;
public class Arr_MultiTable { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number for which multiplication table is to be printed
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an array to store the multiplication table
        int[] multiplicationTable = new int[10];

        // Populate the array with the multiplication values
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Print the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + multiplicationTable[i]);
        }

        scanner.close();
    }
}
