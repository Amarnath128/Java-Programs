import java.util.*;
public class Factorail {
    
    public static void PrintFactorial(int num) {

        int fact =1 ;
        for(int i=num; i>=1; i--) {
        fact = fact * i;
        }
        System.out.println("The factorial is : "+fact);
        return;
    }
    public static void main(String args[])               // ........... Main............
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        PrintFactorial(num);               // call the function.
    }
}
