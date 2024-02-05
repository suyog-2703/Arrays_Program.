import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    // Function to perform binary search in an array
    public static int binarySearch(int arr[], int ele) {
        int start=0 , end=arr.length-1;
        
        while (start <= end) {
        // Calculate the middle index
            int mid = (start + end) / 2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]>ele){       
                end=mid-1;
            }
            else{
                start=mid+1;
            }    
         }
        return -1;
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

        //sort the given array for the binary serach
        Arrays.sort(arr);

        // Display the elements in the array
        display(arr);

        System.out.println("Enter the element to search in the array:");
        int ele = sc.nextInt();

        int index = binarySearch(arr, ele);

        // Display the result of the binary search
        if (index == -1) {
            System.out.println(ele + " is not present in the array");
        } else {
            System.out.println(ele + " is present in the array at index: " + index);
        }

        // Close the scanner
        sc.close();
    }
}
