import java.util.Scanner;
public class Odd_even {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter an Number : ");
        int no = read.nextInt();
        read.close();
        
        if(no % 2 == 0) {
            System.out.println(no +" is an Even Number.");
        }
        else {
            System.out.println(no+" is an Odd Number.");
        }
    }
}
