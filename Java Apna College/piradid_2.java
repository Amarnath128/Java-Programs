import java.util.*;
public class piradid_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Limit : ");
        int n = sc.nextInt();
       // int n = 5;
       sc.close();

        for(int i=n; i>=1; i--) {
              
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* 
............outPut............

*****
****
***
**
* 

*/