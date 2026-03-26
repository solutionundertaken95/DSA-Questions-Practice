import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number upto which you want the Fibonacci Series");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        if(n<=0){
            System.out.println("Invalid Input ");
            return;
        }

        if(n>=1){
            arr[0] = 0;
            System.out.print(arr[0] + " ");
        }

        if(n>=2){
            arr[1] = 1;
            System.out.print(arr[1] + " ");
        }


        for (int i = 2; i <n ; i++) {
            int temp = arr[i-1] + arr[i-2];
            arr[i] = temp;
            System.out.print(arr[i] + " ");


        }
    }
}
