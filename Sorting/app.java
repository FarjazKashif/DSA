import java.util.*;

class App {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        // Bubble Sort
        int arr[] = {74, 19, 22, 0, 33};
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j]; // 19
                    arr[j] = arr[i];
                    arr[i] = temp;
                    // System.out.print(arr[i] + " ");
                }
                
            }
        }

        for(int k=0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

        
        








    }
}