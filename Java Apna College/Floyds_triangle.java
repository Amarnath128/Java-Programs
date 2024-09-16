import java.util.*;
public class Floyds_triangle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number limits u want to print : ");
        int num = sc.nextInt();
        sc.close(); 
        int st = 1;
        //  Outer Loop : count rows / i .
        for(int i = 1; i <= num; i++ ) {

            for(int j = 1; j <= i; j++) {    // to count the number of rows printed there.
                System.out.print(st+" ");
                st++;   
            }
            System.out.println();
        }
    }
    
}
/* 
..........output.........

Enter the number limits u want to print : 4
1 
2 3 
4 5 6 
7 8 9 10

 */