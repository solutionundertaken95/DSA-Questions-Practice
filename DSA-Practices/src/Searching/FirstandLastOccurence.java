package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 8, 8, 9};
        int target = 8;

        int[] search = binarySearch(arr, target);
        System.out.println(Arrays.toString(search));
    }


    private static int[] binarySearch(int[] arr, int target) {

        int[] ans = {-1, -1};

        int first = search(arr, target, true);
        int second = search(arr, target, false);

        ans[0] = first;
        ans[1] = second;

        return ans;
    }

    private static int search(int[] arr, int target, boolean isCheckFirst) {
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;


        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if(isCheckFirst){
                    right = mid -1;
                }
                else{
                    left = mid + 1;
                }

            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}