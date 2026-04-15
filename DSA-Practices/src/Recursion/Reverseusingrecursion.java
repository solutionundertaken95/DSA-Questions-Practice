package Recursion;

public class Reverseusingrecursion {
    public static void main(String[] args) {
        int n = 1342;

        int result = reverse(n, 0);
        System.out.println("Reverse = " + result);
    }

    private static int reverse(int n, int rev) {

        if (n == 0) {
            return rev;
        }

        int digit = n % 10;

        return reverse(n / 10, rev * 10 + digit);
    }
}