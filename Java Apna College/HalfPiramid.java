import java.util.*;
public class HalfPiramid {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int n = 5;
        
        System.out.print("Enter the number Limit : ");
        int n = sc.nextInt();
        sc.close();
        
       for(int i = 1; i <=n; i++)  {

        for(int j=1; j<=i; j++) {

            System.out.print("*");
        }
        System.out.println();
       } 
    }
}
/* 
........output.......
*
**
***
****
***** 

*/