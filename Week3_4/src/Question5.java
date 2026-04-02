import java.util.*;

public class Question5 {
    public static void main(String[] args) {

        String[] arr = {"accA", "accB", "accB", "accC"};

        // Linear Search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("accB")) {
                System.out.println("First occurrence: " + i);
                break;
            }
        }

        // Binary Search
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, "accB");

        System.out.println("Binary index: " + index);
    }
}
