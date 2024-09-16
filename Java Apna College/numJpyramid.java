import java.util.*;
public class numJpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number Limit u want : ");
        int num = sc.nextInt();
        sc.close();

        for(int row = 1; row <= num; row++)  
            {
                for(int col = 1; col <=row; col++)
                    {
                        System.out.print(col+ " ");
                    }
                System.out.println();    
            }
    }
    
}

/*
.................outPut...........
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5  

*/