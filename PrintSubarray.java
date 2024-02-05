import java.util.Scanner;
import java.util.Arrays;
public class PrintSubarray {
    // Function to perform Print Subarray  in an array
    public static void printSubarray(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int start=arr[i];
            for(int j=0;j<arr.length-1;j++){
                int end=arr[j];
                //subarray
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }

    // Function to display elements in the array
    public static void display(int arr[]) {
        System.out.println("Elements in the Array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array to store the elements
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        // Display the elements in the array
        display(arr);

        printSubarray(arr);

        // Close the scanner
        sc.close();
    }
}
