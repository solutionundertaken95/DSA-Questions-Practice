package Searching;

public class FloorOfValue {
    //Floor is the greatest number that is smaller than or equal to the target
    // think of it like this  start   target   end
    //if target is not found, at that time while loop breaks(start > end)
    //start = end + 1
    //since it is a sorted array, the end will now point to the next greatest value that is just sammler to the target right
    //print the value of end index

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
        return end;
    }

    public static void main(String[] args) {

        int[] num = {2,3,5,9,14,16,18};
        int target = 15;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Floor of NUmber in Array\n");

        int index = binarySearch(num,target);
        System.out.println("Floor of " +target+ " is " +num[index]);

    }
}
