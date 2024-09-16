import java.util.*;
public class JArray_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];          // to create an array.
       
        
        // this loop is for the inputs : 
        for(int i=0; i<size; i++)  {            // to inputs the elements .
            arr[i] = sc.nextInt();
        }


        // this loop is for the output :
        System.out.println("The elements are : ");
        for(int i=0; i<size; i++)  {

            System.out.println(arr[i]);
            sc.close();
        }
    }
}
