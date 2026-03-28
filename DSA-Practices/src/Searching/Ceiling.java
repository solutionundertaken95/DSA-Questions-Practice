package Searching;

public class Ceiling {

    //Ceiling is the smallest number that is greater than or equal to the target
    // think of it like this  start   target   end
    //if target is not found, at that time while loop breaks(start > end)
    //start = end + 1
    //since it is a sorted array, the start will now point to the next greatest value to the target right
    //print the value of start index

    private static int binarySearch(int[] arr, int target) {

        int start = 0;

        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }


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
        int target = 20;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Ceiling of NUmber in Array\n");

        int index = binarySearch(num,target);
        if(index == -1){
            System.out.println("There is no ceiling since the target is the biggest number in the array");
        }
        else
            System.out.println("Ceiling of " +target+ " is " +num[index]);


    }
}
