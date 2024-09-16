import java.util.Scanner;

public class lab3_bubble {

    Scanner sc = new Scanner(System.in);

    int[] inputArray() {
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1));
            input[i] = sc.nextInt();
        }
        return input;
    }

    void bubbleSortAscen(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    int[] bubbleSortDescen(int arr[]) {
        int n = arr.length;
        int[] descendingArr = arr.clone();  // Create a copy of the original array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (descendingArr[j] < descendingArr[j + 1]) {
                    int temp = descendingArr[j];
                    descendingArr[j] = descendingArr[j + 1];
                    descendingArr[j + 1] = temp;
                }
            }
        }
        return descendingArr;
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        lab3_bubble ob = new  lab3_bubble();

        int inputArr[] = ob.inputArray();

        // Sort in ascending order
        ob.bubbleSortAscen(inputArr);
        System.out.println("Sorted array in ascending order:");
        ob.printArray(inputArr);

        // Sort in descending order
        int descendingArr[] = ob.bubbleSortDescen(inputArr);
        System.out.println("Sorted array in descending order:");
        ob.printArray(descendingArr);
    }
}
