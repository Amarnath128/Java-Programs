import java.util.*;
public class largerNum {
    public static  void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println( a+"  is the Greater number.");
        }
        else if (b >= a && b >= c) {
            System.out.println( b+"  is the Greater number.");
        }
        else{
            System.out.println( c+ " is the Greater number.");
        }

    }
    
}
