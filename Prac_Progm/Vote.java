import java.util.*;
public class Vote {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();

        System.out.print("Enter your Age : ");
        age = sc.nextInt();

        if(age > 18 ) {
            System.out.print("Your Name is "+name+" & You are Eligible for Voting");
        }
        else{
            System.out.println("Sorry !! " +name + " You are not Eligible for Voting.");
        }
    }
    
}
