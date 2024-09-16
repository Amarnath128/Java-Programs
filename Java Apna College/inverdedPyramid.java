import java.util.*;
public class inverdedPyramid {
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Limit u want : ");
        int num = sc.nextInt();
       sc.close();
       
       // outer Loop 
       for(int row = num; row >= 1; row--) {

               for(int col = 1; col <=row; col++) {         // inner Loop

                     System.out.print(col+ " ");
          }
          System.out.println();
       }
    }
}
/* 

Enter the Limit u want : 5

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/
