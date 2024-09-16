import java.util.*;
public class Diamond_pattern {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number limits : ");
        int num = sc.nextInt();
        sc.close();

        // Upper Half : 
        for(int i= 1; i<=num; i++) {
            // spaces : 
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            //star: 
            for(int j=1; j <=2*i-1; j++)  {
                System.out.print("*");
            }
        System.out.println();
        }
          // Lower Half : 
          for(int i=num; i>=1; i--) {
            // spaces : 
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            //star: 
            for(int j=1; j <=2*i-1; j++)  {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

/*
 ..........output..........

Enter the number limits : 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 
    */