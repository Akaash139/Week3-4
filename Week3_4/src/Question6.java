public class Question6 {

    public static void main(String[] args) {

        int[] arr = {10, 25, 50, 100};
        int target = 30;

        int floor = -1, ceil = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) floor = arr[i];
            if (arr[i] >= target) {
                ceil = arr[i];
                break;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
    }
}