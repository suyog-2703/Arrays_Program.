import java.util.Scanner;

public class LinearSearch {
    // Function to perform linear search in an array
    public static int linearSearch(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i; // Return the index if element is found
            }
        }
        return -1; // Return -1 if element is not found in the array
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

        System.out.println("Enter the element to search in the array:");
        int ele = sc.nextInt();

        int index = linearSearch(arr, ele);

        // Display the result of the search
        if (index == -1) {
            System.out.println(ele + " is not present in the array");
        } else {
            System.out.println(ele + " is present in the array at index: " + index);
        }

        // Close the scanner
        sc.close();
    }
}
