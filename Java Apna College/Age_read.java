import java.util.Scanner;
public class Age_read {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(" Enter the Age : ");
        int age = read.nextInt();
       read.close();
        if(age > 18) {
            System.out.println("The person is Adult.");
        }
        else{
            System.out.println("\n The Person is not Adult.");
        }
        
    }
}
