import java.util.Scanner;
public class Gross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's job title (e.g., 'entry-level', 'manager', 'executive'): ");
        String jobTitle = scanner.nextLine();

        double hourlyWage = getHourlyWage(jobTitle);

        System.out.print("Enter number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double grossPay = hourlyWage * hoursWorked;

        System.out.println("Gross pay: $" + grossPay);

        scanner.close();
    }

    public static double getHourlyWage(String jobTitle) {
        if (jobTitle.equalsIgnoreCase("entry-level")) {
            return 15.0; // minimum wage
        } else if (jobTitle.equalsIgnoreCase("manager")) {
            return 25.0; // example manager wage
        } else if (jobTitle.equalsIgnoreCase("executive")) {
            return 50.0; // example executive wage
        } else {
            System.out.println("Invalid job title.");
            return 0.0;
        }
    }
}
