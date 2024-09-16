import java.util.*;
public class numberPyramid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number Limit : ");
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i <= num; i++)  {
            // spaces =
            for(int j=1; j <=num-i; j++ ){
                System.out.print(" ");
            }
            // numbers =
            for(int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
/* 
.........output......

Enter the number Limit : 5
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5  

*/

