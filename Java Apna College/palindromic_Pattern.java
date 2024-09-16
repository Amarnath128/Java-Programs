import java.util.*;
public class palindromic_Pattern {
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enternthe number limits u want : ");
        int num = sc.nextInt();
        sc.close();

        for(int i=1; i<=num; i++) {
            
            //for spaces =
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");                    //------------here spaces has printed.
            }
            // now we will print 1st Half Numbers :      // ------------here the  1st Half Numbers.                                                    
            for(int j=i; j>=1; j--) {                    // reverse printing
                System.out.print(j);
            }
            // now we will print 2nd Half Numbers :      // ------------here the  2nd Half Numbers.                                                  
            for(int j=2; j<=i; j++) {
                System.out.print(j);
        }
        System.out.println();
    }
  }
}
/*
 .............output.........

Enternthe number limits u want : 5
    1
   212
  32123
 4321234
543212345 

*/