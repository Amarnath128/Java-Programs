import java.util.*;
public class zero_oneJ {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of line to print : ");
        int oz = sc.nextInt();
        sc.close();

        for(int i = 1; i <= oz; i++)  {
            for(int j =1 ; j <= i; j++) {

            int sum = i + j;

                if( sum % 2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
/*
logic ------>   Even = i + j then print 1     or       Odd = i + j  then print 0 ]

Enter the number of line to print : 5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

 */