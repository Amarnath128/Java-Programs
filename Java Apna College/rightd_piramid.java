import java.util.*;
public class rightd_piramid {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // int num = 5;
       System.out.print("Enter the nuumber Limit : ");
       int num = sc.nextInt();
       sc.close();
        
        for(int  i = 1; i <= num; i++) {       // outer Loop

            for(int j = 1; j <= num-i ; j++) {    // inner Loop 1.      ......  n - 1  ......("    ")
                
                System.out.print(" ");
            }

            for(int j =1 ; j <=i; j++){        // inside the outer Loop another inner Loop 2. 
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}
   /*
..............the 180 degree pyramid..................
    *          
   **                      
  ***                        
 ****                     
***** 


*/ 