package Functions;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three numbers : ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int max = findMax(n1,n2,n3);
        int min = findMin(n1,n2,n3);

        System.out.println("Maximum Number is : " +max);
        System.out.println("Minimum Number is : " +min);

    }

    private static int findMin(int n1, int n2, int n3) {

        int min = 0;
        if(n1 < n2 && n1 < n3){
            return n1;
        } else if (n2 < n1 && n2 < n3) {
            return n2;
        }
        else
            return n3;

    }

    private static int findMax(int n1, int n2, int n3) {

        int max = 0;
        if(n1 > n2 && n1 > n3){
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        }
        else
            return n3;
    }
}
