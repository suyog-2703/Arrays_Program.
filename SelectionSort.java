import java.util.Scanner;

public class SelectionSort{

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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

        selectionSort(arr);

        System.out.println("Elements in the Array are after performing the selection sort:");
        display(arr);

        // Close the scanner
        sc.close();
    }
}