package Searching;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,15,17,19};
        int target = 7;
        int index = ans(arr,target);
        System.out.println(index);

    }


    private static int ans(int[] arr, int target){

        int start = 0;
        int end = 1;


        while(target> arr[end]){


            int temp = end + 1;
            end = end + (end - start + 1 );
            start = temp;
        }

        return binarySearch(arr,target,start,end);
    }

    private static int  binarySearch(int[] arr, int target, int start, int end) {



        while(start<=end){

//            int mid = (start + end)/2;
//(might be possible that (start + end) can exceed the value of int if values of start and end are big)
            int mid = start + (end-start) / 2;
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
