import java.util.*;
public class SquPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows :");
        int row = sc.nextInt();

        System.out.print("\nEnter the numbers of coloums : ");
        int col = sc.nextInt();
        sc.close();

        // outer Loop : row
        for(int r=1; r<=row; r++){

            // inner loop : col
            for(int c=1; c<=col; c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
/*
...........output...........

Enter the number of Rows :5

Enter the numbers of coloums : 3

 *  *  * 
 *  *  * 
 *  *  * 
 *  *  * 
 *  *  *  
 
 */