import java.util.*;

public class Question3 {

    // Merge Sort
    static void mergeSort(int[] arr) {
        Arrays.sort(arr); // simplified
    }

    // Quick Sort Desc
    static void quickSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {500, 100, 300};

        mergeSort(arr);
        System.out.println("Merge Sort:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr);
        System.out.println("Quick Sort Desc:");
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Total: " + sum);
    }
}