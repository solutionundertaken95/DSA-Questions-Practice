package Searching;

public class Ceiling {

    private static int binarySearch(int[] arr, int target) {

        int start = 0;

        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }

        }
        return start;
    }

    public static void main(String[] args) {

        int[] num = {2,3,5,9,14,16,18};
        int target = 15;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Ceiling of NUmber in Array\n");

        int index = binarySearch(num,target);
        System.out.println("Ceiling of " +target+ " is " +num[index]);

    }
}
