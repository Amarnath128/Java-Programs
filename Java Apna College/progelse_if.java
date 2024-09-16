import java.util.Scanner;
public class progelse_if {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        if(a > b) {
            System.out.println(a+ " Is Greater.");
        }
        else if(b > a) {
            System.out.println(b+" is Greater.");
        }
        else {
            System.out.println("Error!");
        }
    }
}
