import java.util.Scanner;

public class InsertionSort{

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
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

        insertionSort(arr);

        System.out.println("Elements in the Array are after performing the insertion sort:");
        display(arr);

        // Close the scanner
        sc.close();
    }
}