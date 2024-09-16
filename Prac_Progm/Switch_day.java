import java.util.*;
public class Switch_day {
    public static void main(String[] args) {
        int dayno;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between ( 1 - 7 ): ");
        dayno = sc.nextInt();

        switch (dayno) {
            case 1:
                System.out.print("Monday");
                break;

            case 2:
                System.out.print("Tuesday");
                break;  
                
            case 3:
                System.out.print("Wednesday");
                break;
             
            case 4:
                System.out.print("Thursday");
                break;   
                
            case 5:
                System.out.print("Friday");
                break;    

            case 6:
                System.out.print("Saturday");
                break;   
                
            case 7:
                System.out.print("Sunday");
                break;    
        
            default:
            System.out.println(" Enter a number from 1 to 7 !!");
                break;
        }
    }
    
}
