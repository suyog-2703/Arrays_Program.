import java.util.Scanner;
import java.util.*;
public class ReverseArray {
    // Function to reverse the array
    public static void reverseArray(int arr[]) {
        int first=0, last=arr.length-1;
        while (first<last) {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;   
        }

    }

    // Function to display elements in the array
    public static void display(int arr[]) {
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
        System.out.println("Elements in the Array are:");
        display(arr);

        //call the function to reverse the array
        reverseArray(arr);

         // Display the elements in the array after reverse
        System.out.println("Elements in the Array after reverse are:");
        display(arr);

        // Close the scanner
        sc.close();
    }
}
