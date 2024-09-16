import java.util.Scanner;
public class Gross_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
    
            double grossPay = getGrossPay(name, getHourlyWage(scanner), getHoursWorked(scanner));
    
            System.out.println(name + "'s gross pay: $" + grossPay);
    
            scanner.close();
        }
    
        public static double getHourlyWage(Scanner scanner) {
            System.out.print("Enter hourly wage: ");
            double hourlyWage = scanner.nextDouble();
            return hourlyWage;
        }
    
        public static double getHoursWorked(Scanner scanner) {
            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();
            return hoursWorked;
        }
    
        public static double getGrossPay(String name, double hourlyWage, double hoursWorked) {
           
            if (hoursWorked <= 40) {
                return hourlyWage * hoursWorked;
            } else {
                return (40 * hourlyWage) + (hoursWorked - 40) * hourlyWage * 1.5;
            }
        }
    }   

