import java.util.*;
public class Opatterns {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        sc.close();;
 
        //outer Loop : row
        for(int i=1; i<=n; i++) {
            
            // inner Loop : Col
            for(int j=1; j<=n; j++) {

                if(i == 1 || j == 1 || i ==n  || j == n){        // condition : 

                    System.out.print("*");
                }
               else {
                System.out.print(" ");
               }
            }
            System.out.println();         // this is for next line after printing * .
        }
    }
}
/* Enter the number : 5
*****
*   *
*   *
*   *
*****
 */