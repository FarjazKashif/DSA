import java.util.*;

class App {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        // Selection Sorting
        int arr[] = {64, 25, 12, 22, 11};
        for(int i=0; i<arr.length; i++) {
            // Lets assume arr[0] is the smallest value
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] > arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            System.out.print(arr[i] + " ");
        }
        // printArray(arr);

        








    }
}