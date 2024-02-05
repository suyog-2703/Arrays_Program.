import java.util.Scanner;
import java.util.*;
public class SmallestNumber {
    // Function to perform binary search in an array
    public static int largestNumber(int arr[]) {
        int smaller=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smaller){
                smaller=arr[i];
            }   
        }
        return smaller;  
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

        int smaller=largestNumber(arr);
        System.out.println("In the given array smallest number is :"+smaller);

        // Close the scanner
        sc.close();
    }
}
