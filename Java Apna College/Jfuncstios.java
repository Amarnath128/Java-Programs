import java.util.*;

public class Jfuncstios {

    public static int calSum( int a, int b){              // .......... Function Name...........
        int sum = a + b;
    return sum;      // return a + b;
    }
    public static void main(String args[])               // ........... Main............
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int sum = calSum(a, b); 
        System.out.println(" The Sum of the two numbers : "+sum);                                 // call the function here.
        //System.out.println(" THE SUM IS : "+calSum(a, b));
    }
}
