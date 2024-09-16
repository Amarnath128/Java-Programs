package Labprogm1;
import java.util.Scanner;

public class Emp {
    
    int empno;
    String empName;
    float salary, hra, da, it, gp;

    // Constructor
    public Emp() {
        empno = 0;
        empName = "";
        salary = 0.0f;
        
        hra = 0.0f;
        da = 0.0f;
        it = 0.0f;
        gp = 0.0f;
    }

    // Method to get user Input
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee number: ");
        empno = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        empName = sc.next();
        System.out.print("Enter Employee Salary: ");
        salary = sc.nextFloat();
    }

    // Method to calculate salary
    public void calculatePay() {
        hra = salary * 0.1f;        // 10 %
        da = salary * 0.555f;      // 55.5%
        it = salary * 0.06f;        // 6%
        gp = salary + hra + da - it;
    }

    // Method to print output
    public void display() {
        System.out.println("**************************************");
        System.out.println("             Salary Slip              ");
        System.out.println("**************************************");
        System.out.println("\tEmployee number: " + empno);
        System.out.println("\tName: " + empName);
        System.out.println("\tBasic pay: " + salary);
        System.out.println("\tHousing Rent Allowance: " + hra);
        System.out.println("\tDearness Allowance: " + da);
        System.out.println("\tIncome Tax: " + it);
        System.out.println("\tGross pay: " + gp);
    }
}
