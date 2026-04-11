package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;

        int sum = sumDigit(n);
        System.out.println("Sum = " + sum);
    }

    private static int sumDigit(int n) {

        if(n==0){
            return 0;
        }

        return (n%10) + sumDigit(n/10);
    }
}
