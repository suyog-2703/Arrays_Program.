import java.util.Scanner;
import java.util.*;
public class PairsArray {
    // Function to perform Pair in an array
    public static void pairsArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+current+","+arr[j]+")");
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

        pairsArray(arr);
    
        // Close the scanner
        sc.close();
    }
}
