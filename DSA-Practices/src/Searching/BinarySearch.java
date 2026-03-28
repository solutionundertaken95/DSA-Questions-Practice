package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array : ");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }

        System.out.print(" The array elements are : " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Enter the element you want to search");
        int target = scanner.nextInt();

        int index = binarySearch(arr,target);
        if(index == -1){
            System.out.println("Target Not Found");
        }
        else
            System.out.println("Target found at index : " +index);
    }

    private static int  binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while(start<=end){

            int mid = (start + end)/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]> target) {
                start = mid + 1;
            } else if (arr[mid]< target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
