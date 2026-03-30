package Searching;

public class FindPeakIndexInArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,4,3,2};

        int peak = findpeakelement(arr);
        System.out.println(peak);

    }

    public static int findpeakelement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            //Increasing Section
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            //Decreasing Section
            else {
                end = mid;
            }
        }

        return start;
    }


}
