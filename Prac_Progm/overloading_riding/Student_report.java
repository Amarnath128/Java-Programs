package overloading_riding;
import java.util.Scanner;

public class Student_report {

    static final int no_stud = 5;
    static final int no_subject = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= no_stud; i++) {
            System.out.println("Enter details for Student " + i + ":");

            System.out.print("Name: ");
            String sname = sc.nextLine();

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Registration Number: ");
            int regno = sc.nextInt();

            int marks[] = new int[no_subject];
            for (int j = 0; j < no_subject; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            // Calculate total marks and average using for loop here
            int tmark = 0;
            for (int j = 0; j < no_subject; j++) {
                tmark += marks[j];
            }
           /*  for (int mark : marks) {
                totalMarks += mark;
            } */

            /* int average = totalMarks / no_subject; */

            // Calculate percentage
            double percentage = (tmark * 100.0) / (no_subject * 100.0);

            // Determine the grade based on the percentage
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80 ) {
                grade = 'B';
            } else if (percentage >= 70 ) {
                grade = 'C';
            } else if (percentage >= 55) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display Grade Card here
            System.out.println("\nGrade Card for Student " + i + ":");
            System.out.println("Name: " + sname);
            System.out.println("Roll Number: " + roll);
            System.out.println("Registration Number: " + regno);
            System.out.println("Marks:");

            for (int j = 0; j < no_subject; j++) {
                System.out.println("Subject " + (j + 1) + " : " + marks[j]);
            }

            System.out.print("\n Total Marks: " + tmark);
          /*   System.out.print("\n Average: " + average); */
            System.out.print("\n Percentage: " + percentage + "%");
            System.out.print("\n Grade: " + grade);
            System.out.print("\n-------------------------------\n");

            // Consume the newline left in the buffer after reading int
            sc.nextLine();
        }
    }
}

