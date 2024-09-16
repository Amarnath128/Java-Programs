package LabProgm2;

import java.util.Scanner;

public class BubbleSort { // class 1

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

    // ======================================= method
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int arr[]) // method 2
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) { // Main method
        // TODO Auto-generated method stub
        BubbleSort ob = new BubbleSort();

        int inputArr[] = ob.inputArray();
        ob.bubbleSort(inputArr);
        System.out.println("Sorted array");
        ob.printArray(inputArr);

    }

}
