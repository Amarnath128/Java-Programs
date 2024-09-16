import java.util.*;
public class Array_qus_toFind {
    
public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Array Size : ");
    int size = sc.nextInt();

    int numbers[] = new int[size];
   
    
    // this loop is for the inputs : 
    for(int i=0; i<numbers.length; i++)  {

        System.out.print("Enter the Element : ");
        numbers[i] = sc.nextInt();
    }

System.out.print("Enter the element u want to Find : ");      
int x = sc.nextInt();

    // this loop is for the output :
    for(int i=0; i<numbers.length; i++)  {
        if(numbers[i] == x){
            System.out.println("X found at the Index : " +i);
            sc.close();
        }
    }
  }
}
