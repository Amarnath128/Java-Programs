import java.util.*;
public class JdoWhileLoops {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of Times : ");
        int num = sc.nextInt();
        sc.close();

        int i = 1;                  // 1st_initail the starting value
        do {
            System.out.println("...'-'.. Amardeep ..'-'...");            // 2nd_print the statement.
            i++;                                                     // 3rd_increament it
        }
        while(i <=num);                                           // 4th_while : till the condition reach.
    } 
}
