import java.util.*;
public class JwhileLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
                                     //       ............while Loop..................

        int a = 1;                                              //  1st -----  initail the value
        while (a <= n) {                                      // 2nd -----  while : till the condition.
            System.out.println(".....Amardeep.....");   // 3rd ----- print the Statement. 
            System.out.println(a);
            a++;                                 //4th -----  inctreament the initail value.
      }
    }   
}
