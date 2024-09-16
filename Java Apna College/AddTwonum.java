import java.util.Scanner;

public class AddTwonum {
     
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int a = read.nextInt();

        System.out.println("Enter the 2nd number : ");
        int b = read.nextInt();
    read.close();
        int sum = a + b;

        System.out.println("The sum of the two numbers : "+sum);

    }
}

// the default for int is 0 and the default value for Strung is null